package org.sparta.model.sorters.binary_tree;

import org.sparta.model.sorters.Sortable;

import java.util.ArrayList;

public class BinaryTree implements Sortable {

    private Node rootNode;
    private int numberOfNodes;
    private ArrayList<Integer> sorted = new ArrayList<Integer>();
    private long elapsedTime;


    @Override
    public int[] sort(int[] array) {
        buildTree(array);
        inOrderTraversal(rootNode);
        return getSorted();
    }

    @Override
    public long getTime() {
        return elapsedTime;
    }

    // Methods set to package-private to allow for testing
     void buildTree(final int[] array) {
        rootNode = new Node(array[0]);
        for (int i = 1; i < array.length; i++) {
            addNodeRecursive(rootNode, array[i]);
            numberOfNodes++;
        }
    }

    private int[] getSorted() {
        return sorted.stream().mapToInt(i -> (int) i).toArray();
    }

    void addNodeRecursive(Node currentNode, final int element) {
        if (element <= currentNode.getValue()) {
            if (currentNode.isLeftChildEmpty()) {
                currentNode.setLeftChild(new Node(element));
            } else {
                addNodeRecursive(currentNode.getLeftChild(), element);
            }
        } else {
            if (currentNode.isRightChildEmpty()) {
                currentNode.setRightChild(new Node (element));
            } else {
                addNodeRecursive(currentNode.getRightChild(), element);
            }
        }
    }

    void inOrderTraversal(Node currentNode) {
        //ArrayList sorted = new ArrayList<Integer>();
        //int index = 0;
        long startTime = System.nanoTime();
        if (currentNode != null) {
            inOrderTraversal(currentNode.getLeftChild());
            sorted.add(currentNode.getValue());
            inOrderTraversal(currentNode.getRightChild());
        }
        long endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1000;
    }
}
