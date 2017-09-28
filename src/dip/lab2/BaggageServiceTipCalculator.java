package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator {
    private double minBill = 0.00;
    private double maxBill = 100.00;
    private String billEntryError = "Error: bill must be between " + minBill + " and "+ maxBill;
  
    private double baseTipPerBag;
    private int bagCount;
//    (should be in a different class if you want) public enum ServiceQuality {
//        GOOD, FAIR, POOR
//    }
//    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator( int bags) {
         // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    public double getTipForBaggeHandler() {
        double tip = 0.00; // always initialize local variables

        return tip;
    }

//    public final void setServiceRating(ServiceQuality q) {
//        // No need to validate because enums provide type safety!
//        serviceQuality = q;
//    }

//    public ServiceQuality getServiceQuality() {
//        return serviceQuality;
//    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
