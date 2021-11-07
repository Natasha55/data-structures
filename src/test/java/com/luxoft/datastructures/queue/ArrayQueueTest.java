package com.luxoft.datastructures.queue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class ArrayQueueTest {

    @Test
    @DisplayName("Enqueue adds value")
    public void enqueue() {
        ArrayQueue queue = new ArrayQueue();
        queue.setQueue(new Object[]{});

        queue.enqueue("A");
        queue.enqueue("B");

        assertEquals(2, queue.size(), "Ochered must be 2");
    }

    @Test
    @DisplayName("Dequeue returns first value of queue")
    public void dequeue() {
        ArrayQueue queue = new ArrayQueue();
        Object[] testQueue = new Object[]{"A", "B", "C"};
        queue.setQueue(testQueue);

        Object actual = queue.dequeue();

        assertEquals(testQueue.length-1, queue.size());
        assertEquals("A", actual);
        assertEquals("B", queue.getQueue()[0]);
        assertEquals("C", queue.getQueue()[1]);
    }

    @Test
    @DisplayName("Peek returns the element at the front")
    public void peek() {
        ArrayQueue queue = new ArrayQueue();
        Object[] testQueue = new Object[]{"A", "B"};
        queue.setQueue(testQueue);

        Object actual = queue.peek();

        assertEquals("A", actual);
    }

    @Test
    @DisplayName("Peek returns null if queue is empty")
    public void peekEmpty() {
        ArrayQueue queue = new ArrayQueue();
        Object[] testQueue = new Object[]{};
        queue.setQueue(testQueue);

        Object actual = queue.peek();

        assertNull(actual);

    }

    @Test
    @DisplayName("Size returns size")
    public void size() {
        ArrayQueue queue = new ArrayQueue();
        Object[] testQueue = new Object[]{"A", "B", "C"};
        queue.setQueue(testQueue);

        assertEquals(testQueue.length, queue.size());
    }

    @Test
    @DisplayName("Contains return true if value present in queue")
    public void containsTrue() {
        ArrayQueue queue = new ArrayQueue();
        Object[] testQueue = new Object[]{"A", "B", "C"};
        queue.setQueue(testQueue);

        Object actual = queue.contains("B");

        assertEquals(true, actual);
    }

    @Test()
    @DisplayName("Contains return false if value not present in queue")
    public void containsFalse() {
        ArrayQueue queue = new ArrayQueue();
        Object[] testQueue = new Object[]{};
        queue.setQueue(testQueue);

        Object actual = queue.contains("A");

        assertEquals(false, actual);
    }

    @Test
    @DisplayName("isEmpty returns true if queue is empty" )
    public void isEmptyTrue() {
        ArrayQueue queue = new ArrayQueue();
        Object[] testQueue = new Object[]{};
        queue.setQueue(testQueue);

        Object actual = queue.isEmpty();

        assertEquals(true, actual);
    }

    @Test
    @DisplayName("isEmpty returns false if queue is not empty")
    public void isEmptyFalse() {
        ArrayQueue queue = new ArrayQueue();
        Object[] testQueue = new Object[]{"A", "B"};
        queue.setQueue(testQueue);

        Object actual = queue.isEmpty();

        assertEquals(false, actual);
    }

    @Test
    @DisplayName("Clear return empty queue")
    public void clear() {
        ArrayQueue queue = new ArrayQueue();
        Object[] testQueue = new Object[]{"A"};
        queue.setQueue(testQueue);

        queue.clear();

        assertEquals(0, queue.size());

    }

    @Test
    @DisplayName("toString return ")
    public void toStringTest()  {
        ArrayQueue queue = new ArrayQueue();
        Object[] testQueue = new Object[]{"A", "B", "C"};
        queue.setQueue(testQueue);
        assertEquals("ArrayQueue{queue=[A, B, C], size=3}", queue.toString());
    }



}
