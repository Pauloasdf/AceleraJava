package Booking.Tour;

public class PublicGroupTour extends Tour{

    private String tourType = "PublicGroup";

    @Override
    public String getTourType() {
        return tourType;
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
