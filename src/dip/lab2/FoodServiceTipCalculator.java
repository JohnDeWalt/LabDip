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
//    private double minBill = 0.00;
//    private String billEntryError =
//            "Error: bill must be greater than or equal to " + minBill;
    private double billAmt;
    private double tipPercent;
    

    public FoodServiceTipCalculator( double billAmt, double tipPercent) {
//        this.setServiceRating(q);
        this.billAmt = billAmt;
        this.tipPercent = tipPercent;
    }

    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(double tipPercent) {
        if(tipPercent < 0){
            throw new IllegalArgumentException("Tip cannot be lower that 0");
        }
            
        this.tipPercent = tipPercent;
    }
    @Override
    public double calcTip(){
        
        return billAmt * tipPercent;
    }
    public final void setBillAmt() {
        if(billAmt <= 0) {
            throw new IllegalArgumentException("You cant have a bill that is equal to or lower that 0!");
        }
        this.billAmt = billAmt;
    }
}
