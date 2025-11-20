//Example for hiearchial inheritance
// Parent class
class Animal {
    void eat() {
        System.out.println("Animals eat food");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Main class
public class HierarchicalDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Dog Object:");
        d.eat();     // inherited method
        d.bark();    // Dog method

        System.out.println("\nCat Object:");
        c.eat();     // inherited method
        c.meow();    // Cat method
    }
}
