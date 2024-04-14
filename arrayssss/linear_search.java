package arrayssss;

import java.util.*;

public class linear_search {

    // creating function
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main (String args[]){
        int numbers [] = {2 , 4 , 6 , 8, 10, 12 , 14 , 16};
        int key = 16 ; // the no we need to find 

        // calling function 
        int index = linearSearch(numbers, key);
        if (index ==-1){
            System.out.println("key not found");
        } else{
            System.out.println ("the key is at index "+ index);
        }
        
}
}
