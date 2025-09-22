/*
Author : Maria
Date  : Sept 23 2025
Description: Write a Java program to create an abstract class Employee with
abstract methods calculateSalary() and displayInfo(). Create
subclasses Manager and Programmer that extend the Employee class
and implement the respective methods to calculate salary and
display information for each role.
*/
// Abstract class Employee
abstract class Employee {
    protected String name;
    protected int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract methods
    abstract double calculateSalary();
    abstract void displayInfo();
}

// Manager subclass
class Manager extends Employee {
    private double basicSalary;
    private double bonus;

    public Manager(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("--------------------------");
    }
}

// Programmer subclass
class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Programmer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("--------------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 50000, 10000);
        Programmer programmer = new Programmer("Bob", 102, 500, 160);

        manager.displayInfo();
        programmer.displayInfo();
    }
}

