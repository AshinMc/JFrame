import javax.swing.*;

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

        //show window
        frame.setVisible(true);
    }
}