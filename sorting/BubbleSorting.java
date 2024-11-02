package sorting;

public class BubbleSorting {
    public static void main(String[] args){
        int[] data= {3,4,1,56,2,1,5,19};
        for(int a=0; a<data.length-1; a++){
            for(int b=0; b<data.length-1-a; b++){
                if(data[b]>data[b+1]){
                    int tempData=data[b+1];
                    data[b+1]=data[b];
                    data[b]=tempData;
                }
            }
        }

        for(int a=0; a<data.length-1; a++){
            System.out.print(data[a]+",");
        }
    }
}
