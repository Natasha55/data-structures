package com.luxoft.datastructures.list;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayListTest {

    @Description("value was added to the end of the list")
    @Test
    public void add() {
        ArrayList list = new ArrayList();
        list.setList(new Object[]{"A", "B", "N"});

        list.add("C");
        list.add("D");

        assertEquals(5, list.size());
//        System.out.println("just ADD: ");
//        for (int i = 0; i <= list.size() - 1; i++) {
//            System.out.println(list.get(i));
    }


    @DisplayName("Value was added  by index between [0, size]")
    @Test
    public void addIndex() {
        ArrayList list = new ArrayList();
        list.setList(new Object[]{"A", "B", "C", "K"});
        list.add("N", 2);
        assertEquals(5, list.size());
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
    }

    @DisplayName("Value was added  by index empty array")
    @Test
    public void addIndexInEmptyList() {
        ArrayList list = new ArrayList();
        list.setList(new Object[]{});
        list.add("O", 0);
        assertEquals(1, list.size());
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
    }

    @DisplayName("Return list without value of last index")
    @Test
    public void removeLastIndex() {
        ArrayList list = new ArrayList();
        list.setList(new Object[]{"A", "B", "C"});
        list.remove(2);
        assertEquals(2, list.size());
        assertEquals("A", list.getList()[0]);
        assertEquals("B", list.getList()[1]);
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
    }

    @DisplayName("Return list without value of middle index")
    @Test
    public void removeMiddleIndex() {
        ArrayList list = new ArrayList();
        list.setList(new Object[]{"A", "B", "C"});
        list.remove(1);
        assertEquals(2, list.size());
        assertEquals("A", list.getList()[0]);
        assertEquals("C", list.getList()[1]);
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
    }

    @DisplayName("Return list without value of first index")
    @Test
    public void removeFirstIndex() {
        ArrayList list = new ArrayList();
        list.setList(new Object[]{"A", "B", "C"});
        list.remove(0);
        assertEquals(2, list.size());
        assertEquals("B", list.getList()[0]);
        assertEquals("C", list.getList()[1]);
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
    }

    @DisplayName("Return try if empty")
    @Test
    public void isEmptyTry() {
        ArrayList list = new ArrayList();
        list.setList(new Object[]{});
        Object result = list.isEmpty();
        assertEquals(true, result);
    }

    @DisplayName("Return false if empty")
    @Test
    public void isEmptyFalse() {
        ArrayList list = new ArrayList();
        list.setList(new Object[]{"A", "B"});
        Object result = list.isEmpty();
        assertEquals(false, result);
    }

    @DisplayName("To string")
    @Test
    public void toStringTest(){
        ArrayList list = new ArrayList();
        list.setList(new Object[]{"A", "B", "C"});
        String expected = "[A, B, C]";
        assertEquals(expected, list.toString());
    }

}











