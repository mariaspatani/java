class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
 class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
 }
 public class Main {
    public static void main(String[] args) {
      Animal animal = new Cat();//if instead of cat it is 'Animal':the output will be 'Animal makes a sound'
      animal.sound(); // Output: Cat meows
     }
 }
