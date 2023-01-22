public class W22_Methods {
    public static void main(String[] args) {
        // *** Notes via BroCode Tutorial ***
        // Method = Block of code that is executed whenever it's called upon

        // Calling the method here....
        String name = "Bro";
        int age = 21;
        hello(name, age);

    }

    // Normally static isn't needed but we need for now
    static void hello(String name, int age){        // performs same thing | hello(String poo)
        System.out.println("Hello " +name);         // sout("Hello" + poo)  -> Outputs =  Hello Bro
        System.out.println("You are " +age);
    }
}

/* Notes - Returning A Method

~ Method Code Block which is executed when invoked

~ Method includes
~~ String called name = "Bro"
~~ Integer called age = 21
~~ hello(name,age) is used to invoke the items within the method

~ Static Void hello(String name, int age)
~~ Here invoking String name, int age
~~ So by calling them it will print Hello + Name\n  You Are + Age(21)\n
*/



/* Notes - Return Types

public class Main
{
    public static void main(String[] args)
    {
        int x=3;
        int y=4;
        int z = add(x,y);
        System.out.println(z); // or sout(add(x,y));
        // Display sum = 7
    }
    static int add(int x, int y) {
        int z = x + y; // return x + y instead these 2 lines
        return z;
    }
}

Notes
~ Static |  int(return type e.g. int) | add() which is the method name
~ You'll also need to mention a return type as-well inorder for this to work

~~ Inorder to call the add() method we need to pass in the TWO Arguments which in L42-43
~~ E.g., add(int x, int y)

~ Int z is mentioned TWICE once in a global and local
~~ S.out will print out 'z' which is 7 [L46]

~ To shorten the method we need to return
~ return x + y
*/