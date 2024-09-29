package algorithms.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array){
        // Loop through the array
        for(int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++){
                // If 1st element is bigger than the 2nd element, we swap them
                // EX: [4,2,6,5,1,3]
                // -- 4 (minIndex = i = 0)  is bigger than 2, so we swap them
                // -- i = 0, minIndex = 0, array[i] = 4
                // -- j = 1 (i + 1), array[j] = 2
                // -- minIndex = 1, array[minIndex] = 2
                // -- array[j] = 2, array[minIndex] = 4
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                    // Assign the index of the smallest element (j) to minIndex
                    // (minIndex is the INDEX of the smallest element)
                }
            }
            if (i != minIndex) {
                // temp = index 0, array[i] = 4
                // array[i] = array[minIndex] (array[minIndex] = 2)
                // array[minIndex] = temp (temp = 4)
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};

        selectionSort(myArray);
        System.out.println("--  Selection Sort : ");
        System.out.println(Arrays.toString(myArray));
    }

}
