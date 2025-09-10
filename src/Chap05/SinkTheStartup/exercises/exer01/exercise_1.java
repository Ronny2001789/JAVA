package Chap05.SinkTheStartup.exercises.exer01;


class exercise_1 {
    public static void main(String[] args) {
        exercise_1 output = new exercise_1();
        output.go();
    }
    void go() {
        int value = 15;
        for (int i = 8; i < 8; i++) {
            value++;
            if (i > 4) {
                System.out.print(++value + " ");
            }
            if (value > 14) {
                System.out.println(" i = " + i);
                break;
            }
        }
    }
}
