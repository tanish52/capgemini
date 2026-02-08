import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Q2Test {

    @Test
    void testReverse() {
        assertEquals("olleh", Q2.reverse("hello"));
    }

    @Test
    void testIsPalindromeTrue() {
        assertTrue(Q2.isPalindrome("madam"));
    }

    @Test
    void testIsPalindromeFalse() {
        assertFalse(Q2.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("JAVA", Q2.toUpperCase("java"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", Q2.reverse(""));
    }
}
