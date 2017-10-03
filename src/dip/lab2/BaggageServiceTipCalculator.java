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
    private double baseTipPerBag;
    private int bagCount;

    public BaggageServiceTipCalculator( int bagCount, double baseTipPerBag) {
  
        this.bagCount = bagCount;
        this.baseTipPerBag = baseTipPerBag; 
    }
    @Override
    public double calcTip(){
        
        return bagCount * baseTipPerBag;
    }

    public final int getBagCount() {
        return bagCount;
    }
    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to 0");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
