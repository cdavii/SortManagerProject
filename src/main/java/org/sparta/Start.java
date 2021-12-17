package org.sparta;

import org.sparta.controller.UserInput;
import org.sparta.model.sorters.Sortable;
import org.sparta.view.Printer;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

import static org.sparta.controller.Loader.loadRandomArray;
import static org.sparta.controller.Loader.loadSortingAlgorithm;
import static org.sparta.logging.MyLogger.myLogger;

public class Start {

    static void run() {
        myLogger.setLevel(Level.ALL);
        myLogger.setUseParentHandlers(false);

        myLogger.log(Level.INFO, "Start of program");
        Printer.printMessage("Please select a sorting algorithm: \n 1. Bubble sort \n 2. Merge sort \n 3. Binary tree sort\n");
        Sortable mySorter = loadSortingAlgorithm(UserInput.sorterSelection());
        Printer.printMessage("Please select the size of the array\n");
        int[] randomArray = loadRandomArray(UserInput.arraySizeSelection());
        UserInput.closeScanner();

        Printer.printInfo(mySorter, randomArray);
    }
}
