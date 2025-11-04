// Point out the significance of 'this' keyword with an example
/*he this keyword in Java is a reference variable that refers to the current object. Its significance lies in its ability to differentiate
  between instance members (fields and methods) and local variables/parameters that share the same name within a method or constructor.
🌟 Significance of the this Keyword
The primary uses and significance of this are:
   1. Differentiating between Local Variables and Instance Fields (Shadowing): When a local variable or method parameter has the same name as an instance field, this.
  is used to explicitly refer to the instance field.
   2.Calling the Current Class's Constructor: It allows one constructor to invoke another constructor within the same class (constructor chaining).
   3. Passing the Current Object Reference: It can be passed as an argument to another method, effectively passing a reference to the object 
  on which the method was called.
   4. Returning the Current Object: It can be returned from a method, often used in method chaining (Fluent Interface design).*/
class Employee {
    // 1. Instance Field
    String name;
    int id;

    // 2. Constructor Chaining Example: Calls the 2-argument constructor below
    public Employee(String name) {
        this(name, 999); // 'this()' calls another constructor in the same class
        System.out.println("Partial constructor executed.");
    }

    // 1. Field Differentiation Example: Resolving shadowing
    public Employee(String name, int id) {
        // 'this.name' refers to the instance field 'name'
        // 'name' refers to the parameter 'name'
        this.name = name; 
        this.id = id;
        System.out.println("Full constructor executed for: " + this.name);
    }

    public void displayInfo() {
        // 3. Passing current object reference (though not explicitly shown in call here, 
        // 'this' is implicitly used when calling a method from another method of the same object)
        System.out.println("Employee ID: " + this.id + ", Name: " + this.name); 
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        // Test Constructor Chaining and Field Differentiation
        Employee emp1 = new Employee("Alice");
        emp1.displayInfo();
        
        System.out.println("---");

        Employee emp2 = new Employee("Bob", 101);
        emp2.displayInfo();
    }
}
//output Analysis:-
/*Full constructor executed for: Alice
Employee ID: 999, Name: Alice
Partial constructor executed.
---
Full constructor executed for: Bob
Employee ID: 101, Name: Bob*/
