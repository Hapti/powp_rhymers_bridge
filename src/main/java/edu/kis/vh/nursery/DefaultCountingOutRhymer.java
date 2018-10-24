package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.ExtractedInterface;
import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    //AD. 3.1.5 - pracuję na IntelliJ i nie mogłem znaleźć opcji "Generalize Declared Type".
    private ExtractedInterface extractedInterface = new IntLinkedList();
    //private IntArrayStack intArrayStack;

    //private IntLinkedList intLinkedList;

    boolean callCheck() {
        //return intArrayStack.callCheck();
        return extractedInterface.callCheck();
    }

    public boolean isFull() {
        return extractedInterface.isFull();
    }

    int peekaboo() {
        //return intArrayStack.peekaboo();
        return extractedInterface.peekaboo();
    }

    public void countIn(int in) {
        //intArrayStack.countIn(in);
        extractedInterface.countIn(in);
    }

    public int countOut() {
        //return intArrayStack.countOut();
        return extractedInterface.countOut();
    }

    //UNUSED methods should be deleted
//    public int getTotal() {
//        return intArrayStack.getTotal();
//    }
//
//    public void setTotal(int total) {
//        intArrayStack.setTotal(total);
//    }
//
//    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
//        this.intArrayStack = intArrayStack;
//    }

    public DefaultCountingOutRhymer() {
        //this.intArrayStack = new IntArrayStack();
        //this.intLinkedList = new IntLinkedList();
    }
}
