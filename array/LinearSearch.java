package array;
public class LinearSearch {
public static void main(String[] args) {
    int number[] = { 34, 67, 89, 23, 56, 23, 56 };

    int target = 56;
    int targetIndex = -1;
    for (int x = 0; x < number.length; x++) {
        if (number[x] == target) {
            targetIndex = x;
            break;
        }
    }
    // t = O(n)  
    System.out.println("Target index is : "+targetIndex);
}
}