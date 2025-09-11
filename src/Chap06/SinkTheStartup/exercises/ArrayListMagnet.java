package Chap06.SinkTheStartup.exercises;

import java.util.ArrayList;

public class ArrayListMagnet {

    public static void main(String[] args) {
        // Step 1: create ArrayList
        ArrayList<String> a = new ArrayList<String>();

        // Step 2: add elements at specific positions
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");

        // Step 3: print initial list
        printList(a);  // Output: zero  one  two  three

        // Step 4: remove element at index 2 ("two")
        a.remove(2);
        printList(a);  // Output: zero  one  three

        // Step 5: check for "two" and optionally add "2.2"
        if (a.contains("two")) {
            a.add("2.2");
        }

        // Step 6: check for "three" and add "four"
        if (a.contains("three")) {
            a.add("four");
        }
        printList(a);  // Output: zero  one  three  four

        // Step 7: check position of "four" and maybe add "4.2"
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printList(a);  // Output: zero  one  three  four  4.2

        // Step 8: final print (unchanged)
        printList(a);  // Output: zero  one  three  four  4.2
    }

    // Helper method to print list elements
    public static void printList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }
}
