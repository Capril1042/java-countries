package com.cjs.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class CountryController
{

    //  return the names of all the countries alphabetically
    @RequestMapping("names/all")
    public ArrayList<Country> getAllCountries()
    {
        CountriesApplication.listOfCountries.countryList.sort((c1, c2) ->
                c1.getName().compareToIgnoreCase(c2.getName()));
        return CountriesApplication.listOfCountries.countryList;
    }

    // return the countries alphabetically that begin with the given letter
    @RequestMapping("names/begin")
    public ArrayList<Country> getCountriesThatStartWith(@RequestParam(value = "letter") String letter)
    {
        ArrayList<Country> byLetter = new ArrayList<Country>();

        for (Country c : CountriesApplication.listOfCountries.countryList)
        {

            if (c.getName().toLowerCase().startsWith(letter.toLowerCase()))
            {
                byLetter.add(c);
            }
        }
        return byLetter;

    }

    // return the countries alphabetically that have a name equal to or longer than the given length
    @RequestMapping("names/size")
    public ArrayList<Country> getCountriesByLengthEqualOrLarger(@RequestParam(value = "letters") int size)
    {
        ArrayList<Country> bySize = new ArrayList<Country>();
        for( Country c :CountriesApplication.listOfCountries.countryList)
        {
            if (c.getName().length() >= size)
            {
            bySize.add(c);
            }
        }
        return bySize;
    }
    // return the countries that have a population equal to or greater than the given population
    @RequestMapping("population/size")
    public ArrayList<Country> getCountriesWithPopEqualOrBigger(@RequestParam(value = "people") int pop)
    {
        ArrayList<Country> byPop = new ArrayList<Country>();
        for( Country c :CountriesApplication.listOfCountries.countryList)
        {
            if (c.getPopulation() >= pop)
            {
                byPop.add(c);
            }
        }
        return byPop;

    }
    // return the country with the smallest population
    @RequestMapping("population/min")
    public Country getCountryWithMinPopulation()
    {
        CountriesApplication.listOfCountries.countryList.sort((c1,c2)->
                c1.getPopulation()-(c2.getPopulation()));
        return CountriesApplication.listOfCountries.countryList.get(0);
    }
    // return the country with the largest population
    @RequestMapping("population/max")
    public Country getCountryWithMaxPopulation()
    {
       CountriesApplication.listOfCountries.countryList.sort((c1,c2)->
                c1.getMedianAge()-(c2.getMedianAge()));
        return CountriesApplication.listOfCountries.countryList.get
                (CountriesApplication.listOfCountries.countryList.size()-1);
    }

    // return the countries that have a median age equal to or greater than the given age
    @RequestMapping("age/age")
    public ArrayList<Country> getCountriesWithAgeEqualOrLarger(@RequestParam(value = "age") int age)
    {
        ArrayList<Country> byAge = new ArrayList<Country>();
        for( Country c :CountriesApplication.listOfCountries.countryList)
        {
            if (c.getMedianAge() >= age)
            {
                byAge.add(c);
            }
        }
        return byAge;

    }
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
        return CountriesApplication.listOfCountries.countryList.get
                (CountriesApplication.listOfCountries.countryList.size()-1);
    }
}
