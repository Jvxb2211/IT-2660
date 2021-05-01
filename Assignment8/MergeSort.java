public class MergeSort {
    void sort(int[] array, int lIndex, int rIndex){
        if(array.length <= 1){
            return;
        }
        if(lIndex < rIndex) {
            int mIndex = lIndex + (rIndex - lIndex) / 2;
            sort(array, lIndex, mIndex);
            sort(array, mIndex + 1, rIndex);
            merge(array, lIndex, mIndex, rIndex);
        }
    }
    void merge(int[] array, int lIndex, int mIndex, int rIndex) {
        int array1Size = mIndex - lIndex + 1;
        int array2Size = rIndex - mIndex;
        int[] tempL = new int[array1Size];
        int[] tempR = new int[array2Size];
        for (int i = 0; i < array1Size; i++) {
            tempL[i] = array[lIndex + i];
        }
        for (int i = 0; i < array2Size; i++) {
            tempR[i] = array[mIndex + 1 + i];
        }
        int i = 0, j = 0;
        int k = lIndex;
        while (i < array1Size && j < array2Size) {
            if (tempL[i] <= tempR[j]) {
                array[k] = tempL[i];
                i++;
            } else {
                array[k] = tempR[j];
                j++;
            }
            k++;
        }
        while (i < array1Size) {
            array[k] = tempL[i];
            i++;
            k++;
        }
        while (j < array2Size) {
            array[k] = tempR[j];
            j++;
            k++;
        }
    }
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " | ");
    }
}
