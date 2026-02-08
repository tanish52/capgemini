import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Q4Test {

    @Test
    void testDivideSuccess() {
        assertEquals(5, Q4.divide(10, 2));
    }

    @Test
    void testDivideByZeroException() {
        assertThrows(ArithmeticException.class, () -> Q4.divide(10, 0));
    }
}
