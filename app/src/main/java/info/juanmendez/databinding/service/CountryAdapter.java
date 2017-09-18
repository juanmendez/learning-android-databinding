package info.juanmendez.databinding.service;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import info.juanmendez.databinding.databinding.CountryViewBinding;
import info.juanmendez.databinding.model.Country;

/**
 * Created by Juan Mendez on 9/17/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Country> countries;

    public CountryAdapter( @NonNull  LayoutInflater inflater, @NonNull  List<Country> countries) {
        this.inflater = inflater;
        this.countries = countries;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CountryViewBinding binding = CountryViewBinding.inflate(inflater, parent, false );
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setCountry( countries.get(position) );
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        Country country;

        public ViewHolder(View itemView) {
            super(itemView);
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
            CountryViewBinding binding = DataBindingUtil.getBinding(itemView);
            binding.setCountrySource(country);
        }
    }
}
