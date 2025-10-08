import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField textField;
    private double num1, num2, result;
    private char operator;

    Calculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout(5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // cannot maximize or resize

        // Center the window on screen
        setLocationRelativeTo(null);

        // Text field (display)
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 22));
        textField.setHorizontalAlignment(SwingConstants.RIGHT); // right align like real calculator
        textField.setEditable(false);
        textField.setBackground(Color.WHITE);
        add(textField, BorderLayout.NORTH);

        // Main panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.setPreferredSize(new Dimension(60, 40)); // smaller buttons
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        // Clear button
        JButton clearBtn = new JButton("C");
        clearBtn.setFont(new Font("Arial", Font.BOLD, 18));
        clearBtn.setBackground(Color.LIGHT_GRAY);
        clearBtn.setPreferredSize(new Dimension(60, 40));
        clearBtn.addActionListener(this);
        add(clearBtn, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.equals(".")) {
            textField.setText(textField.getText() + s);
        } 
        else if (s.equals("C")) {
            textField.setText("");
            num1 = num2 = result = 0;
        } 
        else if (s.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        } 
        else {
            num1 = Double.parseDouble(textField.getText());
            operator = s.charAt(0);
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
