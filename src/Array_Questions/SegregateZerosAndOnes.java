package Array_Questions;

import java.util.Arrays;

//public class SegregateZerosAndOnes {
//
//    public static void segregate(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            // Left se aage badho agar pehle se 0 mil rahe hain
//            while (arr[left] == 0 && left < right) {
//                left++;
//            }
//
//            // Right se peeche aao agar pehle se 1 mil rahe hain
//            while (arr[right] == 1 && left < right) {
//                right--;
//            }
//
//            // Agar left par 1 hai aur right par 0, toh swap karo
//            if (left < right) {
//                arr[left] = 0;
//                arr[right] = 1;
//                left++;
//                right--;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {0, 1, 0, 1, 1, 0, 1, 0, 0};
//
//        System.out.println("Original Array: " + Arrays.toString(arr));
//
//        segregate(arr);
//
//        System.out.println("Segregated Array: " + Arrays.toString(arr));
//    }
//}

public class SegregateZerosAndOnes {
    public static void calcSegregateZerosAndOnes(int []arr){
        int left = 0;int right = arr.length-1;
        while(left<right){
            
        }
    }
    public static void main(String[] args){
        int []arr = {0, 1, 0, 1, 1, 0, 1, 0, 0};
    }
}