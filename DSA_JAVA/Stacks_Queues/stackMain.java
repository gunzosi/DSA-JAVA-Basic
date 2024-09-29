package Stacks_Queues;

public class stackMain {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        myStack.push(10);
        myStack.push(15);

        myStack.pop();

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();
    }
}
