package HashTables;

import java.util.HashMap;

public class Main {

    public static boolean  itemInCommon(int[] array1, int[] array2) {
        for (int i : array1){
            for ( int j : array2) {
                if (i == j) return true;
            }
        }
        return false;
    }

    public static boolean itemInCommon2(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i : array1){
            myHashMap.put(i, true);
        }

        for (int j : array2){
            if (myHashMap.get(j) != null) return true;
        }

        return false;
    }




    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 8};
        // int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        System.out.println(itemInCommon2(array1, array2));
    }
}
