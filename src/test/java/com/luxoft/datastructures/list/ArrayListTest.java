package com.luxoft.datastructures.list;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Description("value was added to the end of the list")
    @Test
    public void add() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B", "N"});

        list.add("C");
        list.add("D");

        assertEquals(5, list.size());
    }

    @DisplayName("Value was added by index between [0, size]")
    @Test
    public void addIndex() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B", "C"});
        list.add("N", 0);
        assertEquals(4, list.size());
    }

    @DisplayName("Value was added by index in empty array")
    @Test
    public void addIndexInEmptyList() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{});
        list.add("O", 0);
        assertEquals(1, list.size());
    }

    @DisplayName("Remove value of last index")
    @Test
    public void removeLastIndex() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B", "C"});
        list.remove(2);
        assertEquals(2, list.size());
        assertEquals("A", list.getList()[0]);
        assertEquals("B", list.getList()[1]);
    }

    @DisplayName("Remove value of last index")
    @Test
    public void removeMiddleIndex() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B", "C"});
        list.remove(1);
        assertEquals(2, list.size());
        assertEquals("A", list.getList()[0]);
        assertEquals("C", list.getList()[1]);
    }

    @DisplayName("Remove value of first index")
    @Test
    public void removeFirstIndex() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B", "C"});
        list.remove(0);
        assertEquals(2, list.size());
        assertEquals("B", list.getList()[0]);
        assertEquals("C", list.getList()[1]);
    }

    @DisplayName("Return value when get by index")
    @Test
    public void get() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B", "C"});
        assertEquals("A", list.getList()[0]);
        assertEquals("B", list.getList()[1]);
        assertEquals("C", list.getList()[2]);
    }

    @DisplayName("Return set value in list")
    @Test
    public void setValue() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B", "C"});
        list.set("K", 2);
        assertEquals(3, list.size());
        assertEquals("K", list.getList()[2]);
    }

    @DisplayName("List became empty after clear")
    @Test
    public void clear() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B", "C"});
        list.clear();
        assertEquals(0, list.size());
    }

    @DisplayName("Return true if list is empty")
    @Test
    public void isEmptyTrue() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{});
        Object result = list.isEmpty();
        assertEquals(true, result);
    }

    @DisplayName("Return false if list not empty")
    @Test
    public void isEmptyFalse() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B"});
        Object result = list.isEmpty();
        assertEquals(false, result);
    }

    @DisplayName("Return true if list have value")
    @Test
    public void isContainsTrue() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B"});
        assertTrue(list.contains("A"));
    }

    @DisplayName("Return false if list did not have value")
    @Test
    public void isContainsFalse() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B"});
        assertEquals(false, list.contains("v"));
    }

    @DisplayName("Return index of value")
    @Test
    public void indexOfValue() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B"});

        assertEquals(0, list.indexOf("A"));
    }

    @DisplayName("Return index -1 if value is not in list")
    @Test
    public void indexOf() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B"});

        assertEquals(-1, list.indexOf("C"));
    }

    @DisplayName("Return last index of value")
    @Test
    public void lastIndexOf() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B", "A"});

        assertEquals(2, list.lastIndexOf("A"));
    }

    @DisplayName("To string")
    @Test
    public void toStringTest() {
        ArrayList<Object> list = new ArrayList<>();
        list.setList(new Object[]{"A", "B", "C"});
        String expected = "[A, B, C]";
        assertEquals(expected, list.toString());
    }

}











