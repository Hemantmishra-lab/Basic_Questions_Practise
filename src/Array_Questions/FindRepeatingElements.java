package Array_Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//public class FindRepeatingElements {
//    public static List<Integer> calcFindRepeatingElemets(int[]arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        List<Integer> list = new ArrayList<>();
//        for(int X: arr)
//            map.put(X,map.getOrDefault(X,0)+1);
//       for(int key : map.keySet()){
//           if(map.get(key)>1){
//               list.add(key);
//           }
//       }
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {1,1,1,2,2,4,5,6,7,8,8,9,9};
//        System.out.println(calcFindRepeatingElemets(arr));
//    }
//}

public class FindRepeatingElements {
    public static List<Integer> calcFindRepeatingElements(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int X : arr)
            map.put(X,map.getOrDefault(X,0)+1);
        for(int key : map.keySet()){
            if(map.get(key)>1){
                list.add(key);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int []arr = {1,1,1,2,2,4,5,6,7,8,8,9,9};
        System.out.println(calcFindRepeatingElements(arr));
    }
}
