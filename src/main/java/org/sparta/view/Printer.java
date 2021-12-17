package org.sparta.view;

import org.sparta.model.sorters.Sortable;
import java.util.Arrays;

public class Printer {

    public static void printMessage(String message) {
        System.out.print(message);

    }

    public static void printInfo(Sortable sorter, int[] random) {
        System.out.print(sorter.getName() + " selected.\n" +
                "Before sorting:\n" + Arrays.toString(random) +
                "\nAfter sorting: \n" + Arrays.toString(sorter.sort(random)) +
                "\nOperation took " + sorter.getTime() + " microseconds");
    }
}