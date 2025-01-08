public class SelectionSort_MaxValue extends Sort{
    public static int[] SelectionSort(int[] t_arr) {
        int[] arr = t_arr;
        for (int b = 0; b < arr.length; b++) {
            int largestIndex = findLargestIndex(arr, b, arr.length);
            swap(arr, largestIndex, b);
        }

        return arr;
    }


    public static int findLargestIndex(int[] arr, int range_start_value, int range_end_value){
        int largestValue = Integer.MIN_VALUE;
        int largestIndex = 0;

        for (int a = range_start_value; a < range_end_value; a++) {

            if (arr[a] > largestValue) {
                largestValue = arr[a];
                largestIndex = a;
            }
        }
        return largestIndex;
    }

}
