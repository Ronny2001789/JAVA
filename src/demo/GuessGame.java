package demo;

import java.util.Scanner;

class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Chapter 2: variables & types
        int secret = (int) (Math.random() * 10); // Chapter 5: casting + Math.random()
        int guess;
        int attempts = 0;

        System.out.println("🎲 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 0 and 9. Can you guess it?");

        // Chapter 3 & 4: loops + conditionals
        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == secret) {
                System.out.println("✅ Correct! The number was " + secret);
                System.out.println("You got it in " + attempts + " tries.");
                break; // Chapter 5: break statement
            } else if (guess < secret) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Chapter 5: arrays + loops
        System.out.println("\nLet’s print your past guesses with an array example!");
        int[] guesses = new int[attempts];
        for (int i = 0; i < attempts; i++) {
            guesses[i] = i + 1; // just filling with numbers 1..attempts
        }

        System.out.print("Attempts array: ");
        for (int num : guesses) {
            System.out.print(num + " ");
        }
    }
}

