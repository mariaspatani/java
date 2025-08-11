/*
 Author : Maria 
 Date   : August 8 2025
 Description : Inheritance related practice qns
 */
class Shape{
	String color;
	Shape(String color){
		this.color=color;
	}
	public void displayColor() {
		System.out.println("Color: "+color);
	}
}
class Circle extends Shape{
	double radius;
	Circle(String color,double radius){
	super(color);
	this.radius=radius;	
    }
    public void calculateArea(double radius){
    	double area=3.14*radius*radius;
    	System.out.println("Area of Circle: "+area);   	
    }
}
class Rectangle extends Shape{
	double length;
	double width;
	Rectangle(String color,double length,double width){
		super(color);
		this.length=length;
		this.width=width;
	}
	public void calculateArea(double length,double width) {
		double area=length*width;
		System.out.println("Area of Rectangle: "+area);		
	}
}
public class Demo3 {
	public static void main(String[] args) {
		Circle circle=new Circle("White",2.5);
		circle.displayColor();
		circle.calculateArea(2.5);
		Rectangle rectangle=new Rectangle("Red",5.0,5.0);
		rectangle.displayColor();
		rectangle.calculateArea(5.0, 5.0);
	}
}
