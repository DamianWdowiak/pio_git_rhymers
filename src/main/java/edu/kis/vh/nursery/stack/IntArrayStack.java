package edu.kis.vh.nursery.stack;

public class IntArrayStack {
    private static final int MAX_SIZE = 12;
    private static final int DEFAULT_VALUE = -1;
    private static final int EMPTY_STACK_INDICATOR = -1;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY_STACK_INDICATOR;

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY_STACK_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    public int peek() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int getTotal() {
        return total;
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
