package edu.kis.vh.nursery;

import edu.kis.vh.nursery.structures.IntArrayStack;
import edu.kis.vh.nursery.structures.IntStructure;

public class DefaultCountingOutRhymer {
    private final IntStructure intStructure;

    public DefaultCountingOutRhymer(IntStructure intStructure) {
        this.intStructure = intStructure;
    }

    public DefaultCountingOutRhymer() {
        this.intStructure = new IntArrayStack();
    }

    public void countIn(int in) {
        intStructure.push(in);
    }

    protected int peekaboo() {
        return intStructure.peek();
    }

    public boolean callCheck() {
        return intStructure.isEmpty();
    }

    public boolean isFull() {
        return intStructure.isFull();
    }

    public int getTotal() {
        return intStructure.getTotal();
    }

    public int countOut() {
        return intStructure.pop();
    }
}
