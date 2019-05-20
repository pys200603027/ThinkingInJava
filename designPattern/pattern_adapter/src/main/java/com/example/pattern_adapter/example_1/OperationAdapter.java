package com.example.pattern_adapter.example_1;

/**
 * Adapter
 */
public class OperationAdapter implements ScoreOperation {

    BinarySearchClass binarySearchClass;
    QuickSortClass quickSortClass;

    public OperationAdapter() {
        binarySearchClass = new BinarySearchClass();
        quickSortClass = new QuickSortClass();
    }

    @Override
    public int[] sort(int[] arrays) {
        return quickSortClass.quickSort(arrays);
    }

    @Override
    public int search(int[] arrays, int key) {
        return binarySearchClass.binarySearch(arrays, key);
    }
}
