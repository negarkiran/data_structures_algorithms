package datastructures.array.dynamicarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DynamicArrayTest {

    private DynamicArray dynamicArray;

    @Test
    public void shouldIncreaseSizeWhenInitialSizeExceeds() {
        dynamicArray = new DynamicArray();

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        assertEquals(10, dynamicArray.getArray().length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenInvalidArraySizeIsGiven() {
        dynamicArray = new DynamicArray(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenInvalidIndexIsGivenForRemoval() {
        dynamicArray = new DynamicArray();

        dynamicArray.add(1);
        dynamicArray.removeAt(5);
    }

    @Test
    public void shouldRemoveElementAtIndex() {
        dynamicArray = new DynamicArray();

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);

        assertEquals(3, dynamicArray.get(2));
        dynamicArray.removeAt(2);
        assertEquals(4, dynamicArray.get(2));
    }

    @Test
    public void shouldRemoveElementByValue() {
        dynamicArray = new DynamicArray();

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);

        assertTrue(dynamicArray.remove(3));
        assertEquals(3, dynamicArray.size());
    }

    @Test
    public void shouldFindIndexOfAnElement() {
        dynamicArray = new DynamicArray();

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);

        assertEquals(2, dynamicArray.indexOf(3));
    }

    @Test
    public void shouldFindElementInArray() {
        dynamicArray = new DynamicArray();

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);

        assertTrue(dynamicArray.contains(3));
    }

    @Test
    public void shouldNotFindElementInArray() {
        dynamicArray = new DynamicArray();

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);

        assertFalse(dynamicArray.contains(32));
    }
}