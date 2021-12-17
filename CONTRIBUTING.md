# Adding more sort algorithms
To add more sort algorithms to this program, create a class in main/org/sparta/model/sorters that implements the Sortable interface.

The SortFactory class in the same package will have to be updated to include the choice of the new algorithm. As will the user prompt in the Start class located in org/sparta/Start.java

### Sortable Interface

The sort() method within the class will have to be written to accept and return a primitive int array.



```
public interface Sortable {

    String getName();

    int[] sort(int[] array);

    long getTime();

}
```
### Sortfactory Class

A new case which returns the new sorting algorithm should be added to this switch statement.
```
public class SortFactory {

    public static Sortable getSorter(int selection){
        switch (selection) {
            case 1 -> {
                myLogger.log(Level.INFO, "Bubble sort selected");
                return new BubbleSort();
            }
            case 2 -> {
                myLogger.log(Level.INFO, "Merge sort selected");
                return new MergeSort();
            }
            case 3 -> {
                myLogger.log(Level.INFO, "Binary tree sort selected");
                return new BinaryTree();
            }
        }
        return null;
    }
}
```

### Start class
This prompt on line 21 will also need to be updated to accurately reflect the newly added choice. 
```
Printer.printMessage("Please select a sorting algorithm: \n 1. Bubble sort \n 2. Merge sort \n 3. Binary tree sort\n");
```
