package com.binarytree;

import org.junit.jupiter.api.*;

public class BinaryTreeTest {

    @Test
    void test() {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.addNodeRecursiveFashion(56);
        binarySearchTree.addNodeRecursiveFashion(30);
        binarySearchTree.addNodeRecursiveFashion(76);
        int size=binarySearchTree.size();
        Assertions.assertEquals(3,size);
    }
}
