package Array_Questions;

import java.util.Scanner;

//public class MaxAndMin {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int max = arr[0];
//        int min = arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>max) max = arr[i];
//            if(arr[i]<min) min = arr[i];
//        }
//        System.out.println(max);
//        System.out.println(min);
//    }
//}

//public class MaxAndMin{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int Max = arr[0];
//        int Min = arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max) Max = arr[i];
//            if(arr[i]<Min) Min = arr[i];
//        }
//        System.out.println(Max +" "+ Min);
//    }
//}

public class MaxAndMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int Max = arr[0];
        int Min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max) Max = arr[i];
            if(arr[i]<Min) Min = arr[i];
        }
        System.out.println(Max +" " +Min);
    }
}
