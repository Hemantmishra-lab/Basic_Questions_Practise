package Array_Questions;

import java.util.*;

//public class RemoveDupliateSortedArray {
//    public static List<Integer> calcRemoveDuplicateSortedArray(int []arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int X: arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//        List<Integer> list = new ArrayList<>();
//        list.addAll(map.keySet());
//        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
//        return list;
//    }
//    public static void main(String[]args){
//        int []arr = {1,1,1,1,1,1,1,9,9,9,9,4,4,4,4,4,6,6,6,6,7,77,7,};
//        System.out.println(calcRemoveDuplicateSortedArray(arr));
//    }
//}
//
//public class RemoveDupliateSortedArray {
//    public static int[] calcRemoveDuplicateSortedArray(int []arr){
//        int []temp = new int[arr.length];
//        int index = 0;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i] != arr[i+1]){
//                temp[index] = arr[i];
//                index++;
//            }
//        }
//        temp[index] = arr[arr.length-1];
//        return temp;
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,2,2,3,4,5,6,6,6,7,8,9};
//        int[]temp = calcRemoveDuplicateSortedArray(arr);
//        for(int X:temp)
//            System.out.print(X +" ");
//    }
//}
//
//public class RemoveDupliateSortedArray {
//    public static int[] calcRemoveDuplicateSortedArray(int []arr){
//        int []temp = new int[arr.length];
//        int j = 0;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]!=arr[i+1]){
//                temp[j] = arr[i];
//                j++;
//            }
//        }
//        temp[j] = arr[arr.length-1];
//        return temp;
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,2,2,3,4,5,6,6,6,7,8,9};
//        int []temp  = calcRemoveDuplicateSortedArray(arr);
//        for(int X:temp)
//            System.out.print(X+" ");
//    }
//}

//public class RemoveDupliateSortedArray {
//    public static void calcRemoveDuplicateSortedArray(int []arr){
//        int fast = 0;
//        int slow = 0;
//        while(fast<arr.length){
//            if(arr[slow] != arr[fast]){
//                slow++;
//                arr[slow] = arr[fast];
//            }
//            fast++;
//        }
//        slow++;
//        while(slow<arr.length){
//            arr[slow] = 0;
//            slow++;
//        }
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,2,2,3,4,5,6,6,6,7,8,9};
//        calcRemoveDuplicateSortedArray(arr);
//        for(int X: arr)
//            System.out.print(X+" ");
//    }
//}

//public class RemoveDupliateSortedArray {
////    public static int[] calcRemoveDuplicateSortedArray(int []arr){
////        int fast = 0;
////        int slow = 0;
////        while(fast<arr.length){
////            if(arr[fast] != arr[slow]){
////                slow++;
////                arr[slow] = arr[fast];
////            }
////            fast++;
////        }
////        slow++;
////        while(slow<arr.length){
////            arr[slow] = 0;
////            slow++;
////        }
////        return arr;
////    }
////    public static void main(String[] args){
////        int []arr = {1,1,1,2,2,3,4,5,6,6,6,7,8,9};
////        System.out.println(Arrays.toString(calcRemoveDuplicateSortedArray(arr)));
////    }
////}

public class RemoveDupliateSortedArray {
    public static void calcRemoveDuplicateSortedArray(int []arr){
        int slow = 0;
        int fast = 0;
        while(fast<arr.length){
            if(arr[slow] != arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }
            fast++;
        }
    }
    public static void main(String []args){
        int []arr = {1,1,1,2,2,3,4,5,6,6,6,7,8,9};
        calcRemoveDuplicateSortedArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}