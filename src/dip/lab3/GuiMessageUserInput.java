/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import javax.swing.JOptionPane;
/**
 *
 * @author Jackie
 */
public class GuiMessageUserInput implements MessageOutput {
    public void writeln (String line){
        
        String response = JOptionPane.showInputDialog(null, "Enter the first thing that comes to your head: ");
    }
    
}
