package edu.kis.vh.nursery.structures;

/**
 * Linked List that contains integers
 */
public class IntLinkedList implements IntStructure {

    public static final Node EMPTY_LIST_INDICATOR = null;
    private Node last;

    /**
     * @param i new element to add
     */
    @Override
    public void push(int i) {
        if (last == EMPTY_LIST_INDICATOR)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * @return true if list is empty
     */
    @Override
    public boolean isEmpty() {
        return last == EMPTY_LIST_INDICATOR;
    }

    /**
     * @return false
     */
    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getTotal() {
        if (isEmpty())
            return DEFAULT_VALUE;

        Node iterator = last;
        int total = 0;
        while(iterator != null){
            ++total;
            iterator = iterator.getNext();
        }

        return total;
    }

    /**
     * @return last value without deleting
     */
    @Override
    public int peek() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return last.getValue();
    }

    /**
     * @return last value and delete it
     */
    @Override
    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private static class Node {

        private final int VALUE;
        private Node prev;
        private Node next;

        public Node(int i) {
            this.VALUE = i;
        }

        public int getValue() {
            return VALUE;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
