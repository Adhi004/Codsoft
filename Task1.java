import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guess the Number game!");
        String playAgain = "yes";
        int score = 0;

        while (playAgain.equalsIgnoreCase("yes")) {
            int lowerLimit = 1;
            int upperLimit = 100;
            int secretNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
            int maxAttempts = 3; // Limiting the number of attempts to 3
            int attempts = 0;

            System.out.println("I'm thinking of a number between " + lowerLimit + " and " + upperLimit + ".");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + secretNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        }

        System.out.println("Thanks for playing! Your score is based on the number of correct guesses: " + score);
        scanner.close();
    }
}
