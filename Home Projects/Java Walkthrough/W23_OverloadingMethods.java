public class W23_OverloadingMethods {

    // Overloading Methods = Are Methods with the same name but different parameters
    //                     = Method name + parameters = method signature

    public static void main(String[] args) {

        double x = add(1.0,2.0,3.0, 4.0);
        System.out.println(x);
    }
    static int add(int a, int b){
        System.out.println("Overloading method 1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("Overloading method 2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("Overloading method 3");
        return a + b + c + d;
    }
    static double add(double a, double b){
        System.out.println("Overloading method 4");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("Overloading method 5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("Overloading method 6");
        return a + b + c + d;
    }
}
// *** Note ***
// dataType for the variable in psvm is important
// Quantity of parameters in the (parentheses) matters
// static datatype important also1 (dataType x, dataType y){
// Return must match method

/* Notes - Overloading Method

~ The Same Method is Mentioned many times but each time the method has different
parameters which makes up the method signature

~~ IRL a signature differentiates human just like it does with methods
* */