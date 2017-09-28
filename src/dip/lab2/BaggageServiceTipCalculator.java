package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    private double minBill = 0.00;
    private double maxBill = 100.00;
    private String billEntryError = "Error: bill must be between " + minBill + " and "+ maxBill;
  
    private double baseTipPerBag;
    private int bagCount;

    public BaggageServiceTipCalculator( int bagCount, double baseTipPerBag) {
         // perform validation
        this.setBagCount(bagCount);
        baseTipPerBag = 1.00; // set default value
    }
    @Override
    public double calcTip(){
        
        return bagCount * baseTipPerBag;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
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
        if(baseTipPerBag < 1.00) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to 1.00");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
