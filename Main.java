import queue.Queue;
import stack.Stack;

public class Main {

    public static void main(String[] args) {
        
       Stack stack = new Stack(5);
       stack.push(10);
       stack.push(10);
       stack.push(10);
       stack.push(10);
       stack.push(10);
       stack.pop();
       stack.push(10);
    }
}