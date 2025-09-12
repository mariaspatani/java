import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {
		//JLabel= a GUI display area for a string of text,an image, or both
		JLabel label =new JLabel();//create a label
		label.setText("Bro,do you even code?");//set text of label
		ImageIcon image= new ImageIcon("/C:/Users/HP/.eclipse/JAVA_Programs/Pract5/src/clear.png");
		Border border=BorderFactory.createLineBorder(Color.green,3);
		
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);//set text left, center , right of imageicon
		label.setVerticalTextPosition(JLabel.TOP);//set text top,center,bottom of image
		label.setForeground(new Color(0xFF456));
		label.setFont(new Font("MV Boli",Font.PLAIN,50));
		label.setIconTextGap(-25);//set gap b/e image and text
		label.setBackground(Color.BLACK);
		label.setOpaque(true);//set bg color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(100,100,250,250);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(null);
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
	}
}
