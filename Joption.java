import javax.swing.*;

class Joption{
    public static void main(String[] args) {
        
        // JOption = pop up a standsrd dialog box that promotes users for a value 
        //              or informs them of something

        // JOptionPane.showMessageDialog(null, "bro do you even code?","title" , JOptionPane.PLAIN_MESSAGE);
        // we have a diffrent type of messages like 
        /*                                     ----->• JOptionPane.INFORMATION_MESSAGE
	• Icon: A blue circle with a lowercase "i".
	• Usage: For successful processes, notifications, or general updates.
            ------->• JOptionPane.ERROR_MESSAGE
	• Icon: A red circle or square containing a white "X".
	• Usage: For invalid data entries, system crashes, or broken processes.
                 ----------->• JOptionPane.WARNING_MESSAGE
	• Icon: A yellow triangle with an exclamation point ("!").
	• Usage: For high-stakes operations that require caution, like file deletions.
                ----------->• JOptionPane.QUESTION_MESSAGE
	• Icon: A blue question mark ("?").
	• Usage: Typically paired with confirmation boxes asking for user choices.
                       --------------->• JOptionPane.PLAIN_MESSAGE
	• Icon: No icon whatsoever.
	• Usage: For minimalist dialogs or when you intend to supply your own custom ImageIcon.

        
        
        how to do message show infinetsly 
        while(true){
            JOptionPane.showMessageDialog(null, "bro do you even code?","title" , JOptionPane.PLAIN_MESSAGE); }
        
        
        
        
        */                              
        // we can ask question also 

       // JOptionPane.showConfirmDialog(null, "bro do you even code?", "reality", JOptionPane.YES_NO_CANCEL_OPTION);
        // we can also take a input from user
        String[] responses = {"no you good","ththt","blusg"};
        ImageIcon icon = new ImageIcon("two.jpg");
        //String name = JOptionPane.showInputDialog("what is your name?:");
        //System.out.println("hello" + name);
        JOptionPane.showOptionDialog(null, "toy ", "dra", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, null, 0);

    }
}
