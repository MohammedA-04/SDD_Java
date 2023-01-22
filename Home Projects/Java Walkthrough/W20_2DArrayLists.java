import java.util.*;

public class W20_2DArrayLists {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList(); // New **ARRAY** List

        ArrayList<String> bakeryList  = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList  = new ArrayList<>();
        produceList.add("Potatoes");
        produceList.add("Peppers ");
        produceList.add("Corn");

        ArrayList<String>  drinkList = new ArrayList<>();
        drinkList.add("Soda");
        drinkList.add("Tea");

        groceryList.add(bakeryList); // Adding Sublist[s] to 'GroceryList'
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(" - Print bakeryList = " +bakeryList+ "\n");

        // Get a specific INDEX printed then use .get method
        System.out.println(" - Print Index 3 at bakeryList = " +bakeryList.get(2)+ "\n");

        // Printing 2D ArrayLists [bakeryList n produceList n drinkList ]
        System.out.println(" - Print 2-D ArrList called 'groceryList' \n" +groceryList+ "\n");

        // Printing [Index 0] in ArrList | E.g., arrListName.get(enter index number));
        System.out.println(" - 2-D ArrList Index 0 \n" +groceryList.get(0)+ "\n");

        // Printing [List 1 Index 1] | E.g., arrListName.get(1).get(1);
        System.out.println(" - 2-D ArrList Index 2 of List 'produceList'\n" + groceryList.get(1).get(1)+ "\n");


// *** Notes via CodeBro Tutorial ***
// 2D ArrLists = Dynamic list of a list[s]
//             = You can change the size of these lists during .exe
    }
}

/* 2-Dimensional Array Lists

~ You create an Array List 'GroceryList'
~ Creating LISTS within the List 'GroceryList' called 'BakeryL, ProduceL, DrinkL'

~ ON L22-25 I have mentioned the name of the ArrayList called 'GroceryList' and have used the keyword .add to add the
following sublist to grocerylist: 'BakeryL, ProduceL, DrinkL'

~ L26 = Telling Java to print out sublist 'BakeryL'
For Example
~~ Code   | System.out.println(" - Print bakeryList = " +bakeryList+ "\n");
~~ Result | - Print bakeryList = [Pasta, Garlic Bread, Donuts]

~ L29 = By using the .get method in the s.out println it allows us to print specified indexes within the sublist
For Example
~~ Code   | System.out.println(" - Print Index 3 at bakeryList = " +bakeryList.get(2)+ "\n");
~~ Result | - Print Index 2 at bakeryList = Donuts

~ L32 = Tells Java to print out the entire 2D List by mentioning 'GroceryList'
~ Code   | System.out.println(" - Print 2-D ArrList called 'groceryList' \n" +groceryList+ "\n");
~ Result | - Print 2-D ArrList called 'groceryList'
[[Pasta, Garlic Bread, Donuts], [Potatoes, Peppers , Corn], [Soda, Tea]]

~ L35 = Printing the Grocerylist.get(position:0); Tells Java to print that list the In Index Mentioned
I.e., Grocerylist.get(0); = BakeryList | Grocerylist.get(1); = ProduceList | Grocerylist.get(2); = DrinkList
~ Code   | System.out.println(" - 2-D ArrList Index 0 \n" +groceryList.get(0)+ "\n");
~ Result |  - 2-D ArrList Index 0 [Pasta, Garlic Bread, Donuts]

~ L38 = Using successive .get.get tells java to get the [ Item 0 in List 0 ]
* */
