import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Q3Test {

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        Q3.addElement(list, 10);

        assertEquals(1, Q3.getSize(list));
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        Q3.removeElement(list, 10);

        assertEquals(1, Q3.getSize(list));
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, Q3.getSize(list));
    }
}
