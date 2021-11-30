package com.luxoft.datastructures.stack;

public interface Stack <S> {

    void push(S value);

    S pop();

    S peek();

    boolean contains(S value);

    int size();

    boolean isEmpty();

    void clear();
}
