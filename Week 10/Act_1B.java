public class Act_1B {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

        // precedence rules for arithmetic operators | (* = / = %) > (+ = -)
        // Working Out  10/20 = 0.5 + 20 = 20.5 | prints a+(b/d)
        // Prints = a+b/d = 20 | Int Val rounds down so ans is 20 not 20.50
        System.out.println("a+b/d = " + (a + b / d));

        // If ops has same precedence then associative | e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
        // Working Out = 40/30=1 | 10*20=200 | 20+(200) = 220 - 1 = 219
        // Prints = a+b*d-e/f = 219
        System.out.println("a+b*d-e/f = " + (a + b * d - e / f));

    }
}
