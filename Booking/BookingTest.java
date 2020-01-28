package Booking;

import Booking.Destination.Destination;
import LocadoraDeCarros.exception.InvalidDayQty;
import org.junit.Test;
import Exception.InvalidCountry;
public class BookingTest {

    @Test (expected = InvalidCountry.class) public void ifInsertAnInvalidCioutryShouldReturnException(){
        //inputs
        String country = "Brazil";

        Destination destination = new Destination();

        destination.findCountry(country);

    };
};
//
//    @Test (expceted = exception) public double ifInsertAnInvalidStateShouldReturnException(){
//        //inputs
//        String state = "Rio Grande do Sul";
//    };
//
//    @Test (expceted = exception) public double ifInsertAnInvalidCityShouldReturnException(){
//        //inputs
//        String city = "Porto Alegre";
//    };
//    @Test (expceted = exception) public double ifInsertAnInvalidDateShouldReturnException(){};
//
//    @Test (expceted = exception) public double ifInsertAnInvalidGroupTypeShouldReturnException(){};
//
//}
