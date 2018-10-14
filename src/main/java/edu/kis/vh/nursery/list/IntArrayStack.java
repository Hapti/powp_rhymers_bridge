package edu.kis.vh.nursery.list;

public class IntArrayStack {
    private static final int TOTAL = -1;
    private static final int NUMBERS_COUNT = 12;
    private static final int FULL_NUMBER = 11;

    private int[] numbers = new int[NUMBERS_COUNT];

    private int total = TOTAL;

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        //TODO: rethink the logic. Later in project we check for negation of this method (!callCheck).
        //TODO: "total != TOTAL" is better solution
        return total == TOTAL;
    }

    public boolean isFull() {
        return total == FULL_NUMBER;
    }

    public int peekaboo() {
        if (callCheck())
            return TOTAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
