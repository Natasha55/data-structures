package com.luxoft.datastructures.list;

import java.util.Arrays;

public class ArrayList implements List {

    private Object[] list;
    private int size;

    public void setList(Object[] list) {
        this.list = list;
        this.size = list.length;
    }

    public Object[] getList() {
        return list;
    }

    @Override
    public void add(Object value) {

        Object[] listAfterAdd = new Object[size + 1];
        System.arraycopy(list, 0, listAfterAdd, 0, size);
        listAfterAdd[size] = value;
        list = listAfterAdd;
        size++;
    }

    @Override
    public void add(Object value, int index) {

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
        Object[] growArrayList = new Object[(int) ((list.length * 1.5) + 1)];
        if (size >= 0) System.arraycopy(list, 0, growArrayList, 0, size);
        list = growArrayList;
    }

    @Override
    public Object remove(int index) {

        if (index > size) {
            throw new IndexOutOfBoundsException("Can't remove value if index bigger than size");
        }

        for (int i = index; i <= size; i++) {
            list[index] = list[index + 1];
        }
        return size--;
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public Object set(Object value, int index) {
        return null;
    }

    @Override
    public void clear() {

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
    public boolean contains(Object value) {
        return indexOf(value) != -1;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

}
