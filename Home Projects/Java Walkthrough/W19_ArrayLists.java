import java.util.ArrayList;

public class W19_ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");    // Adding: Pizza, Burger and Sausage to the Array List
        food.add("Burger");
        food.add("Sausage");

        food.set(0, "Kebab"); // Set: Replaces STR
        food.remove(2);
        // food.clear();      // Clear: Clears the entire ArrayList

        for(int i=0; i<food.size(); i++){
            // For Loop: 'I' is an Int with value of 0 (Start);
            // For Loop: If 'I' is less than the size of (ArrayList) Food (Stop);
            // For Loop: ArrList 'Food' then add one to the counter of 'I' (Step);

            // Here the system prints out the Food ArrayList and .get the Index 0
            System.out.println(food.get(i));
        }
    }
    // ArrayList = It's a resizable array
    //           = Elements can be added and removed after compilation phase
    //           = Store reference data types
}


/* Notes
~ Set on L12  = Set replaces things stored

For Example
~~ ArrayListName.set(index, "ReplaceName");

~~~ ArrayListName = Is the name of the ArrayList
~~~ .set    = Is the keyword to replace item in a ArrList
~~~ .remove = Is the keyword to item in a ArrList

~~~ [.set] | (1,"Cat"); =  When using .set is being used then you'll need to specify (Index , "Ltr that will replace it")
~~~ [.replace] | (index:2); = When using .replace is used then  you'll specify index your replacing

* */