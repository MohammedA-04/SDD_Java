public class Act_2D_ASCII {
    public static void main(String[] args) {
        char ch='A';
        int  i=ch;
        System.out.println( "ASCII Value of " + ch + " = " + i );

        // Number Checker whether it's negative or positive
        int num = -912;
        if (num>0)
        {
            System.out.println("The number is positive");
        }
        else if (num<0)
        {
            System.out.println("The " + num + " is negative");
        }
        else
        {
            System.out.println("The number is ZERO");
        }
    }
}
