package LinkedList.SinglyLinkedList;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // 1. Delete from the beginning
    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        head = head.next;
    }

    // 2. Delete from the end
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.next == null) { 
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null; 
    }

    // 3. Delete from a specific position
    void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (position == 1) { // If the head is to be deleted
            head = head.next;
            return;
        }

        Node current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of range.");
            return;
        }

        current.next = current.next.next; // Skip the node at the given position
    }

    // Traverse and display the list
    void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

       
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

       
        System.out.println("Original List:");
        list.display();

        
        list.deleteFromBeginning();
        System.out.println("\nAfter deleting from the beginning:");
        list.display();

       
        list.deleteFromEnd();
        System.out.println("\nAfter deleting from the end:");
        list.display();

       
        list.deleteFromPosition(2);
        System.out.println("\nAfter deleting from position 2:");
        list.display();
    }
}

