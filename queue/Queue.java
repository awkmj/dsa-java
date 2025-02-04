package queue;

public class Queue {
    
    private int length;
    private int[] elements;
    private int begin;
    private int end;

    public Queue(int length) {
        this.begin = 0;
        this.end = 0;
        this.length = length;
        this.elements = new int[length];
    }

    public void enqueue(int element) {

        if (isFull()) {
            throw new RuntimeException("queue is full");
        }

        this.elements[this.end % this.length] = element;
        this.end++; 
    }

    public void dequeue() {

        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        this.elements[this.begin % this.length] = 0;
        this.begin++;
    }

    public boolean isFull() {
        return (this.end - this.begin) == this.length;
    }

    public boolean isEmpty() {

        return this.begin == this.end;
    }
}
