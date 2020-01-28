package Booking.Tour;

public class PrivateTour extends Tour{

    private String tourType = "Private";

    @Override
    public String getTourType() {
        return this.tourType;
    }

    @Override
    public double getPrice() {
        return 50;
    }

}
