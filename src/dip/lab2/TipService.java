/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Jackie
 */
public class TipService {
    
   private TipCalculator calc;

    public TipService(TipCalculator calc) {
        this.calc = calc;
    }
    
    public double calcTip(){
       return calc.calcTip();
    }

    public TipCalculator getCalc() {
        return calc;
    }

    public void setClac(TipCalculator calc) {
        if (calc == null){
             throw new NullPointerException();
        }
        this.calc = calc;
    }
}
