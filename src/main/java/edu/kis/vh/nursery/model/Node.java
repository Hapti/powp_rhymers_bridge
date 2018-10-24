package edu.kis.vh.nursery.model;

class Node {
    //package-private (default access modifier)
    int value;
    Node prev, next;
    Node(final int i) {
        value = i;
    }
}
