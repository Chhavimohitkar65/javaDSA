package arrayssss;

import java.util.*;

public class binary_search {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            
            int mid = (start + end) / 2; 
            // comparisons


            if (numbers[mid] == key) { // found
                return mid;
            }
            if (numbers[mid] < key) { // num of mid is less than key value then right condition
                start = mid + 1;
            } else {
                end = mid - 1; // left case
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        System.out.println("index of the key is  "+ binarySearch(numbers, key) );

    }

}
