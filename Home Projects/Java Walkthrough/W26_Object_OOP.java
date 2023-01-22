public class W26_Object_OOP {
    public static void main(String[] args) {

        // Object = an instance of a class that may contain 'attributes' and 'methods'
        // Ex: (Phone, Desk, Computer, etc)


        // Attributes ~ Characteristics that OBJ has
        // Methods ~ Actions OBJ can perform

        W26_Object_OOP_Car myCar1 = new W26_Object_OOP_Car();
        // So 'myCar1' has attributes of the W26_CAR_CLASS
        W26_Object_OOP_Car myCar2 = new W26_Object_OOP_Car();


        System.out.println(myCar1.model);
        // To display ATTRIBUTE of 'myCar1' we use '.'
        // Example | System.out.println(myCar.colour) == Blue
        System.out.println(myCar1.colour);
        System.out.println(myCar1.make);
        System.out.println(myCar1.year);
        System.out.println(myCar1.price);

        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);


        // Calling or Invoking a 'method'
        System.out.println(); //  == \newline
        myCar1.drive();
        myCar1.brake();
    }
}

/* Notes - Objects

Object is an instance of a class which may contain "Attributes" or "Methods"
~~ Attributes = Characteristics that OBJECT has
~~ Methods = Actions that OBJECT can perform


To Create New Object | E.g., Car
~ SubClassName Car1 = new SubClassName
~ W26_Object_OOP_Car myCar1 = new W26_Object_OOP_Car();

Note ~ W26_Object_OOP_Car is another class

You can print out the "Attributes" which set in the subclass W26_Object_OOP_Car
~ To do this you print (object-name.attributename)
~ println("mycar2.model");

We can also invoke a method by mentioning object-name.method-name
~ myCar1.brake();

*/