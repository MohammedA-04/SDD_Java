public class Act_1I {
    public static void main(String[] args) {
        // Task - Write program to count total number of char in following str

        // Method
        // 1. Start
        // 2. Define String String = "The best of both worlds"
        // 3. SET count = 0;
        // 4. SET i=0
        // Repeat Steps 5 to 6 until i<string.length()
        // 5. if(string.charAt(i)!='') then count = count + 1
        // 6. I = I + 1
        // 7. PRINT count
        // 8. END

        String string = "The best of both worlds";
        int count = 0;

        // Counts each character except space
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++; // i = not ' ' then count++
        }
        System.out.println("Total number of character in a string" + count);
    }
}
