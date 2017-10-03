/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Jackie
 */
public class KeyboardMessageWriter implements MessageOutput {

     public void writeln( String line ) {
            System.out.println("Here is your message");
            System.out.println( line );
	}   
 
}
