public class Tester {
    public static void main(String[] args) {
        int[] testArray = {2, 3,2, 3, 4, 5,4,3};
        int[] sorted = BubbleSort.bubbleSort(testArray);
        for(int s : sorted) System.out.print(s + ", ");
    }
}
