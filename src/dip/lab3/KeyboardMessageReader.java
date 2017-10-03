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
public class KeyboardMessageReader implements MessageInput {
    
    public String readln(){
        
        System.out.println("Please enter a message: ");
        
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
}
