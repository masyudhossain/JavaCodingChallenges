package linkedlist;

import java.util.StringJoiner;

public class LinkedList<T> { // generic linked list
    Node head;

    //initializing a linked list
    private class Node{

        final T data;
        Node next;  //next is by default as null

        private Node(T data) {
            this.data = data;
            this.next =null;
        }
    }

    //adding a node in three ways
    /*
    * At the front of the linked list.
    * Before/After a given node
    * At the end of the linked list. */

    /* Steps to add a new Node:
    * Create a new node with the given data.
    * If the head node is null (Empty Linked List), make the new node the head
    * If the head node is not null, find the last node.
    * Make the last node => next as the new node. */

    //adding a new node

    public void add(T data){
        Node node = new Node(data);

        if (head==null){
            head = node;
        }
        else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
        }
    }

    // traversing a linked list

    /*Traverse means printing all data included in a linked list by traversing
     the list from the head node to the last node.*/

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(" -> ", "[", "]");
        Node currentNode = head;
        while (currentNode != null) {
            stringJoiner.add(currentNode.data.toString());
            currentNode = currentNode.next;
        }
        return stringJoiner.toString();
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");
        linkedList.add("s4");
        System.out.println(linkedList.toString());
    }
}
