package Chap08.exercises.exer02;

interface Nose {
    int iMethod();
}

abstract class Picasso implements Nose {
    public int iMethod() {
        return 7;
    }
}

class Acts implements Nose {
    public int iMethod() {
        return 5;
    }
}

class Clowns extends Picasso {
    // iMethod() inherited → returns 7
}

class Of76 implements Nose {
    public int iMethod() {
        return 0; // placeholder
    }
}

public class PoolPuzzle {
    public static void main(String[] args) {
        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();
        for (int x = 0; x < 3; x++) {
            System.out.println(i[x].iMethod() + " class " + i[x].getClass().getSimpleName());
        }
    }
}

