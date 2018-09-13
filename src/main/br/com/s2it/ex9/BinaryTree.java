package br.com.s2it.ex9;

public class BinaryTree {
    private int value;
    private BinaryTree left;
    private BinaryTree right;

    private int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    private BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public int sum(BinaryTree node) {
        return node == null ? 0 : node.getValue() + sum(node.getLeft()) + sum(node.getRight());
    }
}
