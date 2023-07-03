package Java_Week.Java_Week_19.Example_Enum_2;

import Java_Week.Java_Week_18.Person;

public class EnumTut {
    public static void main(String[] args) {

        System.out.println(Cereals.WHEATBISKS.lvlDeliciousness);
        System.out.println(Cereals.WHEATBISKS.price + "\n");
        // The field int lvlDeliciousness] is now final to not allow value changes
        MostLikedCereal();
    }

    public static void MostLikedCereal() {
        int maxDeliciousness = Integer.MIN_VALUE;
        Cereals mostLikedCereal = null;

        for (Cereals cereal : Cereals.values()) {
            if (cereal.lvlDeliciousness > maxDeliciousness) {
                maxDeliciousness = cereal.lvlDeliciousness;
                mostLikedCereal = cereal;
            }
        }

        if (mostLikedCereal != null) {
            System.out.println("Most Liked Cereal:");
            System.out.println("Cereal: " + mostLikedCereal);
            System.out.println("Deliciousness Level: " + mostLikedCereal.lvlDeliciousness);
            System.out.println("Price: " + mostLikedCereal.price);
        }

        // Works out High £££
        double maxPrice = Double.MIN_VALUE; // £1.99 is double?!!
        Cereals mostExpensiveCereal = null; // Set to null

        for (Cereals cereal : Cereals.values()) {

            // Targeting "£" and removing for this variable
            String priceWithoutSymbol = cereal.price.replace("£", "");

            // Type casting priceWithoutSymbol (as it was a STR)
            double doublePrice = Double.parseDouble(priceWithoutSymbol);

            // Double is index 0 price then stored as MP then compare until Cereals.values() exhausted
            if (doublePrice > maxPrice) {
                maxPrice = doublePrice;
                mostExpensiveCereal = cereal;
            }
        }

        System.out.println("\nTest which cereal crazy beans " + mostExpensiveCereal);

        if (mostExpensiveCereal != null) {
            System.out.println("\nMost Expensive Cereal:");
            System.out.println("Cereal: " + mostExpensiveCereal);
            System.out.println("Deliciousness Level: " + mostExpensiveCereal.lvlDeliciousness);
            System.out.println("Price: " + mostExpensiveCereal.price);
        } else {
            System.out.println("No cereals found.");
        }

    }
}