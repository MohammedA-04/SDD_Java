class Main2 {
    private String name;

    // constructor with no parameters
    Main2()
    {
        System.out.println("Constructor Called:");
        name = "SDD";
    }

    public static void main(String[] args) {

        // constructor is invoked while
        // creating an object of the Main class
        Main2 obj = new Main2();
        System.out.println("Module name is " + obj.name);
    }
}

/*
In the above example we have created a construct named Main(),
inside the constructor, we are initialising the value of the new variable

Notice the statement of creating an object of the Main Class
Main obj = new Main();  // calls the Main() Constructor

Here when the object is created, the Main() constructor is called and the
value of the name variable is initialised

Hence, the program prints the value of the name variables as SDD
*/

