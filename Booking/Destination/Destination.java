package Booking.Destination;

import java.util.ArrayList;
import java.util.List;
import Exception.InvalidCountry;

public class Destination {

    private List<Country> countries = new ArrayList<Country>();

    public Destination(){
        Country c1 = new Country("Brazil");
        Country c2 = new Country("Argentina");
        Country c3 = new Country("Chile");
        countries.add(c1);
        countries.add(c2);
        countries.add(c3);
    }

    public Country findCountry(String countryName) {
        Country foundCountry = null;
        for(Country country : countries){
            if(country.toString().equalsIgnoreCase(countryName) ){
                foundCountry = country;
            }
        }
        if(foundCountry == null){
            throw new InvalidCountry();
        }
        return foundCountry;
    }

}

