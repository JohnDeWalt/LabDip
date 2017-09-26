package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator {
    private double minBill = 0.00;
    private String billEntryError =
            "Error: bill must be greater than or equal to " + minBill;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    private double bill;
//    public enum ServiceQuality {
//        GOOD, FAIR, POOR
//    }
//    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator( double billAmt) {
//        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

//        switch(serviceQuality) {
//            case GOOD:
//                tip = bill * GOOD_RATE;
//                break;
//            case FAIR:
//                tip = bill * FAIR_RATE;
//                break;
//            case POOR:
//                tip = bill * POOR_RATE;
//                break;
//        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(billEntryError);
        }
        bill = billAmt;
    }

//    public final void setServiceRating(ServiceQuality q) {
//        // No need to validate because enums provide type safety!
//        serviceQuality = q;
//    }
//
//    public ServiceQuality getServiceQuality() {
//        return serviceQuality;
//    }

}
