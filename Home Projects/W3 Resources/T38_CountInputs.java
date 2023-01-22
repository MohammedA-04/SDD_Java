import java.util.Scanner;

public class T38_CountInputs
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Seconds: ");
            int seconds = in.nextInt();
            int S = seconds % 60; // Seconds % by 60;
            int H = seconds / 60; // Divide / by 60;
            int M = H % 60;       // H % 60
            H = H / 60;           // Hours / 60
        System.out.println( H + ":" + M + ":" + S );
        System.out.println("\n");
    }
}
