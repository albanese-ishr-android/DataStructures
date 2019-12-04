package BinaryTrees;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class BinaryTree {

    public Node root;

    BinaryTree() {
        root = null;
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.data) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.data) {
            return true;
        }
        return value < current.data
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }


    public int smallest(Node root){
        while(root.left != null) {
            root = root.left;
        }

        return  root.data;
    }

    public int largest(Node root){
        while(root.right != null){
            root = root.right;
        }

        return root.data;
        //return root.data;
    }

    public void print(Node node){

        //System.out.println("Operating on Node: " + node.data);
        if(node == null){
            System.out.println("return!");
            return;
        }

        System.out.println("print called on node.left: Node- " + node.data);
        print(node.left);
        System.out.println("print called on node.right: Node- " + node.data);
        print(node.right);
        System.out.println("Here is the data: " + node.data + " ");


    }

}
