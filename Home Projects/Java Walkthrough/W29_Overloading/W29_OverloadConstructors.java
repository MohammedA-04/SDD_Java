package W29_Overloading;

public class W29_OverloadConstructors {

    public static void main(String[] args) {

        // Overload Constructor =  Multiple constructor within a class with the same time,
        //                      =  but have different parameters
        //                      =  name + parameters = signature

        Pizza SpicySpecial = new Pizza("Thin Crust", "Tomato Puree", "Mozzarella", "Chili");
        System.out.println("Here are the ingredients of ya pizza: ");
        System.out.println("- " + SpicySpecial.bread);
        System.out.println("- " + SpicySpecial.sauce);
        System.out.println("- " + SpicySpecial.cheese);
        System.out.println("- " + SpicySpecial.topping);
    }
}
