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
public class MessageCopier {
    private MessageInput input;
    private MessageOutput output;

    public MessageCopier(MessageInput input, MessageOutput output) {
        this.input = input;
        this.output = output;
    }
    
    public void message(){
        String line = input.readln();
        output.writeln(line);
    }
}
