public class W27_Constructor_OOP {

    public static void main(String[] args) {
        W27_Constructor_OOP_Human human1 = new W27_Constructor_OOP_Human("Ahmed",18,65.00);
        W27_Constructor_OOP_Human human2 = new W27_Constructor_OOP_Human("Rick", 65, 70.25);
        // System.out.println(human2.name);

        human1.eat();
        human2.drink();
    }
}

/* Notes - Constructors

~ Constructor allows us to create different OBJECTS which have different characteristics
~ Parameters

Main Class | W27_Constructor_OOP

~ Created a new object called Human1 and Human2
~ Human1 is Ahmed 18 65.00
~ Human2 is Rick 65 70.25

Sub Class | W27_Constructor_OOP_Human

~ Listed all the variables
~ Parameters must match the variables

When variable eat and drink are invoked they are paired with human
~ human1.eat();   | Ahmed is eating
~ human2.drink(); | Rick is drinking
* */