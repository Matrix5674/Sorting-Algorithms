
public class BubbleSort extends Sort {


    public static int[] BubbleSort(int[] t_arr) {
        int[] arr = t_arr;
        while (!isSorted(arr)){
            for (int a = 0; a < arr.length-1; a++) {
                if (arr[a] > arr[a + 1]) swap(arr, a, a + 1);
            }
        }
        return arr;
    }



}
