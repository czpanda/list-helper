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

    @Test
    public void testGetOdd() {
        ArrayList<Integer> listOne = helper.getOdd(helper.range(0, 10));

        assertTrue(listOne.contains(1));
        assertTrue(listOne.contains(3));
        assertTrue(listOne.contains(5));
        assertTrue(listOne.contains(7));
        assertTrue(listOne.contains(9));

        assertFalse(listOne.contains(-1));
        assertFalse(listOne.contains(0));
        assertFalse(listOne.contains(2));
        assertFalse(listOne.contains(4));
        assertFalse(listOne.contains(6));
        assertFalse(listOne.contains(8));
        assertFalse(listOne.contains(10));
        assertFalse(listOne.contains(11));
    }

    @Test
    public void testMultiply() {
        ArrayList<Integer> listOne = helper.multiply(helper.range(0, 5), 2);

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

    @Test
    public void testAdd() {
        ArrayList<Integer> listOne = helper.range(0, 5);
        ArrayList<Integer> listTwo = helper.range(10, 15);

        ArrayList<Integer> finalList = helper.add(listOne, listTwo);

        assertTrue(finalList.contains(0));
        assertTrue(finalList.contains(1));
        assertTrue(finalList.contains(2));
        assertTrue(finalList.contains(3));
        assertTrue(finalList.contains(4));
        assertTrue(finalList.contains(5));
        assertTrue(finalList.contains(10));
        assertTrue(finalList.contains(11));
        assertTrue(finalList.contains(12));
        assertTrue(finalList.contains(13));
        assertTrue(finalList.contains(14));
        assertTrue(finalList.contains(15));

        assertFalse(listOne.contains(-1));
        assertFalse(listOne.contains(6));
        assertFalse(listOne.contains(9));
        assertFalse(listOne.contains(16));
    }
}
