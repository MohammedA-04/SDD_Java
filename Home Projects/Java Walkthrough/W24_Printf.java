public class W24_Printf {
    public static void main(String[] args) {
        // printf() =  an optional method to control, format and display text to the console
        //          =  two arguments = format string + (object/variable/value)
        //          =  % [flags] [precision] [width] [conversion-character]

        System.out.printf("This is a format string %d\n", 123);
        // %d == Decimal printed | Position of [%] Is the print location

        // Variables Created
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [Conversion Character ~ Specifiers]
        System.out.printf("%b\n", myBoolean);  // %b = Boolean Specifier
        System.out.printf("%c\n", myChar);     // %c = Character Specifier | E.g., 'hi@!'
        System.out.printf("%s\n", myString);   // %s = String
        System.out.printf("%d\n", myInt);      // %d = Decimal
        System.out.printf("%f\n", myDouble);   // %f = float OR double == ("%f")

        // Note ~ Double places decimal point after number (6 decimal places)
        // E.g., 100.12 -> 100.120000

        // [Width ~ Specifiers]
        // minimum num of chars to be written as a output
        System.out.printf("\nHello %-10s\n", myString);

        // [Precision ~ Specifiers]
        // Sets the numbers of digits of precision when output a FLOAT val...
        // E.g., %.2f = 1000.00 to 2 d.p.
        System.out.printf("\nYou have this much money %.2f\n", myDouble);

        // [Flags ~ Specifiers]
        // adds an effect to output based on the flag added to specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("\nYou have this much money %,f", myDouble);
    }
}

/* Notes: Print Function

Format Specifiers
~ You can use %b, %c, %s, %d and %c to print out variable via   s.out.printf("%_\n", variable);

Specifiers - Width // Not Sure
~ Which min num of characters to be written | E.g., s.out.printf("Hello %-10s\n", myString);
~~ Prints at-least 10 characters as : Hello Bro

Specifiers - Precision
~ Is the decimal points and hence declaring the level of precision
~~ %.4f for 40 -> 40.0000

Specifiers - Flags
~ Based on the flag it adds an effect to the OUTPUT
~~ %,f comma which separates number which are grouped if > 1000
~~ %+d + argument 123 -> +123
~~ %-6s + "abc" -> 'abc '
~~ %(d + -2014 -> (2014)
* */