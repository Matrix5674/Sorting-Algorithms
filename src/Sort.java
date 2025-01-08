public class Sort {
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
