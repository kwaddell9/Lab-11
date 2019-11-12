package edu.cscc;
//Kelly Waddell 11/12/2019 Main Class
public class Main {

    public static void main(String[] args) {
        list1();
        list2();
    }

    // Use linked list with Strings
    public static void list1() {
        LinkedList <String> llist  = new LinkedList<>();
        //Adds Elements into the Linked List
        llist.addFirst("one");
        llist.addLast("two");
        llist.addLast("three");
        llist.addFirst("Zero");
        llist.addLast("xxxx");
        llist.addFirst("yyyyy");
        //Removes first and last elements from Linked List
        llist.deleateLast();
        llist.deleteFirst();
        System.out.println(llist);
        //Removes All elements from Linked List
        llist.deleteFirst();
        llist.deleateLast();
        llist.deleteFirst();
        llist.deleateLast();
        //Prints Empty List
        System.out.println(llist);
    }

    // Use linked list with Integers
    public static void list2() {
        LinkedList <Integer> llist  = new LinkedList<>();
        //Adds Elements to Linked List
        llist.addFirst(1);
        llist.addLast(2);
        llist.addLast(3);
        llist.addFirst(0);
        llist.addLast(142);
        llist.addFirst(-97);
        //Removes first and Last element from Linked List
        llist.deleateLast();
        llist.deleteFirst();
        System.out.println(llist);
        //Clears Linked List
        llist.deleteFirst();
        llist.deleateLast();
        llist.deleteFirst();
        llist.deleateLast();
       //Prints Empty List
        System.out.println(llist);
    }
}
