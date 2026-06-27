package Array_Questions;

import java.util.HashMap;
import java.util.Scanner;
//
//public class CountSubArraySum {
//    public static int calcCountSubArraySum(int []arr,int k){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(0,1);
//        int prefix = 0;
//        int count = 0;
//        for(int X: arr){
//            prefix += X;
//            if(map.containsKey(prefix-k)){
//                count += map.get(prefix-k);
//            }
//            map.put(prefix,map.getOrDefault(prefix,0)+1);
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        int []arr = {1,2,1,2,1};
//        int k = 3;
//        System.out.println(calcCountSubArraySum(arr,k));
//
//    }
//}

//public class CountSubArraySum {
//    public static int calcCountSubArraySum(int []arr,int k){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(0,1);
//        int prefix = 0;
//        int count = 0;
//        for(int X:arr){
//            prefix += X;
//            if(map.containsKey(prefix-k)){
//                count += map.get(prefix-k);
//            }
//            map.put(prefix,map.getOrDefault(prefix,0)+1);
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        int []arr = {1,2,1,2,1};
//        int k = 3;
//        System.out.println(calcCountSubArraySum(arr,k));
//    }
//}

public class CountSubArraySum {
    public static int calcCountSubArraySum(int []arr,int k){
        int prefix = 0,count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int X: arr){
            prefix += X;
            if(map.containsKey(prefix-k))
                count += map.get(prefix-k);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        int []arr = {1,2,1,2,1};
        int k = 3;
        System.out.println(calcCountSubArraySum(arr,k));
    }
}