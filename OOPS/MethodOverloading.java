/*
 Author : Maria
 date:21 July 2025
 Description : Method Overloading example
 */

class Shape{
	public void area(float radius) {
		float area= 3.14f*radius*radius;//if we don't put 'f',it act as double
		System.out.println("Area of Circle: "+area);
	}
	public void area(int l,int b) {
		int area=l*b;
		System.out.println("Area of Rectangle: "+area);		
	}
	public void area(int a) {
		int area=a*a;
		System.out.println("Area of Square: "+area);		
	}
	public void area(float l,int b) {
		float area=l*b;
		System.out.println("Area of Rectangle: "+area);		
	}
	public void area(int l, float b) {
		float area=l*b;
		System.out.println("Area of Rectangle: "+area);		
	}
}
public class OverloadingDemo {
	public static void main(String[] args) {
		Shape shape=new Shape();
		shape.area(3.5f);
		shape.area(6,5);
		shape.area(5);	
		shape.area(1.3f,4);
		shape.area(4,1.3f);
	}
}
