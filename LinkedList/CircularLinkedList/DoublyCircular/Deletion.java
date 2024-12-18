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

    // Delete from the beginning

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode.prev = newNode;
            head = newNode;
            return;
        }

        Node tail = head.prev;
        newNode.next = head;
        newNode.prev = tail;
        tail.next = head.prev = newNode;
        head = newNode;
    }
    void deleteFromBeginning() {
        if (head == null) { 
            System.out.println("List is empty.");
            return;
        }

        if (head.next == head) { 
            head = null;
            return;
        }

        Node tail = head.prev;
        head = head.next;
        tail.next = head;
        head.prev = tail;
    }

    // Delete from the end
    void deleteFromEnd() {
        if (head == null) { 
            System.out.println("List is empty.");
            return;
        }

        if (head.next == head) { 
            head = null;
            return;
        }

        Node tail = head.prev;
        tail.prev.next = head;
        head.prev = tail.prev;
    }

    
    void deleteFromPosition(int position) {
        if (head == null) { 
            System.out.println("List is empty.");
            return;
        }

        if (position <= 1) { 
            deleteFromBeginning();
            return;
        }

        Node temp = head;
        int count = 1;

        while (count < position && temp.next != head) {
            temp = temp.next;
            count++;
        }

        if (temp.next == head) {
            deleteFromEnd();
            return;
        }

       
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
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

public class Deletion {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        System.out.println("Original List:");
        list.display();

       
        list.deleteFromBeginning();
        System.out.println("After deleting from the beginning:");
        list.display();

      
        list.deleteFromEnd();
        System.out.println("After deleting from the end:");
        list.display();

      
        list.deleteFromPosition(1);
        System.out.println("After deleting from position 1:");
        list.display();
    }
}

