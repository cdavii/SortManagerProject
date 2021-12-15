package org.sparta;

import org.sparta.controller.UserInput;
import org.sparta.model.sorters.Sortable;
import org.sparta.view.Printer;

import static org.sparta.controller.Loader.loadRandomArray;
import static org.sparta.controller.Loader.loadSortingAlgorithm;

public class Start {

    static void run() {
        Printer.printMessage("Please select a sorting algorithm: \n 1. Bubble sort \n 2. Merge sort \n 3. Binary tree sort\n");
        Sortable mySorter = loadSortingAlgorithm(UserInput.sorterSelection());
        Printer.printMessage("Please select the size of the array\n");
        int[] randomArray = loadRandomArray(UserInput.arraySizeSelection());
        UserInput.closeScanner();

        Printer.printInfo(mySorter, randomArray);
    }
}
