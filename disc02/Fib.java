// Q3: Writing Your First Program
public class Fib {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static int fib2(int n, int k, int f0, int f1) {
        // copy from solutions ...
        System.out.println("DEBUG: " + k);
        if (n == k) {
            return f0;
        }
        return fib2(n, k + 1, f1, f0 + f1);
    }

    public static void main(String[] args) {
        org.junit.Assert.assertEquals(0, fib(0));
        org.junit.Assert.assertEquals(5, fib(5));
        org.junit.Assert.assertEquals(8, fib(6));
    }
}
