package com.zuperztar.datastructure;

public class ListStackUse {

    public static void main(String[] args) {
        ListStack listStack = new ListStack();

        System.out.println(listStack.isEmpty());

        listStack.push("Hello");
        listStack.push("World");
        System.out.println(listStack.isEmpty());

        System.out.println(listStack.peek());

        System.out.println(listStack.pop());
        System.out.println(listStack.pop());
    }

}
