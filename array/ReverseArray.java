package array;

public class ReverseArray {
    public static void main(String[] args) {
        int arrays[] = { 23, 454, 67, 7, 888, 56, 45, 232, 35, 56 };
        int start = 0;
        int end = arrays.length - 1;
        while (start < end) {
            int tempValue = arrays[start];
            arrays[start] = arrays[end];
            arrays[end] = tempValue;
            start++;
            end--;
        }
        // O(n)

        ArrayUtils.printArray(arrays);
    }
}
