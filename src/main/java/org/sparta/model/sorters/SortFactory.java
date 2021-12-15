package org.sparta.model.sorters;


import org.sparta.model.sorters.binary_tree.BinaryTree;

public class SortFactory {

    public static Sortable getSorter(int selection){
        switch (selection) {
            case 1 -> {
                return new BubbleSort();
            }
            case 2 -> {
                return new MergeSort();
            }
            case 3 -> {
                return new BinaryTree();
            }
        }
        return null;
    }
}
