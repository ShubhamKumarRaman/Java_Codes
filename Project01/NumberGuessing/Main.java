package NumberGuessing;

import java.util.Scanner;

public class Main {
    public static void NumberGuessingGame(int realNumber) {
        Scanner sc = new Scanner(System.in);
        int score = 10;
        while (true) {
            System.out.println("-----------------------------------");
            System.out.print("Enter Your Number: ");
            int userNumber = sc.nextInt();

            if (userNumber == realNumber) {
                System.out.println("Your won the game");
                System.out.println("Your score is : " + score);
                return;
            } else if (userNumber > realNumber) {
                System.out.println("Guess some lower value");
                score--;
            } else {
                System.out.println("Guess some greater value");
                score--;
            }

            if (score <= 0) {
                System.out.println("You loose the game...");
                return;
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("===== Number Guessing Game ====");
        int realNumber = 1 + (int) (100 * Math.random());
        NumberGuessingGame(realNumber);
    }
}
