import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class Lable{
    public static void main(String[] args) {
        
        // JLable = a GUI display area for a stright of text , an image , or both

        ImageIcon image = new ImageIcon("one.jpg");
        Border border = BorderFactory.createLineBorder(Color.pink ,5 ); // it set the border 


        JLabel label = new JLabel(); // create a lable
        label.setText("Bro , do you even code?"); // adds a text in main window
        label.setIcon(image);
        // seting text position in hr or vr  

        label.setHorizontalTextPosition(JLabel.CENTER);  // set text , left , center , right of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text top , center , bottom of imageicon
        label.setForeground(Color.pink);// set a color of text
        label.setFont(new Font("MV Boil", Font.PLAIN, 50)); // set a font of text
        label.setIconTextGap(100); // set a gap of text to image
        label.setBackground(Color.black); // set a background color 
        label.setOpaque(true); // allow or display the background color
        label.setBorder(border);// it display the border
        label.setVerticalAlignment(JLabel.CENTER); // set vertical pos of icon+image within the lable {top,left,bottom,center,right}
        label.setHorizontalAlignment(JLabel.CENTER); // same but in Horizontal
        //label.setBounds(100, 100, 400, 400); // set x , y pos within frame as well as dimensions





        JFrame frame = new JFrame();
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        frame.setTitle("calculator");
        frame.add(label);
        frame.pack();// sizes takes a compenet sizes and add lable then pack other wise it wont work
        





    }
}
