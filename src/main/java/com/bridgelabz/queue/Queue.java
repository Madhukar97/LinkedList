package com.bridgelabz.queue;

import com.bridgelabz.LinkedList;

public class Queue<T> {

    LinkedList<T> linkedList = new LinkedList<>();

    public void peak() {
        System.out.println(linkedList.head.data);
    }

    /**
     * Enqueue method is internally calling the append method in LinkedList
     * @param data takes in the data to be added as parameter
     */
    public void enqueue(T data) {
        linkedList.append(data);
    }

    /**
     * Method dequeue is internally calling the pop method in LinkedList
     * @return returns the popped value
     */
    public T dequeue() {
        return linkedList.pop();
    }

    public boolean isEmpty() {
        return linkedList.head == null;
    }

    /**
     * Size method is internally calling the LinkedList size method
     */
    public void size() {
        linkedList.size();
    }

    public static void main(String[] args) {
        Queue<Integer> obj = new Queue<>();
        obj.enqueue(56);
        obj.enqueue(30);
        obj.enqueue(70);
        obj.peak();
        obj.size();
        obj.dequeue();
        obj.size();
        obj.peak();
    }
}