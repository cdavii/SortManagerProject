package org.sparta.model.sorters;

import java.util.Arrays;
import java.util.logging.Level;

import static org.sparta.logging.MyLogger.myLogger;

public class BubbleSort implements Sortable {

    long elapsedTime;
    int swaps = 0;

    @Override
    public String name() {
        return "Bubble sort";
    }

    @Override
    public int[] sort(int[] arr){
        int length = arr.length;
        myLogger.log(Level.FINE, "Array initialised by" + name());
        long startTime = System.nanoTime();

        for (int i = 0; i < length; i++){
            for (int j = 1; j < length - i; j++){
                if (arr[j] < arr[j-1]){
                    // Swap arr[j] and arr[j-1]
                    swap(arr, j, j -1);
                }
            }
        }
        myLogger.log(Level.FINE, "Swap method called " + swaps + " time(s)");
        myLogger.log(Level.FINE, "Sort operation finished by" + name());
        long endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1000;
        myLogger.log(Level.INFO, "Array after sorting:\n" + Arrays.toString(arr));
        return arr;
    }

    @Override
    public long getTime() {
        myLogger.log(Level.INFO, "Sort operation finished in " + elapsedTime + " microseconds.");
        return elapsedTime;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        swaps++;
    }
}