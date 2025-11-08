/*Deseribe the two difPerent ways to creat€ fames using Swing package with (5)
 appropriate exurrylcs*/

/*1. Extending the JFrame Class

In this approach, you create a new class that inherits from the javax.swing.JFrame class.
This allows you to treat your custom class as a frame and define its properties and components within the class's constructor or methods*/

import javax.swing.JFrame;
public class MyFrameExtended extends JFrame {
    public MyFrameExtended() {
        setTitle("Frame via Extension"); 
        setSize(400, 300);             
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);              
    }
    public static void main(String[] args) {
        new MyFrameExtended(); 
    }
}
/*2. Creating an Instance of the JFrame Class 

In this approach, you create an ordinary class (it doesn't have to extend JFrame) and then create an object (or instance) of 
the javax.swing.JFrame class within a method (like main) or a constructor.*/

import javax.swing.JFrame;
public class MyFrameInstance {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Frame via Instantiation"); 
        frame.setSize(400, 300);                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);                
    }
}
