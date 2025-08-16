public class ppp {

    // Method with one int parameter
    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    // Method with two int parameters
    public void display(int a, int b) {
        System.out.println("Two Integers: " + a + ", " + b);
    }

    // Method with one String parameter
    public void display(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        ppp obj = new ppp();
        obj.display(10);
        obj.display(10, 20);
        obj.display("Hello");
    }
}
