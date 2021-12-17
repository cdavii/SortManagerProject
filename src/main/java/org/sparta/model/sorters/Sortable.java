package org.sparta.model.sorters;

public interface Sortable {

    String getName();

    int[] sort(int[] array);

    long getTime();

}