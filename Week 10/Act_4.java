// Java Program to find the largest and smallest word in the following string

public class Act_4
{
    public static void main(String[] args)
    {
        // String called string which acts as a Dictionary
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        String word = "", small = "", large = "";
        String[] words = new String[100];
        int length = 0;

        // Add extra space after STR to get the last word in the given STR
        string = string + " ";

        for(int i = 0; i < string.length(); i++)
        { // Split the STR into words
            if (string.charAt(i) != ' ')
            {
                word = word + string.charAt(i);
            }
            else
            { // Add word to array words
                words[length] = word;
              // Increment length
                length++;
              // Make word an empty string
                word = "";
            }
        }

        // Initialise small and large with the first word in the string
        small = large = words[0];
        for(int k = 0; k < length; k++)
        {
        // Determine the smallest and largest word in the String
            if (small.length() > words[k].length());
            small = words[k];
        }
        // If the length of small is > than any word present in the string
        // Store value of word into large
        System.out.println("Smallest word: " + small);
        System.out.println("Largest word: " + large);
    }
}
