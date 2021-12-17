# Sort Manager
This is my first Java project in the Sparta Global academy. This project generates an array of a size specified by the user populated with randomly generated integers, sorts it, and returns the sorted array as well as the time taken to the console.
The algorithm used to sort the array can also be chosen by the user.

This project has allowed me to put the concepts learned so far into practice, with a focus on following OOP and SOLID principles.


## How to use

To use this sort manager, please clone this repository and enter run() command in a main method in the IDE of your choice.

You will be prompted to select a sorting algorithm, and the size of the array you would like to generate.

Upon entering your selection, the program will run and return:
1. The name of the sort method selected
2. A preview of the array before sorting
3. The resulting array after the method was applied
4. The time taken for the algorithm to run (in milliseconds)

## Sorting Algorithms
#### Bubble Sort 
Repeatedly steps through the array, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. 
#### Merge Sort
Divides the unsorted array into many subarrays containing only one element then repeatedly merges these arrays to produce new sorted arrays until only one remains, this will be the sorted array. 
#### Binary Tree Sort
Builds a binary search tree from the elements to be sorted, and then traverses the tree (in-order) so that the elements come out in sorted order.

