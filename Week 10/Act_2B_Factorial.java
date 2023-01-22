public class Act_2B_Factorial {
    public static void main(String[] args) {
        int i = 1; /**/ int factorial = 1;
        //It is the number to calculate factorial
        int number = 4;
        for ( i=1 ; i<=number; i++ ) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+ number +" is: "+ factorial );
    }
}
