package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int DEFAULT_VALUE = -1;
    public static final int MAX_SIZE = 11;
    public static final int SOME_ERROR = -1;
    public static final int EMPTY_RHYMER_INDICATOR = 12;

    private final int[] NUMBERS = new int[EMPTY_RHYMER_INDICATOR];

    public int total = DEFAULT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == MAX_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return SOME_ERROR;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return SOME_ERROR;
        return NUMBERS[total--];
    }

}
