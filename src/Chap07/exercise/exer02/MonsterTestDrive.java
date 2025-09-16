package Chap07.exercise.exer02;

// Monster.java
class Monster {
    // A: method for Monster
    boolean frighten(int x) {
        System.out.println("arrrgh");
        return true;
    }
}

// Vampire.java
class Vampire extends Monster {
    // B: method for Vampire
    @Override
    boolean frighten(int x) {
        System.out.println("a bite?");
        return false;
    }
}

// Dragon.java
class Dragon extends Monster {
    @Override
    boolean frighten(int degree) {
        System.out.println("breathe fire");
        return true;
    }
}

// MonsterTestDrive.java
public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();   // prints a bite?
        monsters[1] = new Dragon();    // prints breathe fire
        monsters[2] = new Monster();   // prints arrrgh

        for (int i = 0; i < monsters.length; i++) {
            monsters[i].frighten(i);  // calls correct method based on runtime type
        }
    }
}
