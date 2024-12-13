package LinkedList.SinglyLinkedList;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList {
    Node head;
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Search for a value in the list
    boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

       
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

       
        int searchKey = 30;
        if (list.search(searchKey)) {
            System.out.println("Element " + searchKey + " is found in the list.");
        } else {
            System.out.println("Element " + searchKey + " is not found in the list.");
        }
    }
}
