package com.luxoft.datastructures.stack;

public class ArrayStack implements Stack {

    private int size;
    private Object[] stack;

    public ArrayStack() {
        stack = new Object[10];
    }


    @Override
    public void push(Object value) {
        if (stack.length == size) {
            Object[] newArray = new Object[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[size] = value;
        size++;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        Object removedElement = stack[size - 1];
        System.arraycopy(stack, 0, stack, size, size - 1);
//        stack[size-1];
        size--;
        return removedElement;
    }

    @Override
    public Object peek() {

        if (size == 0) {
            return null;
        }
        return stack[size - 1];
    }

    @Override
    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            Object valueInStack = stack[i];
            if (value.equals(valueInStack)) {
                return true;
            }
        }
        return false;
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
    public void clear() {
        size = 0;
    }
}
