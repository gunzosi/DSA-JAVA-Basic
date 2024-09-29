package algorithms.mergesort;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0; // Index of the combined array
        int i = 0; // Index of array1
        int j = 0; // Index of array2

        while (i < array1.length && j < array2.length) {
            // Compare the elements of the two arrays
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                // array2[j] <= array1[i]
                // In case of equality, array1[i] is placed first
                // This is a STABLE sort
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
        // In case array1 has elements left
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }
        // In case array2 has elements left
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int midIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0 , midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};
        int[] combined = merge(array1, array2);

        System.out.println("Test Merge Helper Func: ");
        System.out.println(Arrays.toString(combined) + "\n");
//        System.out.println(Arrays.toString(merge(array1, array2)));

        System.out.println("Test Merge Sort Func: ");
        int[] originalArray = {3, 1, 4, 2};

        int[] sortedArray = mergeSort(originalArray);

        System.out.println("1 -- Original Array: " + Arrays.toString(originalArray));
        System.out.println("2 -- Sorted Array: " + "\t " + Arrays.toString(sortedArray));
    }
}
