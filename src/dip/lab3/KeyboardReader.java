/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import java.util.Scanner;

/**
 *
 * @author Jackie
 */
//would implement Input
public class KeyboardReader {
    
    public String keyRead(){
        System.out.println("What is your favorite color: ");
        
        Scanner input = new Scanner(System.in);
        return input.nextLine();
        
    }
    
}
