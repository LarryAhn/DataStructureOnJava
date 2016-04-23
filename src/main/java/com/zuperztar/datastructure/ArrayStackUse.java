package com.zuperztar.datastructure;

public class ArrayStackUse {

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push("Hello");
        arrayStack.push("World");

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    }

}
