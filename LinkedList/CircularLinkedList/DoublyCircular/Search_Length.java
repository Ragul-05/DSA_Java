package LinkedList.CircularLinkedList.DoublyCircular;

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class DoublyCircularLinkedList {
    Node head;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    int length() {
        if (head == null) return 0;

        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

  
    boolean search(int key) {
        if (head == null) return false;

        Node temp = head;
        do {
            if (temp.data == key) return true;
            temp = temp.next;
        } while (temp != head);

        return false;
    }

 
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }
}

public class Search_Length {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

       
        System.out.println("Doubly Circular Linked List:");
        list.display();

        System.out.println("Length of the list: " + list.length());

        
        int keyToSearch = 20;
        if (list.search(keyToSearch)) {
            System.out.println("Element " + keyToSearch + " is present in the list.");
        } else {
            System.out.println("Element " + keyToSearch + " is not found in the list.");
        }

      
        keyToSearch = 50;
        if (list.search(keyToSearch)) {
            System.out.println("Element " + keyToSearch + " is present in the list.");
        } else {
            System.out.println("Element " + keyToSearch + " is not found in the list.");
        }
    }
}
