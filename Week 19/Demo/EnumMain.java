package Java_Week.Java_Week_19.Demo;

public class EnumMain {
    public EnumMain() {
    }

    public static void main(String[] args) {
        ProductType productType = ProductType.DRINK; // Object made and its equal to ProductType.DRINK
        System.out.println(productType);             // Will print the values in the ProductType Class

        ProductType[] var2 = ProductType.values();  // Returns all the values in the ProductType Class
        int var3 = var2.length;                     // Stores the len of PT Class in var3 (int)


       for(int var4 = 0; var4 < var3; ++var4) {     // 5 Cycles
            ProductType type = var2[var4];          // Print each value 1by1 in the Array var2
            System.out.println(type);               // var4 gets each index in var2 then print as {type}
        }

        if (productType == ProductType.DRINK) {     // Note IF BLOCK is outside of FOR LOOP -> printed last
            System.out.println("Drink Found");
        }

    }
}
