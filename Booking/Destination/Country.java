package Booking.Destination;

import java.util.ArrayList;
import java.util.List;

public class Country {

    private String name;
    private List<State> states = new ArrayList<State>();

    public Country(String countryName){
        this.name = countryName;
    }

    public State findState(String stateName) {
        State foundState = null;
        for(State state : states){
            if(state.toString() == stateName ){
                foundState = state;
            }
        }
        return foundState;
    }
}
