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

    
    int getLength() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

  
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Length of the list:"+ list.getLength());
        
    }
}
