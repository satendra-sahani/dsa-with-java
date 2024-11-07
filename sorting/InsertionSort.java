package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {3, 4, 1, 56, 2, 1, 5, 19};
        insertionSort(data);
        
        System.out.print("Sorted array: ");
        for (int i : data) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
