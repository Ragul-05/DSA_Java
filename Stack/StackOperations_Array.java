package Stack;

class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    Stack(int size) {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + data);
            return;
        }
        stackArray[++top] = data;
        System.out.println("Pushed " + data + " onto the stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! The stack is empty.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

  
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

 
    public void display() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class StackOperations_Array {
    public static void main(String[] args) {
        Stack stack = new Stack(5);


        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.push(60);

        stack.display();

        System.out.println("Top element: " + stack.peek());

       
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

       
        stack.display();
    }
}

