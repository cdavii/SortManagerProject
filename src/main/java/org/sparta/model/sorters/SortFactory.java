package org.sparta.model.sorters;


import org.sparta.model.sorters.binary_tree.BinaryTree;

public class SortFactory {

    public static Sortable getSorter(int selection){
        switch (selection) {
            case 1 -> {
                System.out.println("Bubble sort selected");
                return new BubbleSort();
            }
            case 2 -> {
                System.out.println("Merge sort selected");
                return new MergeSort();
            }
            case 3 -> {
                System.out.println("Bubble sort selected");
                return new BinaryTree();
            }
        }
        return null;
    }
}
