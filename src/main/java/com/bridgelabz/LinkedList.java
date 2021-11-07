package com.bridgelabz;

public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    /**
     * method to create Linked List
     * push method is used to add data 1st in last out
     *
     * @param data integer to be added in linked list
     */
    public Node<T> push(T data) {

        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node<T> temp = head;
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
    public Node<T> append(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node<T> temp = tail;
            this.tail = newNode;
            temp.next = newNode;
        }
        return newNode;
    }

    /**
     * Method to display the current LinkedList
     */
    public void showLinkedList() {
        Node<T> temp = head;
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
    public void insert(T previous, T current, T next) {
        Node<T> insertNode = new Node<T>(current);
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == previous && temp.next.data == next) {
                Node<T> afterInsert = temp.next;
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
    public T pop() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return null;
        } else {
            T value = head.data;
            head = head.next;
            return value;
        }
    }

    /**
     * Method to pop the Last element of LinkedList
     */
    public void popLast() {
        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    /**
     * Method to find node with key value
     *
     * @param key to pass in the value of key
     */
    public void search(T key) {
        Node<T> temp = head;
        int nodeCount = 1;
        while (temp != null) {
            if (temp.data == key) {
                break;
            }
            nodeCount++;
            temp = temp.next;
        }
        System.out.println("The Node with key value " + key + " is " + nodeCount);
    }

    /**
     * Method to insert value after specific Node
     *
     * @param previous takes in the value of Node after which insertion should be done
     * @param current  takes in the insertion value
     */
    public void insertAfterElement(T previous, T current) {
        Node<T> insertNode = new Node<T>(current);
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == previous) {
                Node<T> afterInsert = temp.next;
                temp.next = insertNode;
                temp.next.next = afterInsert;
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * Method to delete an element
     *
     * @param key takes in the key which should be deleted from LinkedList
     */
    public void delete(T key) {
        Node<T> temp = head;               //56,30,40,70
        if (head.data == key) {
            pop();
        } else if (tail.data == key) {
            popLast();
        } else {
            while (temp != null) {
                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    /**
     * Method to find the size of LinkedList
     */
    public void size() {
        Node<T> temp = head;
        int nodeCount = 0;
        while (temp != null) {
            nodeCount++;
            temp = temp.next;
        }
        System.out.println("The size of LinkedList is: " + nodeCount);
    }
}