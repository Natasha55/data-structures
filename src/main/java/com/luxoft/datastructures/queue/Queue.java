package com.luxoft.datastructures.queue;

public interface Queue<Q> {

    void enqueue(Q value);

    Q dequeue();

    Q peek();

    int size();

    boolean isEmpty();

    boolean contains(Q value);

    void clear();

}
