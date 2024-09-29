package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    Node root;

    public static class Node {
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int value){
        Node newNode = new Node(value);
        if (root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            // If newNode value duplicate with existing node, return false
            if (newNode.value == temp.value) return false;
            // Check LEFT & RIGHT of TREE
            if (newNode.value < temp.value){
                if (temp.left == null){
                    temp.left = newNode;
                    return true;
                } else {
                    temp = temp.left;
                }
            } else {
                if (temp.right == null){
                    temp.right = newNode;
                    return true;
                } else {
                    temp = temp.right;
                }
            }
        }
    }

    public boolean contains(int value ){
        if (root == null) return false;
        Node temp = root;
        while (temp != null){
            if(value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value){
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    // --------------------  Recursive Binary Search Tree

    // 0. Recursive Binary Search Tree Insert



    // 1. Contains Node in Tree by Recursive
    private Boolean rContains(Node currentNode, int value){
        if (currentNode == null) return false;
        if (currentNode.value == value) return true;

        if (value  < currentNode.value) {
            return rContains(currentNode.left , value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value){
        return rContains(root, value);
    }

    // 2. Insert Node in Tree by Recursive
    private Node rInsert (Node currentNode, int value){
        if (currentNode == null) return new Node(value);
        if (value < currentNode.value){
            currentNode.left = rInsert(currentNode.left, value);
        } else {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value){
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    // ---- 3. Remove Node in Tree by Recursive
    private Node rDeleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;

        if (value < currentNode.value){
            currentNode.left = rDeleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rDeleteNode(currentNode.right, value);
        }  else {
            // Case 1: No Child (no left and right)
            if (currentNode.left == null && currentNode.right == null) {
                currentNode = null;
            }
            // Case 2: ONLY One Child on LEFT or RIGHT
            else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            }
            // Case 3: Two Child (left and right)
            else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = rDeleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    // Helper Function
    public int minValue(Node currentNode){
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
        // This METHOD return a VALUE not a NODE
    }

    public void rDeleteNode(int value){
        rDeleteNode(root, value);
    }


    // ------------------------------------------------------------------------- TREE TRAVERSAL

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        // while(!queue.isEmpty()){
         while (queue.size() > 0) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode){
                results.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        // Call the Traverse class and the constructor will automatically run
        new Traverse(root);
        return results;
    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }

        new Traverse(root);
        return results;
    }

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }


}
