import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        // Creating main window
        JFrame frame = new JFrame("Hello, Ashin!");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating buttons
        JButton button = new JButton("Click me!");
        JButton button2 = new JButton("Close!");

        //creating text field
        JTextField textField = new JTextField(20);


        // Adding a label
        JLabel titleLabel = new JLabel("Waiting for your text", SwingConstants.CENTER);

        // Action listener for button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredText = textField.getText(); // Get text from field
                titleLabel.setText("You entered: " + enteredText); // Display it in the label
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Creating main panel
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Adding label to top
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Setting button panel (FlowLayout to prevent stretching)
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Adding buttons to button panel
        buttonPanel.add(textField);
        buttonPanel.add(button);
        buttonPanel.add(button2);

        // Adding button panel to main panel
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Adding main panel to frame
        frame.add(mainPanel);

        // Show window
        frame.setVisible(true);
    }
}
