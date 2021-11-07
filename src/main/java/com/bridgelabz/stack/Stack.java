package com.bridgelabz.stack;

import com.bridgelabz.LinkedList;

public class Stack<T> {

    LinkedList<T> linkedList = new LinkedList<>();

    /**
     * Push method is internally calling the push method in LikedList
     *
     * @param data takes in the value to be added in the stack
     */
    public void push(T data) {
        linkedList.push(data);
    }

    /**
     * Peak method is referring to the head of the LinkedList
     */
    public void peak() {
        System.out.println(linkedList.head.data);
    }

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        obj.push(70);
        obj.push(30);
        obj.push(56);
        obj.peak();
    }

}
