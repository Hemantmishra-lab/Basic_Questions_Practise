package Array_Questions;

import java.util.*;
import java.util.zip.CheckedOutputStream;

//public class SecondMaxFreqElement {
//    public static int calcSecondMaxFrequencyElement(int[]arr){
//        if(arr.length<2) return -1;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X : arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//
//        System.out.println(map);
//        List<Integer> list = new ArrayList<>(map.keySet());
//        Collections.sort(list,(a,b)->{
//           return map.get(b) - map.get(a);
//        });
//
//        System.out.println("List : "+list);
//
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
//        maxHeap.addAll(map.keySet());
//        System.out.println("MaxHeap : "+maxHeap);
//        maxHeap.poll();
//        return maxHeap.poll();
//    }
//    public static void main(String[] args){
//        int []arr ={1,1,1,1,1,1,1,6,6,6,6,6,6,9,9,9,9,9,0,0,0,3333,333,333};
//        System.out.println(calcSecondMaxFrequencyElement(arr));
//    }
//}


//public class SecondMaxFreqElement{
//    public static int calcSecondMaxFreqElement(int[]arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X : arr){
//            map.put(X,map.getOrDefault(X,0)+1);
//        }
//
//        List<Integer> l1 = new ArrayList<>();
//        for(int X : arr)
//            l1.add(X);
//        System.out.println("L1 : "+l1);
//
//        List<Integer> list = new ArrayList<>(map.keySet());
//        Collections.sort(list,(a,b)->{
//            return map.get(b) - map.get(a);
//        });
//        System.out.println(list);
//
//        PriorityQueue<Integer> maxHeap = new PriorityQueue((a,b)->{
//                return map.get(b) - map.get(a);
//        });
//        maxHeap.addAll(map.keySet());
//        maxHeap.poll();
//        return maxHeap.poll();
//    }
//    public static void main (String[] args){
//        int []arr = {1,1,1,1,1,1,1,6,6,6,6,6,6,9,9,9,9,9,0,0,0,3333,333,333};
//        System.out.println(calcSecondMaxFreqElement(arr));
//    }
//}

//public class SecondMaxFreqElement{
//    public static int calcSecondMaxFreqElement(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X: arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->{ // Dont COnfuse remember only 2 thing 1. almost cbt 2. parent>child
//            return map.get(b) - map.get(a);
//        });
//        maxHeap.addAll(map.keySet());
//        maxHeap.poll();
//        return maxHeap.poll();
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,6,6,6,6,6,6,9,9,9,9,9,0,0,0,3333,333,333};
//        System.out.println(calcSecondMaxFreqElement(arr));
//    }
//}

//public class SecondMaxFreqElement{
//    public static int calcSecondMaxFreqElement(int[]arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X : arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->{
//            return map.get(b) - map.get(a);
//        });
//        maxHeap.addAll(map.keySet());
//        maxHeap.poll();
//        System.out.println(map);
//        return maxHeap.poll();
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,6,6,6,6,6,6,9,9,9,9,9,0,0,0,3333,333,333};
//        System.out.println(calcSecondMaxFreqElement(arr));
//    }
//}
//
//public class SecondMaxFreqElement {
//    public static int calcSecondMaxFreqElement(int []arr){
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b,a));
//        for(int X : arr){
//            maxHeap.add(X);
//        }
//        return maxHeap.poll();
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,6,6,6,6,6,6,9,9,9,9,9,0,0,0,3333,333,333};
//        System.out.println(calcSecondMaxFreqElement(arr));
//    }
//}

//public class SecondMaxFreqElement {
//    public static int calcSecondMaxFreqElement(int []arr){
//        HashMap<Integer,Integer> map= new HashMap<>();
//        for(int X:arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(map.get(b),map.get(a)));
//        maxHeap.addAll(map.keySet());
//        maxHeap.poll();
//        System.out.println(map);
//        return maxHeap.poll();
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,1,1,6,6,6,9,9,9,9,9,0,0,0,3333,333,333};
//        System.out.println(calcSecondMaxFreqElement(arr));
//    }
//}

//public class SecondMaxFreqElement {
//    public static int calcSecondMaxFreqElement(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X:arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(map.get(b),map.get(a)));
////        maxHeap.addAll(map.keySet());
//        for(int X:map.keySet()){
//            maxHeap.add(X);
//        }
//        maxHeap.poll();
//        System.out.println(map);
//        return maxHeap.poll();
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,1,1,6,6,6,9,9,9,9,9,0,0,0,3333,333,333};
//        System.out.println(calcSecondMaxFreqElement(arr));
//    }
//}


public class SecondMaxFreqElement {
    public static int calcSecondMaxFreqElement(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int X:arr)
            map.put(X,map.getOrDefault(X,0)+1);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(map.get(b),map.get(a)));
        for(int X:map.keySet())
            maxHeap.add(X);
        maxHeap.poll();
        return maxHeap.poll();
    }
    public static void main(String[] args){
        int []arr = {1,1,1,1,1,1,1,1,1,6,6,6,9,9,9,9,9,0,0,0,3333,333,333};
        System.out.println(calcSecondMaxFreqElement(arr));
    }
}