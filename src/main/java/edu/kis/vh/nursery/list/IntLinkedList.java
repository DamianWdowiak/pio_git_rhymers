package edu.kis.vh.nursery.list;

/**
 * Linked List that contains integers
 */
public class IntLinkedList {

    private Node last;
    private int i;
    public static final int IF_EMPTY = -1;

    /**
     * @param i new element to add
     */
    public void push(int i) {
        if (last == null)
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
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * @return false
     */
    public boolean isFull() {
        return false; // TODO: 15/01/2021 implement check if list is full
    }

    /**
     * @return last value without deleting
     */
    public int top() {
        if (isEmpty())
            return IF_EMPTY;
        return last.getValue();
    }

    /**
     * @return last value and delete it
     */
    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
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
