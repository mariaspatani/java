/*
 Author : Maria
 date:21 July 2025
 Description: Calculator(Method Overloading)
 */

class Calculator{
	public void  add(int a, int b) {
		int add=a+b;
		System.out.println("Addition of two integers: "+ add);
	}
	public void  add(int a, int b,int c) {
		int add=a+b+c;
		System.out.println("Addition of three integers: "+ add);
	}
	public void  add(double a, double b) {
		double add=a+b;
		System.out.println("Addition of two double values: "+ add);
	}
	public void  add(String s,int a) {
		String add= s+a;
		System.out.println("Concatenation Result: "+add);
	}
}
public class Main {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.add(1,3);
		calculator.add(1,3,5);
		calculator.add(2.55,2.55);
		calculator.add("M",8);
	}

}
