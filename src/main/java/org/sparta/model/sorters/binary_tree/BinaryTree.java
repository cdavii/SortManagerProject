package org.sparta.model.sorters.binary_tree;

import org.sparta.logging.MyLogger;
import org.sparta.model.sorters.Sortable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;

import static org.sparta.logging.MyLogger.myLogger;

public class BinaryTree implements Sortable {

    private Node rootNode;
    private ArrayList<Integer> sorted = new ArrayList<>();
    private long elapsedTime;


    @Override
    public String name() {
        return "Binary tree sort";
    }

    @Override
    public int[] sort(int[] array) {
        buildTree(array);
        inOrderTraversal(rootNode);
        return getSorted();
    }

    @Override
    public long getTime() {
        myLogger.log(Level.INFO, "Sort operation finished in " + elapsedTime + " microseconds.");
        return elapsedTime;
    }

     private void buildTree(final int[] array) {
        rootNode = new Node(array[0]);
        myLogger.log(Level.FINE, "Tree initialised with root node of value: " + array[0]);
        for (int i = 1; i < array.length; i++) {
            addNodeRecursive(rootNode, array[i]);
        }
    }

    private int[] getSorted() {
        int[] arr = sorted.stream().mapToInt(i -> i).toArray();
        myLogger.log(Level.FINE, "Sort operation complete");
        myLogger.log(Level.INFO, "Array after sorting:\n" + Arrays.toString(arr));
        return arr;
    }

    private void addNodeRecursive(Node currentNode, final int element) {
        if (element <= currentNode.getValue()) {
            if (currentNode.isLeftChildEmpty()) {
                currentNode.setLeftChild(new Node(element));
                myLogger.log(Level.FINE, "Node added to tree with value: " + element);
            } else {
                addNodeRecursive(currentNode.getLeftChild(), element);
            }
        } else {
            if (currentNode.isRightChildEmpty()) {
                currentNode.setRightChild(new Node (element));
                myLogger.log(Level.FINE, "Node added to tree with value: " + element);
            } else {
                addNodeRecursive(currentNode.getRightChild(), element);
            }
        }

    }

    private void inOrderTraversal(Node currentNode) {
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
