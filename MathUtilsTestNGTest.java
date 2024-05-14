import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MathUtilsTestNGTest {

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

    @Test
    public void testFactorial() {
        assertEquals(factorial(0), 1);
        assertEquals(factorial(1), 1);
        assertEquals(factorial(5), 120);
        assertEquals(factorial(10), 3628800);
    }

    @Test
    public void testIsPrime() {
        assertFalse(isPrime(0));
        assertFalse(isPrime(1));
        assertTrue(isPrime(2));
        assertTrue(isPrime(7));
        assertFalse(isPrime(10));
    }
}
