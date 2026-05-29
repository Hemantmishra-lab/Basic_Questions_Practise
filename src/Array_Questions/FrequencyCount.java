package Array_Questions;

import java.util.HashMap;
//
//public class FrequencyCount {
//    public static HashMap<Integer,Integer> calcFrequencyCount(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X : arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        return map;
//    }
//    public static void main(String[] args){
//        int []arr = {100,100,99,90,99,8,8,8};
//        System.out.print(calcFrequencyCount(arr));
//    }
//}

//public class FrequencyCount {
//    public static HashMap<Integer,Integer> calcFrequencyCount(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X :arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        return map;
//    }
//    public static void main(String[] args){
//        int []arr = {100,100,99,90,99,8,8,8};
//        System.out.println(calcFrequencyCount(arr));
//    }
//}

//public class FrequencyCount {
//    public static HashMap<Integer,Integer> calcFrequencyCount(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X: arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        return map;
//    }
//    public static void main(String[] args){
//        int []arr = {100,100,99,90,99,8,8,8};
//        System.out.println(calcFrequencyCount(arr));
//    }
//}

public class FrequencyCount {
    public static HashMap<Integer,Integer> calcFrequencyCount(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int X : arr) {
            map.put(X,map.getOrDefault(X,0)+1);
        }
        return map;
    }
    public static void main(String[] args){
        int []arr = {100,100,99,90,99,8,8,8};
        System.out.println(calcFrequencyCount(arr));
    }
}