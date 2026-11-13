import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    
    MyFrame(){

         ImageIcon icon = new ImageIcon("one.jpg");

         label = new JLabel();
         label.setIcon(icon);
         label.setBounds(100, 100, 78, 88);
         label.setVisible(false);
        
        

        button = new JButton(); // it creates a new button
        button.setBounds(200, 100, 250, 100);
        button.addActionListener(this); // it displays the ActionListener event
        // button.setIcon(icon); // display the icon on button
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic sans ", Font.BOLD , 25)); // set a font size and style
        button.setForeground(Color.blue); // color for text
        // another method to print anything when click on button 
        /*
        its easy and short way
        button.addActionListener(e -> syso("1"));
        you can remove the action listner
        
        */

        // button customizations 

        button.setText("i am goat"); // adds text on button
        button.setFocusable(false); // removes the border of the text
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());

        // button.setEnabled(false); -> this disables the button
        // if button wants to click ones and then disables so put this in actontonliteners 



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // which allow button to print something 
        if(e.getSource()==button){
            // System.out.println("your GOAT");
            label.setVisible(true);
            
        }


    }
}
