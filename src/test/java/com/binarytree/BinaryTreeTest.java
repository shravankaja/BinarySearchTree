package com.binarytree;

import org.junit.jupiter.api.*;

public class BinaryTreeTest {

    @Test
    void test() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.addNodeRecursiveFashion(56);
        binarySearchTree.addNodeRecursiveFashion(30);
        binarySearchTree.addNodeRecursiveFashion(70);
        binarySearchTree.addNodeRecursiveFashion(22);
        binarySearchTree.addNodeRecursiveFashion(40);
        binarySearchTree.addNodeRecursiveFashion(60);
        binarySearchTree.addNodeRecursiveFashion(95);
        binarySearchTree.addNodeRecursiveFashion(11);
        binarySearchTree.addNodeRecursiveFashion(65);
        binarySearchTree.addNodeRecursiveFashion(3);
        binarySearchTree.addNodeRecursiveFashion(16);
        binarySearchTree.addNodeRecursiveFashion(63);
        binarySearchTree.addNodeRecursiveFashion(67);
        int size = binarySearchTree.size();
        Assertions.assertEquals(13, size);
    }
}
