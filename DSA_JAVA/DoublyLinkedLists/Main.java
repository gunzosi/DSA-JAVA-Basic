package DoublyLinkedLists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);

        myDLL.remove(1);

        myDLL.printList();
    }
}
