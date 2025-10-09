import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SmartCalculator extends JFrame implements ActionListener {
private JTextField display;
private double num1, num2, result;
private String operator;
private boolean isOperatorClicked = false;
public SmartCalculator() {
setTitle("Grid Layout Calculator");
setSize(320, 420);
setLocationRelativeTo(null);
setLayout(new BorderLayout(10, 10));
// ===== Top Panel: Display =====
JPanel displayPanel = new JPanel(new GridLayout(1, 1));
display = new JTextField();
display.setFont(new Font("Arial", Font.BOLD, 28));
display.setHorizontalAlignment(SwingConstants.RIGHT);
display.setEditable(false);
displayPanel.add(display);
add(displayPanel, BorderLayout.NORTH);
// ===== Center Panel: Number & Operator Buttons =====
JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 10, 10));
String[] buttons = {
"7", "8", "9", "/",
"4", "5", "6", "*",
"1", "2", "3", "-",
"0", ".", "=", "+"
};
for (String text : buttons) {
JButton btn = new JButton(text);
btn.setFont(new Font("Arial", Font.BOLD, 20));
btn.addActionListener(this);
buttonPanel.add(btn);
}
add(buttonPanel, BorderLayout.CENTER);
// ===== Bottom Panel: Clear Button =====
JPanel clearPanel = new JPanel(new GridLayout(1, 1));
JButton clearBtn = new JButton("C");
clearBtn.setFont(new Font("Arial", Font.BOLD, 22));
clearBtn.setBackground(new Color(220, 53, 69)); // red tone
clearBtn.setForeground(Color.WHITE);
clearBtn.addActionListener(this);
clearPanel.add(clearBtn);
add(clearPanel, BorderLayout.SOUTH);
setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
String cmd = e.getActionCommand();
if (cmd.matches("[0-9]") || cmd.equals(".")) {
if (isOperatorClicked) {
display.setText("");
isOperatorClicked = false;
}
display.setText(display.getText() + cmd);
}
else if (cmd.matches("[+\\-*/]")) {
try {
num1 = Double.parseDouble(display.getText());
operator = cmd;
isOperatorClicked = true;
} catch (Exception ex) {
display.setText("Error");
}
}
else if (cmd.equals("=")) {
try {
num2 = Double.parseDouble(display.getText());
switch (operator) {
case "+": result = num1 + num2; break;
case "-": result = num1 - num2; break;
case "*": result = num1 * num2; break;
case "/":
if (num2 == 0) {
display.setText("Error");
return;
}
result = num1 / num2;
break;
}
display.setText(String.valueOf(result));
} catch (Exception ex) {
display.setText("Error");
}
}
else if (cmd.equals("C")) {
display.setText("");
num1 = num2 = result = 0;
operator = "";
}
}
public static void main(String[] args) {
new SmartCalculator();
}
}
