package org.sparta.model.sorters;

public class MergeSort implements Sortable{

    long elapsedTime;

    @Override
    public int[] sort(int[] array) {
        return mergeSort(array, new int[array.length], 0, array.length - 1);
    }

    @Override
    public long getTime() {
        return elapsedTime;
    }


    private int[] mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd) {
        long startTime = System.nanoTime();

        if (leftStart >= rightEnd) {
            return null;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergeSort(arr, temp, leftStart, middle);
        mergeSort(arr, temp, middle + 1, rightEnd);
        mergeHalves(arr, temp, leftStart, rightEnd);

        long endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1000;
        return arr;
    }

    private static int[] mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        System.arraycopy(arr, left, temp, index, leftEnd-left + 1);
        System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);

        return arr;
    }
}
