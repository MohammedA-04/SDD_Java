import java.util.ArrayList;

public class W21_ForEachLoop {
    public static void main(String[] args) {

     String[] animalz = {"cat", "dog", "rat", "robin"}; // Animal String: With Animals Inside

    System.out.println("Printing an Array via For-each loop");
     // For each string i in [:] animals array
    for(String i : animalz){
         System.out.println(i);
     }

    ArrayList<String> animals = new ArrayList<String>();
    animals.add("Hamster");
    animals.add("Mice");
    animals.add("Terrier");

    System.out.println("\nPrinting an ArrList via For-each loop");
    // Same concept above - ':' == In | DataType LTR : arrListName
    for(String j : animals){ // Another Example | for( int l : animals)
        System.out.println(j);
    }
    }
}
// *** Notes via BroCode Tutorial ***
// For-each loop = Traversing technique iterate through the elements in an Array/Collection
//               = Fewer Steps & More Readable
//               = Less Flexible

/* Notes - For Each Loop

~ To Create a new string
~~ String[]  *then*  Name   = { "" , "" };

For Example
Code | String[] animalz = {"cat", "dog", "rat", "robin"};

~ To Print out a new a string we can use a For Loop in a PSVM
~~ for(String i : animalz){System.out.println(i);}
~~ Telling Java to print I th element in "Animalz" which is String
~~~ Note concept above - ':' == In | DataType LTR : arrListName

Example Result = Cat\n  Dog\n Rat\n Robin\n
* */

/* New Array List on L14 called 'Animals'

~ Contains these items via animals.add("Meow")
~ Animals Contains = Hamster, Mice, Terrier

* */