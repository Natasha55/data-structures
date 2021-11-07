package com.luxoft.datastructures.queue;


import java.util.Arrays;

public class ArrayQueue implements Queue {

    private Object[] queue;
    private int size;

    public Object[] getQueue() {
        return queue;
    }

    public void setQueue(Object[] queue) {
        this.queue = queue;
        this.size = queue.length;
    }

    public ArrayQueue() {
    }

    @Override
    public void enqueue(Object value) {
        size = this.queue.length + 1;
        Object[] queueAfterAdd = new Object[size];
        for (int i = 0; i < this.queue.length; i++) {
            queueAfterAdd[i] = queue[i];
        }
        queueAfterAdd[queueAfterAdd.length - 1] = value;
        queue = queueAfterAdd;
    }

    @Override
    public Object dequeue() {
        size = this.queue.length - 1;
        Object[] queueAfterRemove = new Object[size];
        Object firstVal = queue[0];
        for (int i = 0 ; i < size; i++) {
            queueAfterRemove[i] = queue[i + 1];
        }

        queue = queueAfterRemove;
//        Arrays.stream(queue).forEach(System.out::println);
        return firstVal;
    }


    @Override
    public Object peek() {
        if(queue.length==0){
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
        if (size == 0) {
            return true;
            }
        return false;
    }

    @Override
    public boolean contains(Object value) {
        for (int i = 0; i < this.queue.length; i++) {
            if (queue[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for(int i=0;i < size;i++) {
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
