package Array_Questions;

//public class LargestNumber {
//    public static int calcLargestNumber(int arr[]){
//        int Max = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max)
//                Max = arr[i];
//        }
//        return Max;
//    }
//    public static void main(String[] args){
//        int []arr = {10,230,30,20,1};
//        System.out.print(calcLargestNumber(arr));
//    }
//}

//public class LargestNumber {
//    public static int calcLargestNumber(int []arr){
//        int Max = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max){
//                Max=arr[i];
//            }
//        }
//        return Max;
//    }
//    public static void main(String[] args){
//        int []arr = {1,58,8,6,3,17,56};
//        System.out.println(calcLargestNumber(arr));
//    }
//}

import java.util.PriorityQueue;

public class LargestNumber {
    public static int calcLargestNumber(int []arr){
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b)->b-a);
        for(int X:arr)
            maxheap.add(X);
        return maxheap.poll();
    }
    public static void main(String[] args){
        int []arr = {4,56,68,2,3};
        System.out.println(calcLargestNumber(arr));
    }
}