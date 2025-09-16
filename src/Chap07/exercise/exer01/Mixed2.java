package Chap07.exercise.exer01;

public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        // Call methods to display output
        a.m1();
        a.m2();
        c.m3();

        System.out.println(); // optional line break

        b.m1();
        b.m2();
        b.m3();

        System.out.println();

        a2.m1();
        a2.m2();
        a2.m3();
    }
}

