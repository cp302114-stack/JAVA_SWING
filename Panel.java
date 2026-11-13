import java.awt.BorderLayout;
import java.awt.Color;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class Panel{
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("HI NOOB");

        ImageIcon icon = new ImageIcon("one.jpg");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        // JPanel = a GUI component that functions as a container to hold other components

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);// creates a color container
        redpanel.setBounds(0, 0, 250, 250); // displays where it should be
        redpanel.setLayout(new BorderLayout());


        JPanel bluPanel = new JPanel();
        bluPanel.setBackground(Color.blue);
        bluPanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);

        



  
        JFrame frame = new JFrame();
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        redpanel.add(label);
        frame.add(redpanel);
        frame.add(bluPanel);
        frame.add(greenPanel);
    }
}
