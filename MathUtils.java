public class MathUtils {

    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Test method for factorial
    public static void testFactorial() {
        assert factorial(0) == 1;
        assert factorial(1) == 1;
        assert factorial(5) == 120;
        assert factorial(10) == 3628800;
    }

    // Test method for isPrime
    public static void testIsPrime() {
        assert !isPrime(0);
        assert !isPrime(1);
        assert isPrime(2);
        assert isPrime(7);
        assert !isPrime(10);
    }

    public static void main(String[] args) {
        // Run test methods
        testFactorial();
        testIsPrime();
        System.out.println("Tests passed successfully!");
    }
}
