package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private double minBill = 0.00;
    private String billEntryError =
            "Error: bill must be greater than or equal to " + minBill;
    private double billAmt;
    private double tipPercent;
    

    public FoodServiceTipCalculator( double billAmt, double tipPercent) {
//        this.setServiceRating(q);
        this.billAmt = billAmt;
        this.tipPercent = tipPercent;
    }
    @Override
    public double calcTip(){
        
        return billAmt * tipPercent;
    }
    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(billEntryError);
        }
        billAmt = billAmt;
    }
}
