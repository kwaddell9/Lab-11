package edu.cscc;
//Kelly Waddell 11/12/2019 Node Class
public class Node <T>{
    //Declares the Variables
    private T content;
    private Node next;

    public Node(T content, Node next) {
        //Default Constructor
        this.content = content;
        this.next = next;
    }
//Getters and Setters
    public Object getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
