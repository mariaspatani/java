import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class TemperatureConverterDemo extends JFrame implements ActionListener {
	private JTextField inputField, resultField;
    private JButton toCelsiusBtn, toFahrenheitBtn, clearBtn;
	public TemperatureConverterDemo(){
		setTitle("Temperature Converter");
        setSize(550, 220);
        setLayout(new BorderLayout(10, 10));

        // Input and result panel
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        JLabel inputLabel = new JLabel("Enter Temperature:");
        inputField = new JTextField();
        JLabel resultLabel = new JLabel("Converted Value:");
        resultField = new JTextField();
        resultField.setEditable(false);

        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(resultLabel);
        inputPanel.add(resultField);

        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        toCelsiusBtn = new JButton("Convert to Celsius");
        toFahrenheitBtn = new JButton("Convert to Fahrenheit");
        clearBtn = new JButton("Clear");

      

        // Add action listeners
        toCelsiusBtn.addActionListener(this);
        toFahrenheitBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        // Add buttons to panel
        buttonPanel.add(toCelsiusBtn);
        

        // Add panels to frame
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null); // Center the window
        setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		double input = Double.parseDouble(inputField.getText());
		double celsius = (input-32)*5/9;
		resultField.setText(String.format("%.2f °C", celsius));
	}
	public static void main(String[] args) {
		new TemperatureConverterDemo();

	}

}
