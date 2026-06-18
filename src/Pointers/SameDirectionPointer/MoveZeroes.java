package Pointers.SameDirectionPointer;
//
//public class MoveZeroes {
//    public static void moveZeroes(int[] arr) {
//        // Aapka bataya hua Fast & Slow Pointer format
//        int slow = 0;
//        int fast = 0;
//        int n = arr.length;
//
//        // Step 1: Saare non-zero elements ko aage shift karo
//        while (fast < n) {
//            if (arr[fast] != 0) {
//                arr[slow] = arr[fast];
//                slow++;
//            }
//            fast++;
//        }
//
//        // Step 2: Bache huye saare positions ko zero se bhar do
//        while (slow < n) {
//            arr[slow] = 0;
//            slow++;
//        }
//    }
//
//    public static void main(String[] args) {
//        // Input Format
//        int[] arr = {0, 1, 0, 3, 12};
//
//        // Processing
//        moveZeroes(arr);
//
//        // Output Format
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//            if (i < arr.length - 1) System.out.print(",");
//        }
//        System.out.println("]");
//        // Output: [1,3,12,0,0]
//    }
//}


import java.util.Arrays;

public class MoveZeroes {
    public static int[] calcMoveZeroes(int []arr){
        int fast = 0;
        int slow = 0;
        while (fast<arr.length){
            if(arr[fast] != 0){
                arr[slow] = arr[fast];
                slow++;
            }
            fast++;
        }
        while(slow<arr.length){
            arr[slow] = 0;
            slow++;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(calcMoveZeroes(arr)));
    }
}