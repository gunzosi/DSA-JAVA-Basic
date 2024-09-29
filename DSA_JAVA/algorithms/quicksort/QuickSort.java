package algorithms.quicksort;

import java.util.Arrays;

public class QuickSort {
    private static void swap(int[] array, int firstIndex, int secondIndex){
        // Ex: Array = [1, 2, 3, 4, 5]
        // swap(array, 0, 4) => Array = [5, 2, 3, 4, 1]
        // temp = 1 = array[0] == array[firstIndex]
        int temp = array[firstIndex];
        // array[0] (array[firstIndex]) = 5 == array[secondIndex] = array[4]
        array[firstIndex] = array[secondIndex];
        // array[4] (array[secondIndex]) = 1 == temp = 1
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        // Ex: Array = [4,6,1,7,3,2,5]
        // pivotIndex = 0, endIndex = 6
        // pivot = 4
        // swapIndex = 0
        for(int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                // i = 1
                // array[1] = 6 > array[0] = 4 => No swap
                // i = 2
                // array[2] = 1 < array[0] = 4 => swapIndex = 1, swap(array, 1, 2) => Array = [4,1,6,7,3,2,5]
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    private static void quickSortHelper(int[] array, int left, int right){
        if (left < right){
            int pivotIndex = pivot(array,left,right);
            quickSortHelper(array,left,pivotIndex-1);
            quickSortHelper(array,pivotIndex+1,right);
        }
    }
    public static void quickSort(int[] array){
        quickSortHelper(array,0,array.length-1);
    }

    public static void main(String[] args) {
        int[] array = {4,6,1,7,3,2,5};

        int returnedIndex = pivot(array, 0, array.length - 1);
        System.out.println("-- Return Index: " + returnedIndex);
        System.out.println("-- Array before Sort: ");
        System.out.println(Arrays.toString(array));
        System.out.println("-- Quick Sort: ");
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
