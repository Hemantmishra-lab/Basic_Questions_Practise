package Array_Questions;//package Array_Questions;
//
//import java.util.Scanner;
//
//public class ArrayReverse {
//    public static int[] reverseArray(int[]  arr){
//        int n = arr.length;
//        int [] rev  = new int[n];
//        for(int i=n;i>=1;i--){
//            rev[i] = arr[n-i-1];
//        }
//        return rev;
//    }
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int[] result = reverseArray(arr);
//
//        System.out.println("Reversed Array: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(result[i] + " ");
//        }
//        sc.close();
//    }
//}
//

import java.sql.SQLOutput;

//public class ArrayReverse{
//    public static int[] reverse(int []arr){
//        int n = arr.length;
//        int []revarr = new int[n];
//        for(int i=0;i<n;i++){
//            revarr[i] = arr[n-1-i];
//        }
//        return revarr;
//    }
//    public static void main(String[] args){
//        int []arr = {10,20,30,40,50};
//        int []revarr = reverse(arr);
//        for(int i=0;i< arr.length;i++){
//            System.out.println(revarr[i]);
//        }
//    }
//}

//public class ArrayReverse{
//    public static int[] calcReverseArray(int []arr){
//        int rev [] = new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            rev[i] = arr[arr.length-i-1];
//        }
//        return rev;
//    }
//    public static void main(String[] args){
//        int arr []= {10,20,30,40,50};
//        int []rev=calcReverseArray(arr);
//        for(int X : rev){
//            System.out.print(X +" ");
//        }
//    }
//}

public class ArrayReverse{
    public static int[] calcArrayReverse(int []arr){
        int []revArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            revArr[i] = arr[arr.length-i-1];
        }
        return revArr;
    }
    public static void main(String[] args){
        int []arr = {11,2,100,90};
        int []revArr = calcArrayReverse(arr);
        for(int X : revArr){
            System.out.print(X + " ");
        }
    }
}