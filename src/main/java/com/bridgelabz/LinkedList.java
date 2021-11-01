package com.bridgelabz;

public class LinkedList {
    Node head;
    Node tail;

    /**
     * method to create Linked List
     * push method is used to add data 1st in last out
     *
     * @param data integer to be added in linked list
     */
    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    /**
     * method to create a Linked List
     * append method is used to add data 1st in 1st out
     *
     * @param data integer to be added in linked list
     */
    public Node append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = tail;
            this.tail = newNode;
            temp.next = newNode;
        }
        return newNode;
    }

    /**
     * Method to display the current LinkedList
     */
    public void showLinkedList() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    /**
     * Method to insert an item between two items
     *
     * @param previous takes in the previous item of the inserted element
     * @param current  takes in the current value to be inserted
     * @param next     takes in the next item that comes after inserted value
     */
    public void insert(int previous, int current, int next) {
        Node insertNode = new Node(current);
        Node temp = head;
        while (temp != null) {
            if (temp.data == 56 && temp.next.data == 70) {
                Node afterInsert = temp.next;
                temp.next = insertNode;
                temp.next.next = afterInsert;
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * Method to pop the 1st element of LinkedList
     */
    public void pop() {
        if (head == null) {
            System.out.println("LinkedList is empty");
        } else {
            head = head.next;
        }
    }
}
