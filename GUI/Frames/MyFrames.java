import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrames extends JFrame {
	  MyFrames(){
		 this.setTitle("JFrame title goes here");
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the application
		 this.setResizable(false);//prevent frame from being resized
		 this.setSize(420,420);//set x and y dimension
		 this.setVisible(true);
		 
		 ImageIcon image = new ImageIcon("clear.png");//create imageicon
		this.setIconImage(image.getImage());//change icon of the frame
		this.getContentPane().setBackground(Color.BLUE);//change color of the background
	
	}
}
