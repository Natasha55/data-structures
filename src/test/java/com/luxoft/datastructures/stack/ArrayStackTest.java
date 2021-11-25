package com.luxoft.datastructures.stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest {

    @DisplayName("Push and pop work correctly and change size")
    @Test
    public void pushAndPop() {
        ArrayStack stack = new ArrayStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        assertEquals(3, stack.size());
        assertEquals("C", stack.pop());
        assertEquals("B", stack.pop());
        assertEquals("A", stack.pop());
        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
    }

    @DisplayName("Push and peek value")
    @Test
    public void pushAndPeek() {
        ArrayStack stack = new ArrayStack();
        stack.push("A");
        stack.push("B");

        assertEquals(2, stack.size());
        assertEquals("B", stack.peek());
        assertEquals("B", stack.peek());
        assertEquals(2, stack.size());
    }

    @DisplayName("Return true if is empty on new stack")
    @Test
    public void isEmptyTrueOnNewStack() {
        ArrayStack stack = new ArrayStack();

        assertTrue(stack.isEmpty());
    }

    @DisplayName("Return false if stack with date")
    @Test
    public void isEmptyFalseOnNewStack() {
        ArrayStack stack = new ArrayStack();
        stack.push("A");

        assertFalse(stack.isEmpty());
    }

    @DisplayName("Return true if stack is empty after clear")
    @Test
    public void isEmptyTrueAfterClear() {
        ArrayStack stack = new ArrayStack();
        stack.push("A");
        stack.push("B");

        stack.clear();

        assertTrue(stack.isEmpty());
    }

    @DisplayName("Return true if stack is empty after clear")
    @Test
    public void isEmptyFalseAfterClear() {
        ArrayStack stack = new ArrayStack();
        stack.push("A");
        stack.push("B");

        assertFalse(stack.isEmpty());
    }

    @DisplayName("Contains return true")
    @Test
    public void ContainsReturnTrue() {
        ArrayStack stack = new ArrayStack();
        stack.push("A");
        stack.push("B");

        assertTrue(stack.contains("A"));
    }

    @DisplayName("Contains return false on empty stack")
    @Test
    public void ContainsReturnFalse() {
        ArrayStack stack = new ArrayStack();

        assertFalse(stack.contains("C"));
    }

}
