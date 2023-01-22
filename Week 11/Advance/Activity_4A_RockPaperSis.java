package Advance;

import java.util.Random;
import java.util.Scanner;

/* public class Activity_4A_RockPaperSis {
    public static void main(String[] args) {

       }
    } */

import java.util.Random;
import java.util.Scanner;

public class Activity_4A_RockPaperSis
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rounds of Rock-Paper-Scissors would you like to play?");
        int rounds = Integer.parseInt(scanner.nextLine()); // Rounds == Input

        for (int i = 0; i < rounds; i++)
        { playRockPaperScissors(scanner); } // Change static void down below by Input
    }

    static void playRockPaperScissors(Scanner scanner)
    {
        // Getting input from the user | (rock/paper/scissors)
        System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        // Getting input from the computer | Randomly chooses a number 0-1-else
        /// Imports random module
        /// if 0 rock | if 1 paper | if none scissors
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0)
        { computerMove = "rock"; }

        else if (randomNumber == 1)
        { computerMove = "paper"; }

        else
        { computerMove = "scissors"; }

        System.out.println("Computer chose " + computerMove + "!");

        // Print results
        if (playerMove.equals(computerMove))
        { System.out.println("It's a draw!"); }

        else if (playerWins(playerMove, computerMove))
        { System.out.println("Player wins!"); }

        else
        { System.out.println("Computer wins!"); }
    }

    static boolean playerWins(String playerMove, String computerMove)
    {
        if (playerMove.equals("rock"))
        { return computerMove.equals("scissors"); }

        else if (playerMove.equals("paper"))
        { return computerMove.equals("rock"); }

        else
        { return computerMove.equals("paper"); }
    }
}


