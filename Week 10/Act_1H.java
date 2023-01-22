public class Act_1H {
    public static void main(String[] args) {
        {
            // Solution 1 - For Loop

            int number= 100;
            System.out.print("List of even numbers from 1 to "+ number +": ");
            // i = 1 | continue if [i < num] | i++
            for ( int i=1; i<=number; i++ )
            {
            //logic to check if the number is even or not
            //if i%2 is equal to zero, the number is even
                if (i%2==0)
                {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
