package edu.cscc;
//Kelly Waddell 11/12/2019 Linked List Class
public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        head = null;
    }
//Adds element before all others
    public void addFirst(T content) {
        Node ptr = head;
        head = new Node<>(content,ptr);
    }
//Adds element after all other elements
    public void addLast(T content) {
        Node last = new Node<>(content,null);
        if (head == null) {
            head = last;
        } else {
            Node ptr = head;
            while(ptr.getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(last);
        }
    }
//Delets the first element
    public boolean deleteFirst() {
        if (head == null) {
            return false;
        } else {
            head = head.getNext();
            return true;
        }
    }
//Deletes the Last element
    public boolean deleateLast() {
        if (head == null) {
            return false;
        }
        else if (head.getNext() == null) {
            head = null;
            return true;
        } else {
            Node ptr = head;
            while (ptr.getNext().getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(null);
            return true;
        }
    }
//Prints the Head
    public Node getHead() {
        return head;
    }

    public String toString() {
        String str;
        if (head == null) {
            str = "<empty>";
        } else {
            Node ptr = head;
            str = "("+ptr.getContent().toString()+")";
            while(ptr.getNext() != null) {
                str = str + "->";
                ptr = ptr.getNext();
                str = str + "(" + ptr.getContent().toString() + ")";
            }
        }
        return str;
    }
}
