
public class BubbleSort {


    public static int[] bubbleSort(int[] t_arr) {
        int[] arr = t_arr;
        while (!isSorted(arr)){
            for (int a = 0; a < arr.length-1; a++) {
                if (arr[a] > arr[a + 1]) swap(arr, a, a + 1);
            }
        }
        return arr;
    }

    public static void swap(int[] swapArray, int indexOne, int indexTwo){
        int temp = swapArray[indexOne];
        swapArray[indexOne] = swapArray[indexTwo];
        swapArray[indexTwo] = temp;
    }

    public static boolean isSorted (int[] arr){
        for (int a = 0; a < arr.length-1; a++) if (arr[a]>arr[a+1]) return false;
        return true;
    }

}
