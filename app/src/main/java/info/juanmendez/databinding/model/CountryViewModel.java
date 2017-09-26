package info.juanmendez.databinding.model;

import java.util.List;

/**
 * Created by Juan Mendez on 9/25/2017.
 * www.juanmendez.info
 * contact@juanmendez.info
 */

public class CountryViewModel {

    List<Country> countries;
    Country selectedCountry;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public Country getSelectedCountry() {
        return selectedCountry;
    }

    public void setSelectedCountry(Country selectedCountry) {
        this.selectedCountry = selectedCountry;
    }

    private static CountryViewModel countryViewModel;

    public static CountryViewModel getCountryViewModel() {
        if( countryViewModel == null ){
            countryViewModel = new CountryViewModel();
            countryViewModel.setCountries( CountryList.EU );
        }

        return countryViewModel;
    }
}