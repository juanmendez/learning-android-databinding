package info.juanmendez.databinding.service;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import info.juanmendez.databinding.BR;
import info.juanmendez.databinding.databinding.CountryViewBinding;
import info.juanmendez.databinding.model.AppViewModel;
import info.juanmendez.databinding.model.Country;
import info.juanmendez.databinding.model.CountryViewModel;
import info.juanmendez.databinding.ui.WikiActivity;

import static android.databinding.Observable.OnPropertyChangedCallback;

/**
 * Created by Juan Mendez on 9/17/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */
public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private LayoutInflater inflater;

    public static final String COUNTRYPOS = "countryPosition";

    public CountryAdapter( @NonNull  LayoutInflater inflater) {
        this.inflater = inflater;

        /**
         * Here we listen for updates from countryViewModel happening @countries.
         * Checkout countryViewModel.removeSelectedCountry()
         */
        getCountryViewModel().addOnPropertyChangedCallback(new OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int brId) {
                if(BR.countries == brId){
                    notifyDataSetChanged();
                }
            }
        });
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CountryViewBinding binding = CountryViewBinding.inflate(inflater, parent, false );
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setCountry( getCountryViewModel().getCountries().get(position) );
    }

    @Override
    public int getItemCount() {
        return getCountryViewModel().getCountries().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        Country country;

        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(v -> {
                if( getCountry() != null ){

                    getCountryViewModel().setSelectedCountry( country );

                    Context context = v.getContext();
                    Intent i = new Intent( context, WikiActivity.class);
                    context.startActivity(i);
                }
            });
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
            CountryViewBinding binding = DataBindingUtil.getBinding(itemView);
            binding.setCountrySource(country);
            binding.setAppViewModel(getAppViewModel());
        }
    }

    private AppViewModel getAppViewModel(){
        return AppViewModel.getVM();
    }

    private CountryViewModel getCountryViewModel(){
        return CountryViewModel.getVM();
    }
}
