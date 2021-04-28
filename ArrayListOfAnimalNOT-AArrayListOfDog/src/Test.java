import java.io.IOException;

abstract class Animal{};

class Dog extends Animal{};
 
public class Test {
     public static void main(String[] args) { //Line 10
    	 
    	 // Dog IS-A Animal
    	 Animal d = new Dog();
    	 
    	 // ArrayList of Dog IS-NOT-A ArrayList of Animal    	 
    	 // Same logic applies to basic arrays and all containers
    	 ArrayList<Animal> animals = new ArrayList<Dog>();
     }
}