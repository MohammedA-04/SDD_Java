import java.util.Scanner;
public class Act_1E {
    public static void main(String[] args) {
        // Scanner Class is used to get user input jus like input stmt in .py

        // Type VarName = new Type(InSystem)
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine(); // nextLine takes obj to nxtline

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by the user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }
}
