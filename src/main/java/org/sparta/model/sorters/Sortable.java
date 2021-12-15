package org.sparta.model.sorters;

public interface Sortable {

    String name();

    int[] sort(int[] array);

    long getTime();

}