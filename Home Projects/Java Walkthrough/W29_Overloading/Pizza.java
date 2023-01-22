package W29_Overloading;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }   // These are overloading ~ IF encase there is any order that are specific

    Pizza(String bread, String sauce, String cheese){
        // E.x. Pizza == Bread + Sauce + Cheese
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }

}
