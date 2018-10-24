package edu.kis.vh.nursery.model;

public class IntLinkedList implements ExtractedInterface{

    private Node last;
    int i;

    //private static final int TOTAL = -1;

    @Override
    public void countIn(int in) {
        push(in);
    }

    @Override
    public boolean callCheck() {
        return isEmpty();
    }

    @Override
    public int peekaboo(){
        return top();
    }

    @Override
    public int countOut() {
        return pop();
    }

    @Override
    public boolean isFull() {
        return false;
    }


    //those methods can (and even should) be renamed and override the interface methods
    private void push(final int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    private int top() {
        if (isEmpty())
            return TOTAL;
        return last.value;
    }

    private int pop() {
        if (isEmpty())
            return TOTAL;
        int ret = last.value;
        last = last.prev;
        return ret;
    }
}