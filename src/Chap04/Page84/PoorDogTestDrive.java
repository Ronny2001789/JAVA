package Chap04.Page84;

// A simple class representing a dog with two private properties
// A simple class representing a dog with two private properties
class PoorDog {
    // instance variables (fields), private means only this class can access them directly
    private int size;
    private String name;

    // Getter method to return the value of size
    public int getSize() {
        return size;
    }

    // Getter method to return the value of name
    public String getName() {
        return name;
    }
}

// Test class with main method to run the program
public class PoorDogTestDrive {
    public static void main(String[] args) {
        // Create a new PoorDog object
        PoorDog one = new PoorDog();

        // Since we never set size and name, they use default values:
        // int → 0, String → null
        System.out.println("Dog size is " + one.getSize());   // prints "Dog size is 0"
        System.out.println("Dog name is " + one.getName());   // prints "Dog name is null"
    }
}



