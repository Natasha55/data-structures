package com.luxoft.datastructures.list;

public interface List<L> {

    void add(L value);

    void add(L value, int index);

    L remove(int index);

    L get(int index);

    L set(L value, int index);

    void clear();

    int size();

    boolean isEmpty();

    boolean contains(L value);

    int indexOf(L value);
    
    int lastIndexOf(L value);

    String toString();

}
