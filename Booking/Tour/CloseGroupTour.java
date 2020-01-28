package Booking.Tour;

public class CloseGroupTour extends Tour {

    private String tourType = "CloseGroup";

    @Override
    public String getTourType() {
        return tourType;
    }

    @Override
    public double getPrice() {
        return 35;
    }
}
