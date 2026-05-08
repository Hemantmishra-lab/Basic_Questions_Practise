package CollectionFramework;

//public class ForEach {
//    public static void forEach(String []str){
//        for(String i : str){
//            System.out.println(i);
//        }
//    }
//    public static void main(String[] args){
//        String str[] = {"Apple","Banana","Apple"};
//        forEach(str);
//    }
//}

//public class ForEach{
//    public static void forEach(String []str){
//        for(String fruits : str){
//            System.out.println(fruits);
//        }
//    }
//    public static void main(String[] args){
//        String str[] = {"Apple","Banana","Mango"};
//        forEach(str);
//    }
//}

//Example (2D Array): Use nested for-each loops to traverse rows then columns.

//public class ForEach{
//    public static void forEach(int [][]matrix){
//        for(int []row:matrix){
//            for(int col : row){
//                System.out.println(col);
//            }
//        }
//    }
//    public static void main(String[] args){
//        int [][] matrix = {{1,2},{3,4}};
//        forEach(matrix);
//    }
//}

//public class ForEach{
//    public static void forEach(int [][]matrx){
//        for(int []row:matrx){
//            for(int col : row)
//                System.out.println(col);
//        }
//    }
//    public static void main(String[] args){
//        int [][]matrix = {{1,2,3},{5,6}};
//        forEach(matrix);
//    }
//}

//public class ForEach{
//    public static void forEach(String[][]str){
//        for(String[] row:str){
//            for(String col:row)
//                System.out.println(col);
//        }
//    }
//    public static void main(String[] args){
//        String [][]str = {{"Ram","Shyam"},{"Sita","Radha"}};
//        forEach(str);
//    }
//}
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class ForEach{
//    public static void duplicate(String[] arr){
//        HashMap<String,Integer> hashMap = new HashMap<>();
//        for(String str : arr){
//            hashMap.put(str,hashMap.getOrDefault(str,0)+1);
//        }
//        System.out.println(hashMap);
//        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.print(entry.getKey() + " ");
//            }
//        }
//
//    }
//    public static void main(String[] args){
//        String []arr = {"Ram","Shyam","Ram","Rohan"};
//        duplicate(arr);
//    }
//}

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//
//public class ForEach{
//    public static void duplicate(String[] arr){
//        HashMap<String,Integer> map = new HashMap<>();
//        for(String str : arr){
//            map.put(str,map.getOrDefault(str,0)+1);
//        }
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue()>1){
//                System.out.println(entry.getKey()+" ");
//            }
//        }
//
//    }
//    public static void main(String[] args){
//        String []arr ={"Rahul","Prince","Ranjan","Ranjan"};
//        duplicate(arr);
//    }
//}

//public class ForEach{
//    public static void duplicate(String[] arr){
//        HashMap<String,Integer> map = new HashMap<>();
//        for(String str : arr){
//            map.put(str,map.getOrDefault(str,0)+1);
//        }
//        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
//            if(stringIntegerEntry.getValue()>1){
//                System.out.println(stringIntegerEntry.getKey());
//            }
//        }
//
//    }
//    public static void main(String[] args){
//        String [] arr = {"New Delhi","Agra","Agra","Bihar"};
//        duplicate(arr);
//    }
//}

//    public class ForEach{
//        public static boolean TwoSum(int []arr,int N){
//            HashMap<Integer,Integer> map = new HashMap<>();
//
//            for(int i=0;i<arr.length;i++){
//                map.put(N-arr[i],map.getOrDefault(N-arr[i],0)+1);
//            }
//            for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
//                if(integerIntegerEntry.getValue()>1){
//                    return true;
//                }
//            }
//            return false;
//        }
//        public static void main(String[] args){
//            int [] arr = {2,7,11,8};
//            int N= 10;
//            System.out.println(TwoSum(arr,N));
//        }
//    }

import java.util.HashMap;

//public class ForEach {
//    public static boolean TwoSum(int[] arr, int N) {
//        // Standard approach: Store the numbers we have seen so far
//        HashMap<Integer, Integer> seen = new HashMap<>();
//
//        for (int num : arr) {
//            int complement = N - num;
//
//            // If the complement is already in the map, we found a pair
//            if (seen.containsKey(complement)) {
//                return true;
//            }
//
//            // Otherwise, mark this number as seen
//            seen.put(num, 1);
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 7, 11, 8};
//        int N = 10; // 2 + 8 = 10
//        System.out.println(TwoSum(arr, N)); // Output: true
//    }
//}


// public class ForEach{
//     public static boolean twoSum(int []arr,int N){
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int x : arr){
//             int diff = N-x;
//             if(map.containsKey(diff))
//                 return true;
//             map.put(x,1);
//         }
//         return false;
//     }
//     public static void main(String[] args){
//         int []arr = {10,20,30,90};
//         int N = 50;
//         System.out.println(twoSum(arr,N));
//     }
// }

//public class ForEach{
//    public static int prefixSum(int []arr,int k){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(0,1);
//        int prefix = 0;
//        int count = 0;
//        for(int x:arr){
//            prefix += x;
//            int diff = prefix - k;
//            if(map.containsKey(diff))
//                count += map.get(diff);
//            map.put(prefix,map.getOrDefault(prefix,0)+1);
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        int[] arr = {1, 1, 1}; // Subarrays: [1,1] at index 0-1, and [1,1] at index 1-2
//        int k = 2;
//        System.out.println(prefixSum(arr,k));
//    }
//}

//public class ForEach {
//    public static int prefixSum(int []arr,int K){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(0,1);
//        int prefix =0;int sum = 0;int count = 0;
//        for(int x: arr){
//            int diff = K-x;
//            if(map.containsKey(diff)) {
//                count += map.get(diff);
//            }
//            map.put(prefix,map.getOrDefault(prefix,0)+1);
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 40, 10};
//        int k = 20;
//        System.out.println(prefixSum(arr,k));
//    }
//}
//
//public class ForEach{
//    public static int prefixSum(int[]arr,int K){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int prefix = 0;
//        int count = 0;
//        map.put(0,1);
//        for(int x:arr){
//            prefix += x;
//            int diff =prefix-K;
//            if(map.containsKey(diff)){
//                count += map.get(diff);
//            }
//            map.put(prefix,map.getOrDefault(prefix,0)+1);
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        int []arr = {10,90,40,70};
//        int k = 100;
//        System.out.println(prefixSum(arr,k));
//    }
//}

//public class ForEach{
//    public static int prefix(int arr,int K){
//        HashMap
//    }
//    public static void main(String[] args){
//        int []arr = {10,20,30,40};
//        int k = 30;
//    }
//}