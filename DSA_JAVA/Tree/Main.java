package Tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("-- 1.BFS: Breadth First Search: ");
        System.out.println(myBST.BFS() + "\n");

        System.out.println("-- 2.DFS: PreOrder Traversal: ");
        System.out.println(myBST.DFSPreOrder()+ "\n");

        System.out.println("-- 3.DFS: PostOrder Traversal: ");
        System.out.println(myBST.DFSPostOrder()+ "\n");

        System.out.println("-- 4.DFS: InOrder Traversal: ");
        System.out.println(myBST.DFSInOrder()+ "\n");
    }
}
