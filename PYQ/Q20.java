//ButtonClicked
import javax.swing.*;
import java.awt.event.*;

public class SimpleSwing implements ActionListener {

    JFrame frame;
    JButton button;
    JTextField textField;

    SimpleSwing() {

        frame = new JFrame("Simple Swing Example");
        button = new JButton("Click Me");
        textField = new JTextField();

        textField.setBounds(50, 50, 200, 30);
        button.setBounds(100, 100, 100, 40);

        // Registering listener
        button.addActionListener(this);

        frame.add(button);
        frame.add(textField);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Event handling method
    public void actionPerformed(ActionEvent e) {
        textField.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new SimpleSwing();
    }
}
