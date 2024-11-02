package sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] data= {3,4,1,56,2,1,5,19};
        for(int a=0; a<data.length-1; a++){
            int minIndex=a;

            for(int b=a+1; b<data.length-1; b++){
                if(data[b]< data[minIndex]){
                    minIndex=b;
                }
            }

            if(minIndex!=a){
                int tempValue=data[a];
                data[a]=data[minIndex];
                data[minIndex]=tempValue;
            }
        }

        for(int a=0; a<data.length-1; a++){
            System.out.print(data[a]+",");
        }
    }
}
