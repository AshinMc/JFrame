import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        // creating a main window
        JFrame frame = new JFrame("Hello, World!");

        //setting window size
        frame.setSize(300, 300);

        //close window when close button pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adding a button
        JButton button = new JButton("Click me!");

        //adding a Panel
        JLabel label = new JLabel("Waiting for you my lord");


        //Add an action listener to the button
        button.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                label.setText("Heck Yes, Button!");
            }
        }));
        //creating panel
        JPanel panel = new JPanel();
        //adding stuff to panel
        panel.add(button);
        panel.add(label);

        //adding panel to frame
        frame.add(panel);

        //show window
        frame.setVisible(true);

    }
}