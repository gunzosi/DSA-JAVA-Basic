package LinkedList;

public abstract class INode {
    protected Node head = null;
    protected Node tail;
    protected int length = 0;

    static class Node {
        int value;
        LinkedList.Node next;
        Node(int value) {
            this.value = value;
        }
    }

    INode(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    protected void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    protected void getTail() {
        if (tail == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    protected void getLength() {
        System.out.println("Length: " + length);
    }
}