import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Grid{


    public static void main(String[] args) {
        
        // Layout Manager = Defines the natural layout for components within the container

        // GridLayout = places a componets in a grid of cells
        //              each components takes all the available space within its cell,
        //              and each cell is the same size

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3,3,10,0));  // creats a grid display that can divdes in to rows and coloums as much we want
        // new GridLayout(row,col,hro,ver);


        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
      



        frame.setVisible(true);

    }
}