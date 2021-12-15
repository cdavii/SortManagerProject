package org.sparta.model.sorters;

public class BubbleSort implements Sortable {

    long elapsedTime;

    @Override
    public String name() {
        return "Bubble sort";
    }

    @Override
    public int[] sort(int[] arr){
        int length = arr.length;
        long startTime = System.nanoTime();

        for (int i = 0; i < length; i++){
            for (int j = 1; j < length - i; j++){
                if (arr[j] < arr[j-1]){
                    // Swap arr[j] and arr[j-1]
                    swap(arr, j, j -1);
                }
            }
        }
        long endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1000;
        return arr;
    }

    @Override
    public long getTime() {
        return elapsedTime;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}