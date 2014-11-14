package be.tdev.collection.tree;

import javafx.util.Pair;

/**
 * Created by delskev on 14/11/2014.
 */
public class Node{
    private Object root;
    private Node leftLeaf;
    private Node rightLeaf;

    public Node() {
        this.root = null;
        this.leftLeaf = null;
        this.rightLeaf = null;
    }

    public Node(Object root) {
        this.root = root;
        this.leftLeaf = null;
        this.rightLeaf = null;
    }

    public Object getRoot() {
        return root;
    }

    public void setRoot(Object root) {
        this.root = root;
    }

    public Node getLeftLeaf() {
        return leftLeaf;
    }

    public void setLeftLeaf(Node leftLeaf) {
        this.leftLeaf = leftLeaf;
    }

    public Node getRightLeaf() {
        return rightLeaf;
    }

    public void setRightLeaf(Node rightLeaf) {
        this.rightLeaf = rightLeaf;
    }
}
