package LinkedList.CircularLinkedList.SinglyCircular;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Search_Length {
    Node head;

    // Method to find the length of the list
    int getLength() {
        if (head == null) {
            return 0;
        }

        Node temp = head;
        int count = 0;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    // Method to search for a value in the list
    boolean search(int value) {
        if (head == null) {
            return false;
        }

        Node temp = head;

        do {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);

        return false;
    }

    // Method to display the list
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        Search_Length list = new Search_Length();

        // Adding some nodes
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = list.head;

        System.out.println("Circular Linked List:");
        list.display();

        // Finding length
        System.out.println("Length of the list: " + list.getLength());

        
        int searchValue = 20;
        System.out.println("Is value " + searchValue + " present? " + list.search(searchValue));

        searchValue = 40;
        System.out.println("Is value " + searchValue + " present? " + list.search(searchValue));
    }
}

