package main;
import BST.BinarySearchTree; 

public class Test {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(15);
        bst.printBST();
        bst.addChild(0);
        bst.addChild(50);
        bst.printBST();
    }
}
