package com.example.pattern_adapter.example_1;

/**
 * 二分查找
 */
public class BinarySearchClass {

    public int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return 1;   //找到元素返回1
        }
        return -1;  //未找到元素返回-1
    }
}
