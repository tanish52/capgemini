import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Q5Test {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testIsEvenTrue(int number) {
        assertTrue(Q5.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEvenFalse(int number) {
        assertFalse(Q5.isEven(number));
    }
}
