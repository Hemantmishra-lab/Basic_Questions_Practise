package Array_Questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//public class RearrangeAscendingOrDescening {
//    public static void  calcAscending(int []arr){
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] +" ");
//        }
//        System.out.println();
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i] +" ");
//        }
//    }
//    public static void main(String[] args){
//        int []arr = {10,2,100,99,8,88};
//        calcAscending(arr);
//    }
//}

//public class RearrangeAscendingOrDescening {
//    public static void calcRearrangeAscendingOrDecreasing(int []arr){
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for (int i= arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args){
//        int []arr = {10,2,100,99,8,88};
//        calcRearrangeAscendingOrDecreasing(arr);
//    }
//}
//
//public class RearrangeAscendingOrDescening {
//    public static List<List<Integer>> calcRearrangeAscendingOrDescending(int []arr){
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> increasing = new ArrayList<>(Arrays.asList(arr));
//        List<Integer> decreasing = new ArrayList<>(Arrays.asList(arr));
//        Collections.sort(increasing);
//        decreasing.sort(Collections.reverseOrder());
//
//        // Return both lists bundled together
//        return Arrays.asList(increasing, decreasing);
//
//    }
//    public static void main(String[] args){
//        int []arr = {10,2,100,99,8,88};
//        System.out.println(calcRearrangeAscendingOrDescending(arr));
//    }
//}

//public class RearrangeAscendingOrDescening {
//    public static List<List<Integer>> calcRearrangeAscendingOrDescending(int []arr){
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> asc = new ArrayList<>();
//        List<Integer> des = new ArrayList<>();
//        for(int X:arr){
//            asc.add(X);
//            des.add(X);
//        }
//        Collections.sort(asc,(a,b)->Integer.compare(a,b));
//        Collections.sort(des,(a,b)->Integer.compare(b,a));
//        list.add(asc);
//        list.add(des);
//        return list;
//    }
//    public static void main(String[] args){
//        int []arr = {10,2,100,99,8,88};
//        System.out.println(calcRearrangeAscendingOrDescending(arr));
//    }
//}

public class RearrangeAscendingOrDescening {
    public static void calcRearrangeAscendingOrDescending(int[]arr){
        Arrays.sort(arr);
        for(int X:arr)
            System.out.print(X +" ");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[arr.length-i-1] +" ");
        }
    }
    public static void main(String[] args){
        int []arr = {10,2,100,99,8,88};
        calcRearrangeAscendingOrDescending(arr);
    }
}