class Main {

    private String languages;

    // constructor accepting single value
    Main(String lang) {
        languages = lang;
        System.out.println(languages + " Programming Language");
    }

    public static void main(String[] args) {

        // call constructor by passing a single value
        Main obj1 = new Main("Java");
        Main obj2 = new Main("Python");
        Main obj3 = new Main("C");
    }
}

/*
- Main() constructor with parameters = Main( String lang )
-- Inside the constructor VAR languages = lang
-- SOUT = languages VAR + " Programming Languages"
- 3 Objects are created
-- Obj 1 calls Main(String lang) constructor and prints
-- ( Main obj1 = new Main (lang: "Java"); + " Programming Language");
 */