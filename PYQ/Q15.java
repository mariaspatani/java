/*   Create a class Box that uses a parameterized  constructor to  initialize the dimensions        (5)
 of a box.The dimensions of the Box arc width, height, depth. The
 class should have a method that can return the volume of the box. Create an object of
 the Box class and test the functionalities.*/
class Box {
    double width, height, depth;
    // Parameterized constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        // Create object
        Box b = new Box(3.0, 4.0, 5.0);

        double vol = b.volume();
        System.out.println("Volume of Box = " + vol);
    }
}
