class MyClass {

    int m = 2;
    int n = 3;
    String s = "b";

    MyClass(int m, int n, String s) {
        this.n = n;
        this.s = s;
    }
    void method(int m, int n, String s) {
        this.m = m;
        this.n = n;
        this.s = s;
    }
    public static void main(String[] args) {
        MyClass mc = new MyClass(4, 6, "h");
        mc.method(7, 9, "w");
        System.out.print(mc.m + "-" + mc.n + "-" + mc.s);
    }
}