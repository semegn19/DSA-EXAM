package DSA2;

public class stack {
    //static int [] numbers;
    static int size;
    static int top=-1;
    stack(int size) {
         this.size = size;
    }
    static int [] numbers= new int[size];
     void push(int item) {
        if(top==size-1){
            System.out.println("Stack is full");
        }
        else{
            numbers[++top]=item;
        }

    }
    static boolean isEmpty(){
        return top==-1;
    }

    int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return numbers[top--];
        }

    }
     int peek(int item) {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        else
            return numbers[top];

    }
    int size(){
        return top;
    }

    public static void main(String[] args) {
        stack numbers= new stack(4);
        numbers.push(4);
        numbers.push(6);
        System.out.println(numbers.pop());



    }
}
