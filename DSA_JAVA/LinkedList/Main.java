package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        // 23. Append
        System.out.println("23. Append value: ");
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        // 25. Remove Last
        System.out.println("25. Remove Last value: ");
//        System.out.println(myLinkedList.removeLast().value);
        //System.out.println(myLinkedList.removeLast());

        // 26. Prepend
        System.out.println("26. Prepend value: ");
        // myLinkedList.prepend(2);

        // 27. Remove First
        System.out.println("27. Remove First value: ");
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst());

        // 28. Get
        System.out.println("28. Get value: ");
        // System.out.println(myLinkedList.get(1).value);

        // 29. Set
        System.out.println("29. Set value: ");
        // [ 3 -> 2 -> 4  ] >> [ 3 -> 5 -> 4 ]
        // myLinkedList.set(1, 5);

        // 30. Insert
        System.out.println("30. Insert value: ");
        // [ 3 -> 5 -> 4  ] >> [ 3 -> 5 -> 6 -> 4 ]
        // myLinkedList.insert(2, 6);

        // 31. Remove
        System.out.println("31. Remove value: ");
        //myLinkedList.remove(1);

        // 32. Reverse
        System.out.println("32. Reverse value: ");
        myLinkedList.reverse();


        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
    }
}
