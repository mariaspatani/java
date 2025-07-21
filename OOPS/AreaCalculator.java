/*
 Author : Maria
 date:21 July 2025
 Description: AreaCalculator of Diiferent Shapes(Method Overloading)
 */

class AreaCalculator{
	public void area(double radius) {
		double area= 3.14*radius*radius;
		System.out.println("Area of Circle: "+area);
	}
	public void area(double l, double w){
		double area=l*w;
		System.out.println("Area of Rectangle: "+area);		
	}
	public void area(float b, float h){
		float area=1/2f*b*h;
		System.out.println("Area of Triangle: "+area);	
	}
	public void area(int a){
		int area=a*a;
		System.out.println("Area of Square: "+area);		
	}
	
}
public class Main1 {
	public static void main(String[] args) {
		AreaCalculator calc =new AreaCalculator();
		calc.area(3.14);
		calc.area(2.25,2.25);
		calc.area(1.38f,1.38f);
		calc.area(7);
		
	}

}
