public class Act_1H_2 {
    public static void main(String[] args)
    {
        // Method calling
        System.out.println("List of even numbers: ");

        displayEvenNumbers(1, 100);
    }
    // Method that checks the number is even or not
    private static void displayEvenNumbers(int number, int end)
    {
        if(number>end)
            return;
        if(number%2==0)
        {
            // Prints the even numbers
            System.out.print(number +" ");
            // Calling method & increments number by 2 if the number is EVEN
            displayEvenNumbers(number + 2, end);
        }
        else
        {
            // Increments  number by 1 IF number is ODD
            displayEvenNumbers(number + 1, end);
        }
    }
}
