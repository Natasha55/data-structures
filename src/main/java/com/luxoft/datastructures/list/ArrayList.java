package com.luxoft.datastructures.list;

import java.util.Arrays;

public class ArrayList<L> implements List<L> {

    private L[] list;
    private int size;

    public void setList(L[] list) {
        this.list = list;
        this.size = list.length;
    }

    public Object[] getList() {
        return list;
    }

    @Override
    public void add(L value) {

        Object[] listAfterAdd = new Object[size + 1];
        System.arraycopy(list, 0, listAfterAdd, 0, size);
        listAfterAdd[size] = value;
        list = (L[]) listAfterAdd;
        size++;
    }

    @Override
    public void add(L value, int index) {

        if (index > size) {
            throw new IndexOutOfBoundsException("Can't add value if index bigger than size");
        }
        if (size == list.length) {
            grow();
        }
        if (size - index >= 0) System.arraycopy(list, index, list, index + 1, size - index);

        list[index] = value;
        size++;
    }

    private void grow() {
        L[] growArrayList = (L[]) new Object[(int) ((list.length * 1.5) + 1)];
        if (size >= 0) System.arraycopy(list, 0, growArrayList, 0, size);
        list = growArrayList;
    }

    @Override
    public L remove(int index) {
        L value = list[index];
        if (index > size) {
            throw new IndexOutOfBoundsException("Can't remove value if index bigger than size");
        }
        if (size - index >= 0) System.arraycopy(list, index + 1, list, index, size - index - 1);
        size--;
        return value;
    }

    @Override
    public L get(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Can't get value by index when array is empty");
        }
        return list[index];
    }

    @Override
    public L set(L value, int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Can't set value by index when array is empty");
        }
        L oldValue = list[index];
        list[index] = value;
        return oldValue;
    }

    @Override
    public void clear() {
        size = 0;
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
    public boolean contains(L value) {
        return indexOf(value) != -1;
    }

    @Override
    public int indexOf(L value) {
        for (int i = 0; i < size; i++) {
            L valueInList = list[i];
            if (value.equals(valueInList)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(L value) {
        for (int i = size - 1; i > 0; i--) {
            Object lastValueInList = list[i];
            if (value.equals(lastValueInList)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

}
