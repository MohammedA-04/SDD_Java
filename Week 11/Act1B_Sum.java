class Test {
    // Create a ** Method ** via public int name( parameters )
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // return value 'sum'
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;

        // Create an object of test
        Test obj = new Test();
        // Calling ** Method **
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);
    }
}

