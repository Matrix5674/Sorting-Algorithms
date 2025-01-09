public class Tester {
    public static void main(String[] args) {
        int[] testArray = {2, 3,2, 3, 4, 5,4,3};
        int[] sorted_bubble = BubbleSort.BubbleSort(testArray);
        int[] sorted_selection_min = SelectionSort_MinValue.SelectionSort(testArray);
        int[] sorted_selection_max = SelectionSort_MaxValue.SelectionSort(testArray);
        int[] sorted_selection_double = SelectionSort_DoubleValue.SelectionSort(testArray);
        int[] sorted_insertion = InsertionSort.InsertionSort(testArray);
        printResults(sorted_bubble, sorted_selection_min, sorted_selection_max, sorted_selection_double, sorted_insertion);

    }

    public static void printResults(int[] sorted_bubble, int[] sorted_selection_min,int[] sorted_selection_max, int[] sorted_selection_double, int[] sorted_insertion){
        System.out.println("Bubble Sort");
        for(int s : sorted_bubble) System.out.print(s + ", ");
        System.out.println();
        System.out.println("Selection Sort: Min Value");
        for(int s : sorted_selection_min) System.out.print(s + ", ");
        System.out.println();
        System.out.println("Selection Sort: Max Value");
        for(int s : sorted_selection_max) System.out.print(s + ", ");
        System.out.println();
        System.out.println("Selection Sort: Double Value");
        for(int s : sorted_selection_double) System.out.print(s + ", ");
        System.out.println();
        System.out.println("Insertion Sort");
        for(int s : sorted_insertion) System.out.print(s + ", ");
        System.out.println();
    }
}
