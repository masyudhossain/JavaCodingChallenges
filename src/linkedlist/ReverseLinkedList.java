package linkedlist;
/** Given a pointer to the head node of a linked list,
 write a program to reverse the linked list **/

/* Approach
To reverse a linked list, we implement an iterative method:
1. Initialize three-pointers: prev as NULL, current as head, and next as NULL.
2. Iterate through the linked list. Inside the loop, do the following:
// Before changing next of current, store next node
next = current->next
// Now change next of current, here is where actual reversing happens
current->next = prev
// Move prev and current one step forward
prev = current

current = next
* */

public class ReverseLinkedList<T> {

    private Node head; // head node of the linked list

    // Inner class representing the Node of Linked List
    private class Node {
        final T data; // data stored in the node
        Node next;   // reference to the next node

        private Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adding node to the linked list at the end
    public void add(T data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // If list is empty, new node becomes the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode; // Add new node at the end
        }
    }

    // Reverse the linked list
    public void reverse() {
        if (head == null) {
            return; // Empty list, nothing to reverse
        }
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;  // Store next node
            current.next = prev; // Reverse the pointer
            prev = current;      // Move prev to current
            current = next;      // Move current to next
        }
        head = prev; // Update the head to the last node (which is now first)
    }

    // Traversing the linked list in String format
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // Main method to test
    public static void main(String[] args) {
        ReverseLinkedList<String> linkedList = new ReverseLinkedList<>();
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");
        linkedList.add("s4");

        System.out.println("Original Linked List: " + linkedList);
        linkedList.reverse();
        System.out.println("Reversed Linked List: " + linkedList);
    }
}
