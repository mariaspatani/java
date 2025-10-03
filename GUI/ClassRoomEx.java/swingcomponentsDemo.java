//how to create a frame
package package1;
import java.awt.FlowLayout;

import javax.swing.*;

public class ss {
	public static void main(String[] args) {
		JFrame frame =new JFrame("Demo");
		frame.setSize(500,500);
		//creating a panel(panel is always create inside the frame)
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JTextField textField =new JTextField(20);
		panel.add(textField);
		//creating a button
		JButton button= new JButton("Start");
		button.setBounds(50,50,100,100);
		panel.add(button);
		JButton button1= new JButton("Stop");
		panel.add(button1);
		frame.add(panel);
		frame.setVisible(true);
		
	}

}
