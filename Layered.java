import javax.swing.*;
import java.awt.*;

class Layered{


    public static void main(String[] args) {
        
        // JLayeredPane = Swing Container that provides a 
        //                third dimension for posting components 
        //              ex . depth , z-index

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200, 200);

        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100, 100, 200, 200);

        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150, 150, 200, 200);



        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label2,JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label3,JLayeredPane.DRAG_LAYER); // this does blue box on top and other on low
        // we cant remamber all the layered name so insted of layer name we can use integer value => integer.valueof(1);
        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);








    }

}