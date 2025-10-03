//how to create a frame
package package1;

import java.awt.GridLayout;

import javax.swing.*;

public class ss {
	public static void main(String[] args) {
		JFrame frame =new JFrame("Demo");
		frame.setSize(300,100);
		//creating a panel(panel is always create inside the frame)
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		JLabel label =new JLabel("Name");
		JTextField textField =new JTextField();
		
		JLabel address =new JLabel("Address");
		JTextArea area =new JTextArea(5, 5);
		//creating a button
		JButton button= new JButton("Submit");
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		panel.add(address);
		panel.add(area);
		frame.add(panel);
		
		frame.setVisible(true);
		
	}

}
