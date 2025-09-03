package Chap03.exercises.exer02;

class TestArrays {
    public static void main(String[] args) {
        String[] islands = new String[4];
        int[] index = new int[4];

        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        index[0] = 1;  // Fiji
        index[1] = 3;  // Cozumel
        index[2] = 0;  // Bermuda
        index[3] = 2;  // Azores

        int y = 0;
        int ref;

        while (y < 4) {
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}

