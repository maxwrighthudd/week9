package binaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void insert() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        binaryTree.insert(10);
        binaryTree.insert(8);
        binaryTree.insert(11);

        assertTrue(binaryTree.contains(10));
        assertTrue(binaryTree.contains(8));
        assertTrue(binaryTree.contains(11));

        System.out.println(binaryTree);
    }

    @Test
    void getValue() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        binaryTree.insert(11);
        binaryTree.insert(13);
        binaryTree.insert(6);
        binaryTree.insert(9);

        int result = binaryTree.getValue();

        assertEquals(result, 11);

        System.out.println(binaryTree.getValue());
    }

    @Test
    void setValue() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insert(5);
        binaryTree.insert(11);
        binaryTree.insert(13);
        binaryTree.insert(22);

        binaryTree.setValue(4);

        int result = binaryTree.getValue();

        assertEquals(result, 4);

        System.out.println(binaryTree.getValue());
    }

    @Test
    void contains() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        binaryTree.insert(12);
        binaryTree.insert(8);
        binaryTree.insert(4);
        binaryTree.insert(13);
        binaryTree.insert(9);
        binaryTree.insert(3);

        System.out.println(binaryTree);

        assertTrue(binaryTree.contains(3));
    }

    @Test
    void containsString() {
        BinaryTree<String> stringTree = new BinaryTree<>();

        stringTree.insert("algorithms");
        stringTree.insert("and");
        stringTree.insert("data");
        stringTree.insert("processes");


        System.out.println(stringTree);

        assertTrue(stringTree.contains("data"));
    }



    @Test
    void traverse() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        binaryTree.insert(12);
        binaryTree.insert(10);
        binaryTree.insert(4);
        binaryTree.insert(13);
        binaryTree.insert(8);
        binaryTree.insert(3);

        binaryTree.traverse();
    }

    @Test
    void stringTraverse() {
        BinaryTree<String> binaryTree = new BinaryTree<>();

        binaryTree.insert("the");
        binaryTree.insert("university");
        binaryTree.insert("of");
        binaryTree.insert("huddersfield");
        binaryTree.insert("West");
        binaryTree.insert("Yorkshire");

        binaryTree.traverse();
    }

    @Test
    void getLeft() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insert(15);
        binaryTree.insert(7);
        binaryTree.insert(12);
        binaryTree.insert(2);
        binaryTree.insert(20);
        binaryTree.insert(6);

        System.out.println(binaryTree.getLeft());

        //add assertEquals method here
    }

    @Test
    void setLeft() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        BinaryTree<Integer> newBinaryTree = new BinaryTree<>();

        binaryTree.insert(6);
        binaryTree.insert(4);
        binaryTree.insert(3);
        binaryTree.insert(2);
        binaryTree.insert(7);

        newBinaryTree.insert(5);
        newBinaryTree.insert(2);
        newBinaryTree.insert(1);

        binaryTree.setLeft(newBinaryTree);

        System.out.println(binaryTree);
    }

    @Test
    void getRight() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insert(15);
        binaryTree.insert(7);
        binaryTree.insert(12);
        binaryTree.insert(2);
        binaryTree.insert(20);
        binaryTree.insert(6);

        System.out.println(binaryTree.getRight());
        //add assertEquals method here
    }

    @Test
    void setRight() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        BinaryTree<Integer> newBinaryTree = new BinaryTree<>();

        binaryTree.insert(22);
        binaryTree.insert(11);
        binaryTree.insert(2);
        binaryTree.insert(6);
        binaryTree.insert(54);
        binaryTree.insert(37);
        binaryTree.insert(92);

        newBinaryTree.insert(66);
        newBinaryTree.insert(25);
        newBinaryTree.insert(105);

        binaryTree.setRight(newBinaryTree);
        System.out.println(binaryTree);
    }
}