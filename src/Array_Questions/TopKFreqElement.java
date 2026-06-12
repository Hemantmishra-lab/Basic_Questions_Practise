package Array_Questions;

import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

//public class TopKFreqElement {
//    public static int[] calcTopKFreqElement(int []arr,int k){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X : arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->{
//            return map.get(b) - map.get(a);
//        });
//        System.out.println(map);
//        maxHeap.addAll(map.keySet());
//        int []arrr = new int[k];
//        for(int i = 0 ; i<k;i++){
//            arrr[i] = maxHeap.poll();
//        }
//        return arrr;
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7,};
//        int k = 2;
//        int []arrr = calcTopKFreqElement(arr,k);
//        for(int X : arrr)
//            System.out.print(X +" ");
//    }
//}

//public class TopKFreqElement{
//    public static int calcTopKFreqElement(int[]arr,int k){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X:arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->{
//            return map.get(b) - map.get(a);
//        });
//        maxHeap.addAll(map.keySet());
//        for(int i=1;i<k;i++){
//            maxHeap.poll();
//        }
//        System.out.println(map);
//        return maxHeap.poll();
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7,};
//        int k = 2;
//        System.out.println(calcTopKFreqElement(arr,k));
//    }
//}

//public class TopKFreqElement {
//    public static int calcTopKFreqElement(int []arr,int k){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X : arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
//        maxHeap.addAll(map.keySet());
//        for(int i = 1;i<=k-1;i++){
//            maxHeap.poll();
//        }
//        return maxHeap.poll();
//    }
//    public static void main(String[]args){
//        int []arr = {1,1,1,1,1,1,1,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7,};
//        int k =2;
//        System.out.println(calcTopKFreqElement(arr,k));
//    }
//}

//public class TopKFreqElement {
//    public static int calcTopKFreqElement(int []arr,int k){
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b,a));
//        for(int X:arr)
//            maxHeap.add(X);
//        maxHeap.poll();
//        return maxHeap.poll();
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7};
//        int k = 2;
//        System.out.println(calcTopKFreqElement(arr,k));
//    }
//}


public class TopKFreqElement {
    public static int calcTopKFreqElement(int []arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int X:arr)
            map.put(X,map.getOrDefault(X,0)+1);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int X:arr)
            maxHeap.add(X);
        for(int i=1;i<k;i++){
            maxHeap.poll();
        }
        System.out.println(map);
        return maxHeap.poll();
    }
    public static void main(String[] args){
        int []arr = {1,1,1,1,1,1,1,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7};
        int k = 2;
        System.out.println(calcTopKFreqElement(arr,k));
    }
}