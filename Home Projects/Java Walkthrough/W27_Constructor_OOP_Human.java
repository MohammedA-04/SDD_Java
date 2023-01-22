public class W27_Constructor_OOP_Human {

    // Constructor - Allows us to create different OBJ which hv different characteristics
    // Parameters are the RULES of HUMAN OBJ

    String name; int age; double weight;

    W27_Constructor_OOP_Human(String name, int age, double weight){
    // ~ Human(name,age,weight)
    this.name = name; // Imagine this is  ~ human.name
    this.age = age;   // Imagine this is. ~ human2.age
    this.weight = weight;
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }
    void drink(){
        System.out.println(this.name + " is drinking *burp*");
    }
}
