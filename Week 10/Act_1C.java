public class Act_1C {
    public static void main(String[] args) {
        // Task Using Prefix and Postfix Operators
        // Prefix  = Operand Value Incremented Instantly
        // Postfix = Value after Var name is increment and prev val is temp held
        int a = 20, b = 10, c = 0;

        // a=b+++c is compiled as
        // b++ + c  |  a=b+c then b=b+1
        // A = 10 [A=B+C]| B = 11 [B++ = B+=1] | C = 0
        a = b++ + c;
        System.out.println("Value of a(b+c), "
                + " b(b+1), c = " + a + ", " + b + ", " + c);

        /* a=b+++++c is compiled as
        // b++ ++ +c
        // which gives an error.
        // a=b+++++c;
           System.out.println(b+++++c); */

    }
}
