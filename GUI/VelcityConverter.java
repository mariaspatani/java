/* Develop a swing application that allows input velocity in Kilometers/Hour,
   convert and display in Meters/Second. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VelocityConverter extends JFrame implements ActionListener {
    private JTextField kmPerHourTextField;
    private JTextField metersPerSecondTextField;

    public VelocityConverter() {
        setTitle("Velocity Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel kmPerHourLabel = new JLabel("Velocity (km/h):");
        kmPerHourTextField = new JTextField();
        JLabel metersPerSecondLabel = new JLabel("Velocity (m/s):");
        metersPerSecondTextField = new JTextField();
        metersPerSecondTextField.setEditable(false);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        panel.add(kmPerHourLabel);
        panel.add(kmPerHourTextField);
        panel.add(metersPerSecondLabel);
        panel.add(metersPerSecondTextField);
        panel.add(new JLabel());
        panel.add(convertButton);

        add(panel);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        VelocityConverter vc = new VelocityConverter();
        vc.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double kmPerHour = Double.parseDouble(kmPerHourTextField.getText());
        double metersPerSecond = kmPerHour * 1000 / 3600;
        metersPerSecondTextField.setText(String.format("%.2f", metersPerSecond));
    }
}
