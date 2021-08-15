package BST;

public class BinarySearchTree {

    private int value;
    private BinarySearchTree right;
    private BinarySearchTree left;

    public BinarySearchTree(int value) {
        this.value = value;
    }

    public void addChild(int value) {
        BinarySearchTree newBst = new BinarySearchTree(value);

        if (value >= this.value) {
            if (this.right == null) {
                this.right = newBst;
            } else {
                this.addChild(value);
            }
        } else {
            if (value < this.value) {
                if (this.left == null) {
                    this.left = newBst;
                } else {
                    this.addChild(value);
                }
            }
        }
    }

    public void printBST() {
        System.out.println("Root: " + this.value);
        if (this.left != null && this.right != null) {
            System.out.println("\nHijo izquierdo:" + this.left.getValue() + "\nHijo derecho:" + this.right.getValue());
            return;
        }

        if (this.left != null) {
            System.out.println("\nHijo izquierdo:" + this.left.getValue());
            return;
        }
        
        if (this.right != null) {
            System.out.println("\nHijo derecho:" + this.right.getValue());
        }

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinarySearchTree getRight() {
        return right;
    }

    public void setRight(BinarySearchTree right) {
        this.right = right;
    }

    public BinarySearchTree getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTree left) {
        this.left = left;
    }

}
