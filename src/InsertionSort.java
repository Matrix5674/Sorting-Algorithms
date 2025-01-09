public class InsertionSort extends Sort{

    public static int[] InsertionSort(int[] t_arr){
        int[] arr = t_arr;

        for (int a = 1; a < arr.length; a++) {
            int valToInsert = arr[a];
            int whereToInsert = a-1;

            while(whereToInsert >= 0 && valToInsert < arr[whereToInsert]){
                arr[whereToInsert + 1] = arr[whereToInsert];
                whereToInsert -= 1;
            }

            arr[whereToInsert + 1] = valToInsert;
        }
        return arr;
    }

}
