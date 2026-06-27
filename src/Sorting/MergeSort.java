package Sorting;

public class MergeSort {
    public static void MaxMin(int []arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max +" "+min);
    }
    public static void main(String[] args){
        int []arr = {1,8,4,0,99};
        MaxMin(arr);
    }
}
