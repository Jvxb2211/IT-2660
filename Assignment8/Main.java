public class Main {
    public static void main(String[] args) {
        int[] blopsNumbers = {3, 24, 20, 12, 19, 17, 17, 22, 19, 23, 19, 4, 0, 7, 6, 7, 19, 10, 12, 16, 17, 6, 14, 4, 3, 17, 24, 20, 13, 24, 8, 16, 17, 1, 24, 9, 21, 15, 0, 5, 15, 4, 4, 23, 6, 11, 25, 14, 4, 20, 4, 9, 14, 18, 12, 8, 7, 21, 6, 4, 21, 7, 21, 4, 2, 14, 3, 14, 7, 18, 13, 6, 22, 16, 6, 1, 21, 21, 15, 3, 5, 24, 9, 11, 2, 10, 5, 21, 4, 20, 11, 19, 12, 5, 12, 13, 12, 5, 17, 19, 3, 14, 21, 12, 15, 17, 7, 7, 2, 2, 21, 1, 10, 22, 13, 5};
        int[] baseCase = {0};
        MergeSort BlackOps = new MergeSort();
        System.out.println("We want the numbers, Mason!");
        BlackOps.sort(baseCase,0, baseCase.length - 1);
        System.out.println("The numbers Mason, put them in order!");
        BlackOps.sort(blopsNumbers, 0,blopsNumbers.length -1);
        MergeSort.printArray(blopsNumbers);
    }
}
