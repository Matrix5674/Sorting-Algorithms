public class OwnSort extends Sort{
    public static int[] OwnSort(int[] arr) {
        //Should be recursive algorithm (QuickSort)

        int pivot = arr[0];
        int ptr_1 = 0;
        int ptr_2 = arr.length-1;
        while(ptr_1 < ptr_2) {
            if (arr[ptr_1] >= pivot && arr[ptr_2] <= pivot)
                swap(arr, ptr_1, ptr_2);
            ptr_1++;
            ptr_2--;
        }
        return new int[1];
    }
}
