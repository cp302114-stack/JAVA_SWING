import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Borderr {

    public static void main(String[] args) {

        // Layout manager = Defines the natural layout for components within the container

        // common managers

        // BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER
        //                All extra space is placed in the center area

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10,10)); // gap or margine we can give a values 
        
        

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

        /*
        i also add panel inside another panels how i want in which panel if i want a 
        5 panels in 5th panel so i can add that toooo
        
        
        
        
        */

        frame.setVisible(true);
       

    }
}