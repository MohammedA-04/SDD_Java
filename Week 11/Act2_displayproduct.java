public class Act2_displayproduct {

    public int Product(int a, int b){
        int sum = a * b;
        return sum; // return value 'sum'
    }

    public static void main(String[] args) {
        int n1 =20;
        int n2 =9;

        // Create Obj
        Act2_displayproduct obj = new Act2_displayproduct();
        // Calling Method Called Product
        int result = obj.Product(n1,n2);
        System.out.println("Sum is: " + result);
    }
}