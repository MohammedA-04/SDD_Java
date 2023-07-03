package Java_Week.Java_Week_19.Example_Enum_2;

public enum Cereals {

    // Now we have to these cereal lvlofDeliciousness
    WHEATBISKS(95, "£1.99"),
    FROOT_WHEATIES(50, "2.09"),
    CRAZE(90, "£1.05"),
    HONEY_HOOPS(20, "£0.95"),
    CORN_FLAKES(95, "£2.25"),
    COCO_PUFFS(90, "£1.99");

    final int lvlDeliciousness;
    String price;

    Cereals (int lvlDeliciousness, String price){
        this.lvlDeliciousness = lvlDeliciousness;
        this.price = price;

    }
}
