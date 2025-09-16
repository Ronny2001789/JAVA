package Chap07.exercise.exer03;

public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();

        b2.setLength(32);

        b1.move(); // drift
        b3.move(); // drift
        b2.move(); // hoist sail
    }
}

