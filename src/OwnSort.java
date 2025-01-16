import java.util.Arrays;

public class OwnSort extends Sort{
    public static int[] OwnSort(int[] t_arr) {

        int[] arr = t_arr;

        //base case
        if (isSorted(arr)) return arr;

        int pivot_Index = 0;
        int ptr_1 = 0;
        int ptr_2 = arr.length-1;
        while(ptr_1 < ptr_2) {
            if (arr[ptr_1] >= arr[pivot_Index] && arr[ptr_2] <= arr[pivot_Index]) {
                if (ptr_1 == pivot_Index) pivot_Index = ptr_2;
                if (ptr_2 == pivot_Index) pivot_Index = ptr_1;
                swap(arr, ptr_1, ptr_2);
            }
            ptr_1++;
            ptr_2--;
        }

        int[] subArrayLeft = OwnSort(Arrays.copyOfRange(arr, 0, pivot_Index));
        int[] subArrayRight = OwnSort(Arrays.copyOfRange(arr, pivot_Index+1, arr.length));

        int[] sortedArray = new int[subArrayLeft.length + subArrayRight.length];
        System.arraycopy(subArrayLeft, 0, sortedArray, 0, subArrayLeft.length);
        System.arraycopy(subArrayRight, 0, sortedArray, subArrayLeft.length, subArrayRight.length);

        return sortedArray;
    }
}
