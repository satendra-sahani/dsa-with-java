package array;

public class BinarySearch {
    public static void main(String[] args) {
        int number[] = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target=15;
        int start=0;
        int end=number.length-1;
        int targetIndex=-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(number[mid]==target){
                targetIndex=mid;
                break;
            }
            if(number[mid] < target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        // O(logn)
        System.out.println("Index no is : "+targetIndex);

    }
}
