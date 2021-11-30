package com.luxoft.datastructures.stack;

import java.util.Arrays;

public class ArrayStack<S> implements Stack<S> {

    private int size;
    private S[] stack;

    public ArrayStack() {
        stack = (S[]) new Object[10];
    }

    @Override
    public void push(S value) {
        if (stack.length == size) {
            Object[] newArray = new Object[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = (S[]) newArray;
        }
        stack[size] = value;
        size++;
    }

    @Override
    public S pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        S removedElement = stack[size - 1];
        System.arraycopy(stack, 0, stack, size, size - 1);
        size--;
        return removedElement;
    }

    @Override
    public S peek() {
        if (size == 0) {
            return null;
        }
        return stack[size - 1];
    }

    @Override
    public boolean contains(S value) {
        for (int i = 0; i < size; i++) {
            S valueInStack = stack[i];
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
