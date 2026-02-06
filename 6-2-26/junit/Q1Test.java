import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Q1Test {

    @Test
    void testAdd() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void testException() {
        assertThrows(ArithmeticException.class, () -> {
            int x = 5 / 0;
        });
    }
}
