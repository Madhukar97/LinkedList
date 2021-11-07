package com.bridgelabz.queue;

import com.bridgelabz.LinkedList;

public class Queue<T> {

    LinkedList<T> linkedList = new LinkedList<>();

    public void peak(){
        System.out.println(linkedList.head.data);
    }

    public void enqueue(T data){
        linkedList.append(data);
    }

    public boolean isEmpty(){
        return linkedList.head==null;
    }

    public void size(){
        linkedList.size();
    }

    public static void main(String[] args) {
        Queue<Integer> obj = new Queue<>();
        obj.enqueue(56);
        obj.enqueue(30);
        obj.enqueue(70);
        obj.peak();
        obj.size();
    }
}