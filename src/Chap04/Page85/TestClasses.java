package Chap04.Page85;

class Horse {
    private double height = 15.2;  // Example property
    private String breed;          // Another property
    // You could add getters, setters, or other methods here...
}

class AddThing {
    int a;         // will default to 0
    int b = 12;    // initialized with 12

    // Method to add a + b and return result
    public int add() {
        int total = a + b;
        return total;
    }
}

class Foo {
    // Method that calculates something and returns an int
    public int go() {
        int x = 5;
        int z = x + 3; // 8
        return z;      // returns 8
    }
}

public class TestClasses {
    public static void main(String[] args) {
        // Create AddThing object
        AddThing at = new AddThing();
        at.a = 5; // assign value to 'a'
        System.out.println("Sum is: " + at.add()); // prints "Sum is: 17"

        // Create Foo object
        Foo myfoo = new Foo();
        System.out.println("sum is: " + myfoo.go()); // prints "Result is: 8"
    }
}

