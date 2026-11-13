import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.*;

class Frames{
    public static void main(String[] args) {
        
        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame(); // actual initialization
        frame.setTitle("Caluclator"); // it set a title in that window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application when we close that
        frame.setResizable(false); // prevent frame from being resize
        frame.setSize(420,420);// sets the x- dimensons and y- dimensons of frame
        frame.setVisible(true); // make frame visible

        // how to change logo when we open the window of that frame 
        // normaly its in java logo but we can change that 

        ImageIcon image = new ImageIcon("images.png"); // creat an imageicon
        frame.setIconImage(image.getImage()); //change icon of frame

        // changeing background color
        frame.getContentPane().setBackground(Color.black);

        // another method is givin a or creating our own color by giving a rgb valeus
        // frame.setContentpane.setBackground(new color(0,0,0))





    }
}