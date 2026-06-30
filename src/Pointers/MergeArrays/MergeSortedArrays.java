package Pointers.MergeArrays;


//public class MergeSortedArrays {
//    public static int[] merge(int[] arr1, int[] arr2) {
//        int n1 = arr1.length;
//        int n2 = arr2.length;
//        int[] result = new int[n1 + n2]; // Dono arrays ke size ka combined array
//
//        // Aapka bataya hua Pattern Setup
//        int i = 0; // Pointer for arr1
//        int j = 0; // Pointer for arr2
//        int k = 0; // Pointer for result array
//
//        // Loop 1: Jab tak dono arrays me elements hain, compare karke chota element uthao
//        while (i < n1 && j < n2) {
//            if (arr1[i] <= arr2[j]) {
//                result[k] = arr1[i];
//                i++;
//            } else {
//                result[k] = arr2[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Loop 2: Agar arr1 me kuch elements bach gaye hain, toh unhe copy karo
//        while (i < n1) {
//            result[k] = arr1[i];
//            i++;
//            k++;
//        }
//
//        // Loop 3: Agar arr2 me kuch elements bach gaye hain, toh unhe copy karo
//        while (j < n2) {
//            result[k] = arr2[j];
//            j++;
//            k++;
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        // Input Format
//        int[] arr1 = {1, 3, 5};
//        int[] arr2 = {2, 4, 6};
//
//        // Processing
//        int[] result = merge(arr1, arr2);
//
//        // Output Format
//        System.out.print("[");
//        for (int m = 0; m < result.length; m++) {
//            System.out.print(result[m]);
//            if (m < result.length - 1) System.out.print(",");
//        }
//        System.out.println("]");
//        // Output: [1,2,3,4,5,6]
//    }
//}

import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] calcMergeSortedArrays(int []arr1,int[]arr2){
        int []temp = new int[arr1.length+arr2.length];
        int n1 = arr1.length,n2 = arr2.length;
        int i = 0,j = 0,k = 0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                temp[k] = arr1[i];
                i++;k++;
            }
            else{
                temp[k] = arr2[j];
                j++;k++;
            }
        }
        while(i<n1){
            temp[k] = arr1[i];
            i++;k++;
        }
        while(j<n2){
            temp[k] = arr2[j];
            j++;k++;
        }
        return temp;
    }
    public static void main(String[] args){
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        System.out.println(Arrays.toString(calcMergeSortedArrays(arr1,arr2)));
    }
}
