import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Q1Test {

    @Test
    void testAdd() {
        assertEquals(5, Q1.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, Q1.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(12, Q1.multiply(4, 3));
    }

    @Test
    void testDivide() {
        assertEquals(5, Q1.divide(10, 2));
    }


    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Q1.divide(10, 0));
    }
}
