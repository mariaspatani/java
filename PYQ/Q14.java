/* Write a Java program to create an abstract class Employee with
 abstract methods calculateSalary() and displayInfo(). Create
 subclasses Manager and Programmer that extend the Employee class
 and implement the respective methods to calculate salary and
 display information for each role.*/
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();
    abstract void displayInfo();
}

// Manager class
class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Manager Salary = " + salary);
    }

    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager ID: " + id);
    }
}

// Programmer class
class Programmer extends Employee {
    double salary;

    Programmer(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Programmer Salary = " + salary);
    }

    void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Programmer ID: " + id);
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {

        Manager m = new Manager("Alice", 101, 50000);
        Programmer p = new Programmer("Bob", 102, 40000);

        m.displayInfo();
        m.calculateSalary();

        p.displayInfo();
        p.calculateSalary();
    }
}
``
