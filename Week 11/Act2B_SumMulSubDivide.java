import java.util.Scanner;

public class Act2B_SumMulSubDivide
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Number 1: ");
        int n1 = in.nextInt();
        System.out.println("Input Number 2: ");
        int n2 = in.nextInt();

        System.out.println( n1 + " + " + n2 + " = " + (n1+n2) );
        System.out.println( n1 + " - " + n2 + " = " + (n1-n2) );
        System.out.println( n1 + " x " + n2 + " = " + (n1*n2) );
        System.out.println( n1 + " / " + n2 + " = " + (n1/n2) );
        System.out.println( n1 + " % " + n2 + " = " + (n1%n2) );
    }
}

/*
- Input One = 125
- Inout Two = 24
*/
/*
Expected Output
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 % 24 = 5
*/
