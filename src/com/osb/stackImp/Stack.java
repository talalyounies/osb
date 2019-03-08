package com.osb.stackImp;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int head;

    public Stack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        head = -1;
    }

    public void push(long j) {
        stackArray[++head] = j;
    }

    public long pop() {
        return stackArray[head--];
    }

    public long peek() {
        return stackArray[head];
    }

    public boolean isEmpty() {
        if (head == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (head == maxSize -1) {
            return true;
        }
        return false;
    }
}
