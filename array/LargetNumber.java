package array;

public class LargetNumber {
    public static void main(String[] args) {
        int number[] = { 34, 67, 89, 23, 56, 23, 56 };
        int bigNo=Integer.MIN_VALUE;
        for(int x=0; x<number.length; x++){
            if(bigNo<number[x]){
                bigNo=number[x];
            }
        }

        // O(n)
        System.out.println("Big No is : "+bigNo);
    }
}
