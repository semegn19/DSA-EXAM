package DSA3;

import java.util.Stack;

public class QueueSTACK {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int data) {
        stack1.push(data);
    }

    int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack2.pop();
        }
    }

    int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack2.peek();
        }


    }
    public static void main(String[] args) {
        QueueSTACK q = new QueueSTACK();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
