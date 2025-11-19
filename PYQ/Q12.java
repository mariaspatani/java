/*Create a class Outer with a private int variable outer_x = 100.
Add a method test() inside Outer to print outer_x.
Inside Outer, define a non-static inner class Nested with a method display() that also prints outer_x.
Create another class NonstaticNestedDemo with the main() method to:
    Create an object of Outer
    Call its test() method
    Create an object of Nested and call its display()*/
// Outer.java
class Outer {
    private int outer_x = 100;
    void test() {
        System.out.println("outer_x = " + outer_x);
    }
    // Non-static inner class
    class Nested {
        void display() {
            System.out.println("Inside Nested class, outer_x = " + outer_x);
        }
    }
}
// Main class
public class NonstaticNestedDemo {
    public static void main(String[] args) {
        // Creating object of Outer
        Outer outerObj = new Outer();
        outerObj.test();
        // Creating object of Nested class
        Outer.Nested nestedObj = outerObj.new Nested();
        nestedObj.display();
    }
}
