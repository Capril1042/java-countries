package com.cjs.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class CountryController
{

    //  return the names of all the countries alphabetically
    @RequestMapping("names/all")
    public ArrayList<Country> getAllCountries()
    {
        CountriesApplication.listOfCountries.countryList.sort((c1,c2)->
            c1.getName().compareToIgnoreCase(c2.getName()));
        return CountriesApplication.listOfCountries.countryList;
    }
    // return the countries alphabetically that begin with the given letter


    // return the country with the smallest median age
    @RequestMapping("age/min")
    public Country getCountryWithMinMedianAge()
    {
        CountriesApplication.listOfCountries.countryList.sort((c1,c2)->
                c1.getMedianAge()-(c2.getMedianAge()));
        return CountriesApplication.listOfCountries.countryList.get(0);
    }
    // return the country the the greatest median age
    @RequestMapping("age/max")
    public Country getCountryWithMaxMedianAge()
    {
        CountriesApplication.listOfCountries.countryList.sort((c1,c2)->
                c1.getMedianAge()-(c2.getMedianAge()));
        return CountriesApplication.listOfCountries.countryList.get(CountriesApplication.listOfCountries.countryList.size()-1);
    }
}
