package Array_Questions;

import java.util.HashMap;
import java.util.PriorityQueue;

public class KLargestElement {
    public static int calcKLargestElement(int []arr,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b - a);
        for(int X:arr)
            maxHeap.add(X);
        for(int i=1;i<=k-1;i++){
            maxHeap.poll();
        }
        return maxHeap.poll();
    }
    public static void main(String[] args){
        int []arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(calcKLargestElement(arr,k));

    }
}
