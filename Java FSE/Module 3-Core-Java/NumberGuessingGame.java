import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Guess the number (1 to 100):");
            
            while (true) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                
                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! The number was " + numberToGuess);
                    break;
                }
            }
        }
    }
}
