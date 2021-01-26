package edu.kis.vh.nursery.structures;

public interface IntStructure {
    int DEFAULT_VALUE = 0;

    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int peek();

    int getTotal();

    int pop();
}
