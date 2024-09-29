package algorithms.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array){
        // For is used to loop through the array by INDEX
        for (int i = 1; i < array.length;i++){
            // array[i] get the value of the INDEX i
            int temp = array[i];
            int j = i - 1;
            // While loop is used to loop through the array by INDEX
            // We compare the value of the INDEX i with the value of the INDEX j (Temp)
            // The condition need to write place [j > -1] on the LEFT side of the [temp < array[j]]
            while (j > -1 && temp < array[j]){
                // The INDEX "j"+1 get the value of the INDEX "j"
                // The value "go to the right" +1 index
                array[j+1] = array[j];
                // The TEMP value is got by array[i]
                // After array[j+1] get the value of array[j]
                // We move the Temp value to the left -1 index (forwards)
                array[j] = temp;
                // After swap , j is decremented to the left -1 index
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};

        insertionSort(myArray);
        System.out.println("--  Insertion Sort : ");
//        for (int j : myArray) {
//            System.out.print(j + " ");
//        }
        System.out.println(Arrays.toString(myArray));

    }
}
