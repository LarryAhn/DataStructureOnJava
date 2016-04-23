package com.zuperztar.datastructure;

public class ListStack {

    private Node topNode;

    private class Node {
        private Object obj;
        private Node nextNode;

        Node(Object obj) {
            this.obj = obj;
            this.nextNode = null;
        }
    }

    public ListStack() {
        this.topNode = null;
    }

    public boolean isEmpty() {
        return (topNode == null);
    }

    public void push(Object obj) {
        Node newNode = new Node(obj);
        newNode.nextNode = topNode;
        topNode = newNode;
    }

    public Object peek() {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException();
        return topNode.obj;
    }

    public Object pop() {
        Object obj = peek();
        topNode = topNode.nextNode;
        return obj;
    }

}
