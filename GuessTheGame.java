import java.util.*;

public class GuessTheGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computerChoice = 0, userChoice = 0, chancesLeft = 6;
        computerChoice = ((int) (Math.random() * 10) + (int) (Math.random() * 10)) + 1;

        System.out.println("Please Enter your Guess:");

        while (chancesLeft != 0) {
            userChoice = scanner.nextInt();
            if (computerChoice == userChoice) {
                System.out.println("Gotcha! You Guessed it Right!");
                System.out.println("Chances used: " + (6 - chancesLeft));
                break;
            } else if (userChoice > computerChoice) {
                System.out.println("Your Guess is too High!");
                chancesLeft--;
            } else if (userChoice < computerChoice) {
                System.out.println("Your Guess is too Low!");
                chancesLeft--;
            }

        }

        if (chancesLeft == 0) {
            System.out.println("Ouch! Please try Later");
        }

    }
}

// Method to generate random number with upperbound as 20(exclusive). + 1 to
// include 20 as
// Random random = new Random();
// computerChoice = random.nextInt(20) + 1;
// System.out.println(computerChoice);