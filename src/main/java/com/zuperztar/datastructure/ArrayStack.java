package com.zuperztar.datastructure;

public class ArrayStack {

    private int topIndex;
    private int maxSize;
    private Object[] arrayObj;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.arrayObj = new Object[maxSize];
        this.topIndex = -1;
    }

    public boolean isEmpty() {
        return (topIndex == -1);
    }

    public boolean isFull() {
        return (topIndex == maxSize - 1);
    }

    public void push(Object obj) {
        if (isFull()) throw new ArrayIndexOutOfBoundsException((topIndex + 1) + ">=" + maxSize);
        arrayObj[++topIndex] = obj;
    }

    public Object peek() {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException(topIndex);
        return arrayObj[topIndex];
    }

    public Object pop() {
        Object obj = peek();
        topIndex--;
        return obj;
    }

}
