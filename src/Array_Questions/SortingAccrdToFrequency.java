package Array_Questions;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//public class SortingAccrdToFrequency {
//    public static int[] calcSortingAccrdToFrequency(int arr[]){
//        HashMap<Integer,Integer> map  = new HashMap<>();
//        for(int X: arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        List<Integer> list = new ArrayList<>();
//        for(int X : arr){
//            list.add(X);
//        }
//        Collections.sort(list,(a,b)->{
//            int freqA = map.get(a);
//            int freqB = map.get(b);
//            if(freqA != freqB){
//                return freqB-freqA;
//            }
//            else {
//                return a-b;
//            }
//        });
//        int []temp = new int[arr.length];
//        for(int i=0;i<list.size();i++){
//            temp[i] = list.get(i);
//        }
//        return temp;
//    }
//    static void main() {
//        int []arr = {1,1,1,2,2,2,2,3,3,3,3,3,9,10,10};
//        int []temp = calcSortingAccrdToFrequency(arr);
//        for(int X : temp)
//        System.out.print(X + " ");
//
//    }
//}

//public class SortingAccrdToFrequency{
//    public static int[] calcSortingAccrdToFrequency(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X : arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        List<Integer> list = new ArrayList<>();
//        for(int X : arr){
//            list.add(X);
//        }
//        Collections.sort(list,(a,b)->{
//            int freqA = map.get(a);
//            int freqB = map.get(b);
//            if(freqA!=freqB){
//               return freqA-freqB;
//            } else {
//                return a-b;
//            }
//        });
//        int []temp = new int[arr.length];
//        for(int i=0;i<list.size();i++){
//            temp[i] = list.get(i);
//        }
//        System.out.println(map);
//        return temp;
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,9,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7,};
//        int []tep = calcSortingAccrdToFrequency(arr);
//        for(int X : tep)
//            System.out.print(X +" ");
//    }
//}

//
//public class SortingAccrdToFrequency {
//    public static List<Integer> calcSortingAccrdToFrequency(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X : arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        List<Integer> list = new ArrayList<>();
//        for(int X : arr)
//            list.add(X);
//        Collections.sort(list,(a,b)->{
//            int freqA = map.get(a);
//            int freqB = map.get(b);
//            if(freqA != freqB)
//                return freqB - freqA;
//            return b-a;
//        });
//        System.out.println(map);
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,9,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7,};
//        System.out.println(calcSortingAccrdToFrequency(arr));
//    }
//}

//public class SortingAccrdToFrequency {
//    public static List<Integer> calcSortingAccrdToFrequency(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X :arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        List<Integer> list = new ArrayList<>();
//        for(int X: arr)
//            list.add(X);
//        Collections.sort(list,(a,b)->{
//            int freqA = map.get(a);
//            int freqB = map.get(b);
//            if(freqA!=freqB)
//                return freqB - freqA;
//            else{
//                return b-a;
//            }
//        });
//        System.out.println(map);
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,9,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7,};
//       System.out.println(calcSortingAccrdToFrequency(arr));
//    }
//}

//public class SortingAccrdToFrequency {
//    public static List<Integer> calcSortingAccrdToFrequency(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X:arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        System.out.println(map);
//        List<Integer> list = new ArrayList<>();
//
//
//        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
//
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,9,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7,};
//        System.out.println(calcSortingAccrdToFrequency(arr));
//    }
//}

//public class SortingAccrdToFrequency {
//    public static List<Integer> calcSortingAccrdToFrequency(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X : arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        System.out.println(map);
//        List<Integer> list = new ArrayList<>(); //If you want like this [1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 4, 4, 4, 4, 4, 6, 6, 6, 6, 7, 7, 77]
////        list.addAll(map.keySet()); -> If You want only Unique Element means no repeation
//        for(int X : arr)
//            list.add(X);
//        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,1,1,1,1,9,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7,};
//        System.out.println(calcSortingAccrdToFrequency(arr));
//    }
//}

public class SortingAccrdToFrequency {
    public static List<Integer> calcSortingAccrdToFrequency(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int X:arr)
            map.put(X,map.getOrDefault(X,0)+1);
        List<Integer> list = new ArrayList<>();
//        for(int X : arr)
//            list.add(X);
        list.addAll(map.keySet());
        Collections.sort(list,(a,b)->{
            return map.get(b) - map.get(a);
        });
        return list;

    }
    public static void main(String[] args){
        int []arr = {1,1,1,1,1,1,1,9,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7,};
        System.out.println(calcSortingAccrdToFrequency(arr));
    }
}