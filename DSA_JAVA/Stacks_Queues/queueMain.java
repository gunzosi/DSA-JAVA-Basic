package Stacks_Queues;

public class queueMain {
    public static void main(String[] args) {
        Queue myQueue = new Queue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        System.out.println(" Dequeue Value : " + myQueue.dequeue().value);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
    }
}
