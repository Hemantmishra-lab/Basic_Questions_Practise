package Array_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

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

public class RemoveDupliateSortedArray {
    public static int[] calcRemoveDuplicateSortedArray(int []arr){
        int []temp = new int[arr.length];
        int index = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index] = arr[arr.length-1];
        return temp;
    }
    public static void main(String[] args){
        int []arr = {1,1,1,2,2,3,4,5,6,6,6,7,8,9};
        int[]temp = calcRemoveDuplicateSortedArray(arr);
        for(int X:temp)
            System.out.print(X +" ");
    }
}