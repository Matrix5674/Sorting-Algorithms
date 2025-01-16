import java.util.Arrays;

public class Benchmark_Tester {

    private static final int NUM_ITERATIONS = 50;
    private static final int[] SIZES_TO_TEST = {10, 100, 500, 1000, 2000, 4000, 6000, 8000, 10000};

    public static void main(String[] args) {
        long insertionTotalTime;
        long minSelectionTotalTime;
        long maxSelectionTotalTime;
        long doubleSelectionTotalTime;
        long ownTotalTime;

        System.out.println("Array size, insertion sort (ms), min selection sort (ms), max selection sort (ms), double selection sort (ms), own sort (ms)");

        for (int arrSize : SIZES_TO_TEST) {
            insertionTotalTime = 0;
            minSelectionTotalTime = 0;
            maxSelectionTotalTime = 0;
            doubleSelectionTotalTime = 0;
            ownTotalTime = 0;

            for (int i = 0; i < NUM_ITERATIONS; i++) {
                long startTime = 0, endTime = 0;

                int[] baseArr = createRandomArray(arrSize);

                // --------- insertion sort ---------
                int[] arrCopy = Arrays.copyOf(baseArr, baseArr.length);
                startTime = System.currentTimeMillis();
                InsertionSort.InsertionSort(arrCopy);
                endTime = System.currentTimeMillis();
                insertionTotalTime += (endTime - startTime);
                // ----------------------------------

                // --------- minValue selection sort ---------
                arrCopy = Arrays.copyOf(baseArr, baseArr.length);
                startTime = System.currentTimeMillis();
                SelectionSort_MinValue.SelectionSort(arrCopy);
                endTime = System.currentTimeMillis();
                minSelectionTotalTime += (endTime - startTime);
                // ----------------------------------

                // --------- maxValue selection sort ---------
                arrCopy = Arrays.copyOf(baseArr, baseArr.length);
                startTime = System.currentTimeMillis();
                SelectionSort_MaxValue.SelectionSort(arrCopy);
                endTime = System.currentTimeMillis();
                maxSelectionTotalTime += (endTime - startTime);
                // ----------------------------------


                // --------- doubleValue selection sort ---------
                arrCopy = Arrays.copyOf(baseArr, baseArr.length);
                startTime = System.currentTimeMillis();
                SelectionSort_DoubleValue.SelectionSort(arrCopy);
                endTime = System.currentTimeMillis();
                doubleSelectionTotalTime += (endTime - startTime);
                // ----------------------------------

                // --------- own sort ---------
                arrCopy = Arrays.copyOf(baseArr, baseArr.length);
                startTime = System.currentTimeMillis();
                OwnSort.OwnSort(arrCopy);
                endTime = System.currentTimeMillis();
                ownTotalTime += (endTime - startTime);
                // ----------------------------------
            }

            System.out.println(arrSize + ", " + (double)insertionTotalTime/NUM_ITERATIONS + ", " + (double)minSelectionTotalTime/NUM_ITERATIONS + ", " + (double)maxSelectionTotalTime/NUM_ITERATIONS + ", " + (double)doubleSelectionTotalTime/NUM_ITERATIONS + ", " + (double)ownTotalTime/NUM_ITERATIONS);
        }

    }
    public static int[] createRandomArray(int arrSize){
        int[] arr = new int[arrSize];
        for (int index = 0; index < arrSize; index++) {
            arr[index] = (int)(Math.random()*Integer.MAX_VALUE);
        }
        return arr;
    }
}
