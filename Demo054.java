class Demo054 {
    void display(int a) {
        System.out.println("Integer value: " + a);
    }

    void display(double a) {
        System.out.println("Double value: " + a);
    }

    void display(String a) {
        System.out.println("String value: " + a);
    }

    public static void main(String[] args) {
        Demo054 obj = new Demo054();
        obj.display(10);
        obj.display(3.14);
        obj.display("Hello, World!");
    }
}
