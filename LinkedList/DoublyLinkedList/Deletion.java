package LinkedList.DoublyLinkedList;


class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

   
    void deleteAtHead() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        if (head.next == null) { 
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    
    void deleteAtTail() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        if (head.next == null) { 
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) { 
            temp = temp.next;
        }
        temp.prev.next = null; 
    }

    
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        if (position == 1) { 
            deleteAtHead();
            return;
        }

        Node temp = head;
        int count = 1;
        while (temp != null && count < position) {
            temp = temp.next;
            count++;
        }
        if (temp == null) { 
            System.out.println("Position out of range.");
            return;
        }
        if (temp.next == null) { 
            deleteAtTail();
            return;
        }

        temp.prev.next = temp.next; 
        temp.next.prev = temp.prev;
    }

    
    void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add a node at the end
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
}

public class Deletion {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

       
        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.append(40);
        System.out.println("Original List:");
        dll.printList();

        System.out.println("After deleting at head:");
        dll.deleteAtHead();
        dll.printList();

       
        System.out.println("After deleting at tail:");
        dll.deleteAtTail();
        dll.printList();

        
        System.out.println("After deleting at position 2:");
        dll.deleteAtPosition(2);
        dll.printList();
    }
}
