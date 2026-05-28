package Array_Questions;

import java.util.Arrays;

//public class FindMedian {
//    public static int calcFindMedian(int []arr){
//        Arrays.sort(arr);
//        int n = arr.length;
//        if(n%2 == 0){
//            double med1 = (arr[n/2 -1] + arr[n/2])/ 2;
//            return (int) med1;
//        } else{
//            return arr[(int)n/2];
//        }
//    }
//    public static void main(String[] args){
//        int []arr = {2,4,8,10};
//        int []arr2 = {3,1,7,9,5};
//        System.out.println(calcFindMedian(arr));
//        System.out.println(calcFindMedian(arr2));
//    }
//}

//public class FindMedian {
//    public static double calcFindMedian(int []arr){
//        Arrays.sort(arr);
//        int n = arr.length;
//        if(n%2 == 0){
//            return (arr[(n/2)-1] +arr[n/2])/2.0;
//        }
//        else{
//            return arr[n/2];
//        }
//    }
//    public static void main(String[] args){
//        int []arr = {10,76,20,99,30};
//        int []arr2 = {11,3,8,11};
//        System.out.println(calcFindMedian(arr));
//        System.out.println(calcFindMedian(arr2));
//    }
//}

//public class FindMedian {
//    public static double calcFindMedian(int[] arr) {
//        int n = arr.length;
//        Arrays.sort(arr);
//        if (n % 2 == 0)
//            return ((arr[n / 2] + arr[(n / 2) - 1]) / 2.0);
//        else
//            return (arr[n/2]);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 8, 9, 6, 44};
//        System.out.print(calcFindMedian(arr));
//    }
//}

public class FindMedian {
    public static double calcFindMedian(int []arr){
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2==0)
            return (arr[n/2]+arr[(n/2)-1])/2.0;
        else
            return arr[n/2];
    }
    public static void main(String[] args){
        int []arr = {4,88,9,3,2,4};
        System.out.println(calcFindMedian(arr));
    }
}