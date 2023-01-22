import java.util.Scanner;

// Task 37 - Reverse a string
// Reverse string: xof nworb kciuq ehT
public class T37_ReverseStatement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Creating Scanner Obj called obj
        System.out.print("Input a string: ");     // Tells the user to input chars

        // Letters in the scanner are stored in an array called letters
        char[] letters = scanner.nextLine().toCharArray();
        // System will then print out the Reverse String!
        System.out.print("Reverse string: ");

        for (int i = letters.length - 1; i >= 1; i--)
        // Counter I, says to START at SPOT Index -1
        // Counter says if it's = or > to 0 then take 1 away from len
        {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}

/// E.g., Len is 5(n-1) | E.g. abc bcd -> abc bc
//  d  --> dc --> dcb --> dcb c --> dcb cb --> dcb cba | Process
// The reason why i>= 0 is set to 0 is that we want to reverse from INDEX 1 to INDEX X[-1]