package Array_Questions;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

//public class SegregateZerosAndOnes {
//    public static void calcSegregateZerosAndOnes(int []arr){
//        int slow = 0;int fast = 0;
//        while(fast<arr.length){
//            if(arr[fast] != 0){
//                arr[slow] = arr[fast];
//                slow++;
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
//        int []arr = {0, 1, 0, 1, 1, 0, 1, 0, 0};
//        calcSegregateZerosAndOnes(arr);
//        for(int X:arr)
//            System.out.print(X+" ");
//    }
//}

//public class SegregateZerosAndOnes {
//    public static int[] calcSegregateZerosAndOnes(int []arr){
//        int fast = 0;
//        int slow = 0;
//        int n = arr.length;
//        while(fast<n){
//            if(arr[fast]!=0){
//                arr[slow] = arr[fast];
//                slow++;
//            }
//            fast++;
//        }
//        while(slow<n){
//            arr[slow] = 0;
//            slow++;
//        }
//        return arr;
//    }
//    public static void main(String[] args){
//        int []arr = {0, 1, 0, 1, 1, 0, 1, 0, 0};
//        System.out.println(Arrays.toString(calcSegregateZerosAndOnes(arr)));
//    }
//}
//public class SegregateZerosAndOnes {
//    public static void calcSegregateZeroesAndOnes(int []arr){
//        int slow = 0;
//        int fast = 0;
//        while(fast<arr.length){
//            if(arr[fast] != 0){
//                arr[slow]  = arr[fast];
//                slow++;
//            }
//            fast++;
//        }
//        while(slow<arr.length){
//            arr[slow] = 0;
//            slow++;
//        }
//    }
//    public static void main(String[] args){
//        int []arr = {0, 1, 0, 1, 1, 0, 1, 0, 0};
//        calcSegregateZeroesAndOnes(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

//public class SegregateZerosAndOnes {
//    public static void calcSegregateZeroesAndOnes(int []arr){
//        int slow = 0;
//        int fast = 0;
//        while(fast<arr.length){
//            if(arr[fast] != 0){
//                arr[slow] = arr[fast];
//                slow++;
//            }
//            fast++;
//        }
//        while(slow<arr.length){
//            arr[slow] = 0;
//            slow++;
//        }
//    }
//    public static void main(String[] args){
//        int []arr = {0, 1, 0, 1, 1, 0, 1, 0, 0};
//        calcSegregateZeroesAndOnes(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

public class SegregateZerosAndOnes {
    public static void calcSegregateZeroesAndOnes(int []arr){
        int fast = 0;
        int slow = 0;
        while(fast<arr.length){
            if(arr[fast]!=0){
                arr[slow] = arr[fast];
                slow++;
            }
            fast++;
        }

        while(slow<arr.length){
            arr[slow] = 0;
            slow++;
        }
    }
    public static void main(String[] args){
        int []arr = {0, 1, 0, 1, 1, 0, 1, 0, 0};
        calcSegregateZeroesAndOnes(arr);
        System.out.println(Arrays.toString(arr));
    }
}