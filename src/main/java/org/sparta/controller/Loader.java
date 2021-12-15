package org.sparta.controller;

import org.sparta.model.array_generator.ArrayGenerator;
import org.sparta.model.sorters.Sortable;
import org.sparta.model.sorters.SortFactory;

public class Loader {

    public static Sortable loadSortingAlgorithm(int selection) {
        Sortable mySorter = SortFactory.getSorter(selection);
        return mySorter;
    }


    public static int[] loadRandomArray(int sizeSelection) {
        ArrayGenerator generator = new ArrayGenerator();
        int[] randomArray = generator.randomArrayGenerator(sizeSelection);
        return randomArray;
    }
}