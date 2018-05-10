import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ListHelperTest {
    ListHelper helper = new ListHelper();

    @Test
    public void testRange() {
        ArrayList<Integer> listOne = helper.range(0, 5);
        ArrayList<Integer> listTwo = helper.range(10, 12);

        assertFalse(listOne.contains(-1));
        assertTrue(listOne.contains(0));
        assertTrue(listOne.contains(1));
        assertTrue(listOne.contains(2));
        assertTrue(listOne.contains(3));
        assertTrue(listOne.contains(4));
        assertTrue(listOne.contains(5));
        assertFalse(listOne.contains(6));

        assertFalse(listTwo.contains(9));
        assertTrue(listTwo.contains(10));
        assertTrue(listTwo.contains(11));
        assertTrue(listTwo.contains(12));
        assertFalse(listTwo.contains(13));
    }

    @Test
    public void testGetEven() {
        ArrayList<Integer> listOne = helper.getEven(helper.range(0, 10));

        assertTrue(listOne.contains(0));
        assertTrue(listOne.contains(2));
        assertTrue(listOne.contains(4));
        assertTrue(listOne.contains(6));
        assertTrue(listOne.contains(8));
        assertTrue(listOne.contains(10));

        assertFalse(listOne.contains(-1));
        assertFalse(listOne.contains(1));
        assertFalse(listOne.contains(3));
        assertFalse(listOne.contains(5));
        assertFalse(listOne.contains(7));
        assertFalse(listOne.contains(9));
        assertFalse(listOne.contains(11));
    }
}
