package info.juanmendez.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import java.util.List;

import info.juanmendez.databinding.BR;

/**
 * Created by Juan Mendez on 9/25/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */

public class CountryViewModel extends BaseObservable{

    List<Country> countries;

    Country selectedCountry;

    @Bindable
    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
        notifyPropertyChanged(BR.countries);
    }

    /**
     * the user can remove selected country from the list.
     * thereafter, we notify of the change through Binding Resource id.
     * Checkout CountryAdapter @line 36
     * @param view
     */
    public synchronized void  removeSelectedCountry(View view){
        if( selectedCountry != null ){
            this.countries.remove(selectedCountry);
            notifyPropertyChanged(BR.countries);
        }
    }

    @Bindable
    public Country getSelectedCountry() {
        return selectedCountry;
    }

    public void setSelectedCountry(Country selectedCountry) {
        this.selectedCountry = selectedCountry;
        notifyPropertyChanged(BR.selectedCountry);
    }

    private static CountryViewModel countryViewModel;

    public static CountryViewModel getVM() {
        if( countryViewModel == null ){
            countryViewModel = new CountryViewModel();
            countryViewModel.setCountries( CountryList.EU );
        }

        return countryViewModel;
    }
}