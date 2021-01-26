package edu.kis.vh.nursery.structures;

public class IntArrayStack implements IntStructure {
    private static final int MAX_SIZE = 12;
    private static final int EMPTY_STACK_INDICATOR = -1;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY_STACK_INDICATOR;

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_INDICATOR;
    }

    @Override
    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    @Override
    public int peek() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
