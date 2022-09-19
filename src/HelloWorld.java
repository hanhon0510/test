// Import your library
// Do not change the name of the Solution class
public class HelloWorld {
    // Type your main code here
    /**
     * tim uoc chung lon nhat
     */
    public static int gcd(int a, int b) {
        if (a < 0) {
            a *= -1;
        }
        if (b < 0) {
            b *= -1;
        }
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println(gcd(12, 16));
    }
}