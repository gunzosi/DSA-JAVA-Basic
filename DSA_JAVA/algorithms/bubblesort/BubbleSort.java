package algorithms.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array){
        // Give Array {4,2,6,5,1,3}
        for (int i = array.length - 1; i > 0 ; i--){
            // This mean we have 6 elements in the array, and we need to sort them,
            // each time we sort we will have the biggest element at the end of the array
            // We decrement the i to make sure we don't compare the last element with the last element
            for (int j = 0; j < i ; j ++){
                // We compare the first element with the second element, if the first element is bigger than the second element
                // we swap them
                if (array[i] > array[j+1]){
                    // Example 1st iteration: 4 and 2, 4 is bigger than 2, so we swap them
                    int temp = array[j];
                    // temp = null and array[j] = 4 so temp = 4 (array[j] is the first element)
                    array[j] = array[j+1];
                    // array[j+1] = 2, and we set array[j] from 4 to 2
                    array[j+1] = temp;
                    // This line is to show the array after each swap
                    // array[j] = 2, and term is never change the location (1st) so we have 2,4,6,5,1,3
                    // 2 is less than 4, so we don't swap them , we move to the next element
                    // 4 is less than 6, so we don't swap them , we move to the next element
                    // 6 is bigger than 5, so we swap them, 2,4,5,6,1,3
                    // 6 is bigger than 1, so we swap them, 2,4,5,1,6,3
                    // 6 is bigger than 3, so we swap them, 2,4,5,1,3,6
                    // this i-- will make sure we don't compare the last element with the last element
                    // Example 2nd iteration: 2,4,5,1,3,6 we have 5 elements, so we decrement i to 4
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};
        System.out.println("--  Before Bubble Sort : ");
        System.out.println(Arrays.toString(myArray));

        bubbleSort(myArray);
        System.out.println("--  Bubble Sort : ");
        System.out.println(Arrays.toString(myArray));
    }
}
