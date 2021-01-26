package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;

public class DefaultCountingOutRhymer {
    private final IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
    }

    public void countIn(int in) {
        intArrayStack.push(in);
    }

    protected int peekaboo() {
        return intArrayStack.peek();
    }

    public boolean callCheck() {
        return intArrayStack.isEmpty();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public int countOut() {
        return intArrayStack.pop();
    }
}
