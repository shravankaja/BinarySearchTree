package com.binarytree;

public class BinarySearchTree<K extends Comparable<K>> {
    public BinaryNode<K> root;

    public void addNodeRecursiveFashion(K key) {
        this.root = this.addNodeActual(root, key);
    }

    private BinaryNode<K> addNodeActual(BinaryNode<K> current, K key) {
        if (current == null) {
            return new BinaryNode<K>(key);
        } else {
            if (key.compareTo(current.key) == 0) {
                return current;
            } else if (key.compareTo(current.key) < 0) {
                current.left = addNodeActual(current.left, key);
            } else if (key.compareTo(current.key) > 0) {
                current.right = addNodeActual(current.right, key);
            }
        }
        return current;
    }

    public int size() {
        return getSize(this.root);
    }

    private int getSize(BinaryNode<K> current) {

        if (current == null) {
            return 0;
        } else {
            return 1 + this.getSize(current.left) + this.getSize(current.right);
        }
    }

    public void searchTree(K key) {
        search(this.root, key);
    }

    private void search(BinaryNode<K> current, K key) {

        if (key.compareTo(current.key) == 0) {
            System.out.println("Found");
        } else if (key.compareTo(current.key) < 0) {
            search(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            search(current.right, key);
        }
    }
}
