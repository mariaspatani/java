//Parent Class
 class  Shape{
	 private  int area =57;//ivide private koduthathukond circle le area print aakilla...
	 public void printArea() {
		 System.out.println("Area :" +area);	 
 }
 }
 //Child class
 class Circle extends Shape{
	 public void hi() {
		 System.out.println("Hi, I am Circle");
	 }	 
 }
public class InheritanceDemo {
	public static void main(String[] args) {
		Circle circle =new Circle();
		//System.out.println(circle.area);
		circle.printArea();
		circle.hi();		
	}
}
