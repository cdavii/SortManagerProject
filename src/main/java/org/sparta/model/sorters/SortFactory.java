package org.sparta.model.sorters;


import org.sparta.model.sorters.binary_tree.BinaryTree;

import java.util.logging.Level;

import static org.sparta.logging.MyLogger.myLogger;

public class SortFactory {

    public static Sortable getSorter(int selection){
        switch (selection) {
            case 1 -> {
                myLogger.log(Level.INFO, "Bubble sort selected");
                return new BubbleSort();
            }
            case 2 -> {
                myLogger.log(Level.INFO, "Merge sort selected");
                return new MergeSort();
            }
            case 3 -> {
                myLogger.log(Level.INFO, "Binary tree sort selected");
                return new BinaryTree();
            }
        }
        return null;
    }
}
