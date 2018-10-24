package edu.kis.vh.nursery.model;

public interface ExtractedInterface {

    int TOTAL = 0;

    //3.1.9 pytanie 1: tak, zmiana następuje tyklo w jednym miejscu, pytanie 2: polimorfizm

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
