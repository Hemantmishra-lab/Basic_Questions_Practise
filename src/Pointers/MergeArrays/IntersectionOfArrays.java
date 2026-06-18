package Pointers.MergeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class IntersectionOfArrays {
//    public static int[] intersection(int[] arr1, int[] arr2) {
//        // Aapka bataya hua Pointer Setup
//        int i = 0; // Pointer for arr1
//        int j = 0; // Pointer for arr2
//
//        int n1 = arr1.length;
//        int n2 = arr2.length;
//
//        List<Integer> list = new ArrayList<>();
//
//        // Match dhoondhne ke liye main loop
//        while (i < n1 && j < n2) {
//            if (arr1[i] == arr2[j]) {
//                // Agar element match ho gaya, toh list me add karo
//                list.add(arr1[i]);
//                i++; // Dono pointers ko aage badhao
//                j++;
//            }
//            else if (arr1[i] < arr2[j]) {
//                i++; // arr1 ka element chota hai, toh usko badhao
//            }
//            else {
//                j++; // arr2 ka element chota hai, toh usko badhao
//            }
//        }
//
//        // List ko standard int[] array me convert karo output ke liye
//        int[] result = new int[list.size()];
//        for (int k = 0; k < list.size(); k++) {
//            result[k] = list.get(k);
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        // Input Format
//        int[] arr1 = {1, 2, 3, 4};
//        int[] arr2 = {2, 4, 6};
//
//        // Processing
//        int[] result = intersection(arr1, arr2);
//
//        // Output Format
//        System.out.print("[");
//        for (int m = 0; m < result.length; m++) {
//            System.out.print(result[m]);
//            if (m < result.length - 1) System.out.print(",");
//        }
//        System.out.println("]");
//        // Output: [2,4]
//    }
//}

//public class IntersectionOfArrays {
//    public static int[] calcIntersectionOfArrays(int []arr1,int []arr2){
//        List<Integer> list = new ArrayList<>();
//        int left = 0;
//        int right = 0;
//        while(left<arr1.length && right<arr2.length){
//            if(arr1[left] == arr2[right]){
//                list.add(arr1[left]);
//                left++;right++;
//            }
//            else if(arr1[left]<arr2[right]){
//                left++;
//            }
//            else{
//                right++;
//            }
//        }
//        int[] arr = new int[list.size()];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = list.get(i);
//        }
//        return arr;
//    }
//    public static void main(String[] args){
//        int[] arr1 = {1, 2, 3, 4};
//        int[] arr2 = {2, 4, 6};
//        System.out.println(Arrays.toString(calcIntersectionOfArrays(arr1,arr2)));
//    }
//}

public class IntersectionOfArrays {
    public static int[] calcIntersectionOfArrays(int[]arr1,int[]arr2){
        List<Integer> list  = new ArrayList<>();
        int i=0;int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                list.add(arr1[i]);
                i++;j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int []temp = new int[list.size()];
        for(int o=0;o<list.size();o++){
            temp[o] = list.get(o);
        }
        return temp;
    }
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 6};
        System.out.println(Arrays.toString(calcIntersectionOfArrays(arr1,arr2)));
    }
}
