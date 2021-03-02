package com.binarytree;

public class BinaryNode<K extends Comparable<K>> {
    public K key;
    public BinaryNode<K> left;
    public BinaryNode<K> right;

    public BinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
