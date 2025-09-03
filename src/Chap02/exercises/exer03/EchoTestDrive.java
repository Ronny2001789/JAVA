package Chap02.exercises.exer03;

class Echo {
    int count = 0;               // instance variable

    void hello() {               // method
        System.out.println("helloooo... ");
    }
}

public class EchoTestDrive {
    public static void main(String [] args) {
        Echo e1 = new Echo();
        Echo e2 = e1;               // e2 references same object

        int x = 0;
        while (x < 4) {             // loop 4 times
            e1.hello();             // print hello

            e1.count = e1.count + 1; // increment count by 1

            if (x == 3) {            // extra increment on last iteration
                e2.count = e2.count + 1;
            }

            if (x == 4) {            // never triggers, safe to leave
                e2.count = e2.count + e1.count;
            }

            x = x + 1;
        }

        System.out.println(e2.count); // prints 10
    }
}

