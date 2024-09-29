package Stacks_Queues;

public class Queue {
    private  Node first;
    private  Node last;
    private  int length;

    class Node{
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue(){
        Node temp = first;
        System.out.println("Queue Value : ");
        System.out.println("First---------");
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("Last----------");
    }

    public void getFirst() {
        System.out.println("- First: " +first.value);
    }

    public void getLast() {
        System.out.println("- Last: " +last.value);
    }

    public void getLength() {
        System.out.println("- Length: " + length);
    }

    /*
      Last In (Enqueue) , First Out (Dequeue)
      Last of LinkedList is O(1) and add "LI" of "LIFO"
      First of LinkedList is O(1) and add "FO" of "FIFO"
     */

    public void enqueue(int value){
        Node newNode = new Node(value);
        if (length == 0 ){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if (length == 0) {
            return null;
        }
        Node temp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

}
