package com.zuperztar.datastructure;

public class ListStack {

    private Node top;

    private class Node {
        private Object obj;
        private Node nextNode;

        Node(Object obj) {
            this.obj = obj;
            this.nextNode = null;
        }
    }

    public ListStack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void push(Object obj) {
        Node newNode = new Node(obj);
        newNode.nextNode = top;
        top = newNode;
    }

    public Object peek() {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException();
        return top.obj;
    }

    public Object pop() {
        Object obj = peek();
        top = top.nextNode;
        return obj;
    }

}
