package stack;

public class Stack {
    
    private int[] elements;
    private int length;
    private int top;

    public Stack(int length) {
        this.length = length;
        this.top = 0;
        this.elements = new int[length];
    }

    public void push(int element) {
        
        if (isFull()) {
            throw new RuntimeException("stack is full");
        }

        this.elements[this.top] = element;
        this.top++;
    }

    public int pop() {

        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        int index = this.top - 1;
        int element = this.elements[index];
        this.elements[index] = 0;
        this.top--;
        return element;
    }

    public boolean isFull() {
        return this.top == this.length;
    }

    public boolean isEmpty() {
        return this.top == 0;
    }
}
