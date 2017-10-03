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
public class MessageInputAndOutput {

    public static void main(String[] args) {


        
        MessageInput input = new KeyboardMessageReader();
//      MessageOutput output = new KeyboardMessageWriter();
//      MessageOutput output = new GuiMessageWriter();
	MessageOutput output = new GuiMessageUserInput();

        MessageCopier messageCopier = new MessageCopier(input, output);
        messageCopier.message();

        
        System.out.println("Goodbye");
    }
}
