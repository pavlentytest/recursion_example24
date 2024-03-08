public class Main {
    public static void main(String[] args) {
        doSmth();
    }

    public static void doSmth() {
        System.out.println("Done...");
        doSmth();
    }

    public static int factorial(int x) {
        if(x == 1) {
            return 1;
        } else {
            return x*factorial(x-1);
        }
    }

    // f(n) = f(n-1) + f(n-2)
    // f(0) = 1, f(1) = 1

    public static int fibon(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else
            return fibon(n-1) + fibon(n-2);
    }

}