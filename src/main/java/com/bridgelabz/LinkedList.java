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
}
