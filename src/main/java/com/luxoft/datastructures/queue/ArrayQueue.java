package com.luxoft.datastructures.queue;

import java.util.Arrays;

public class ArrayQueue<Q> implements Queue<Q> {

    private Q[] queue;
    private int size;

    public Q[] getQueue() {
        return queue;
    }

    public void setQueue(Q[] queue) {
        this.queue = queue;
        this.size = queue.length;
    }

    public ArrayQueue() {
    }

    @Override
    public void enqueue(Q value) {
        size = this.queue.length + 1;
        Object[] queueAfterAdd = new Object[size];
        System.arraycopy(queue, 0, queueAfterAdd, 0, this.queue.length);
        queueAfterAdd[queueAfterAdd.length - 1] = value;
        queue = (Q[]) queueAfterAdd;
    }

    @Override
    public Q dequeue() {
        size = this.queue.length - 1;
        Object[] queueAfterRemove = new Object[size];
        Q firstVal = queue[0];
        System.arraycopy(queue, 1, queueAfterRemove, 0, size);

        queue = (Q[]) queueAfterRemove;
        return firstVal;
    }

    @Override
    public Q peek() {
        if (queue.length == 0) {
            return null;
        }
        return queue[0];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Q value) {
        for (Q o : this.queue) {
            if (o == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            queue[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "queue=" + Arrays.toString(queue) +
                ", size=" + size +
                '}';
    }

}
