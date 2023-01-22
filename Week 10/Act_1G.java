public class Act_1G {
    public static void main(String[] args) {
        // Task - Reversing While and For Loop
        // Given Output = 123456 | Expect Output = 654321

        // Steps
        // 1. Find remainder of given number and add remainder into it
        // 2. Multiply the variable by reverse 10 and add rem onto it
        // 3. Divide number by 10
        // Repeat until num becomes 0

        // Solution 1 - For Loop
        /*
        int num = 123456, reverse = 0;

        for (; num != 0; num = num / 10)
    {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
    }
        System.out.println("Reverse of the given number is: " + reverse);
    }   */

        // Solution 2 - While Loop
        {
            // Run While LOOP until num becomes 0
            int num = 987654, reverse = 0;
            // Run until num is 0
            while (num != 0)
            {

                // Get last digit from num
                int remainder = num % 10; // Round 1 = num%10 = 4
                reverse = reverse * 10 + remainder;

                // Remove last digit from num
                // Round 1 = 987654/10 = 98765.4 -> 98765 [***INT***]
                num = num / 10;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }
    }
}