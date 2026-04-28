package GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

//public class ShopCandyStore {
//    public static int shopcandy(int []arr){
//        Arrays.sort(arr);
//        int n = arr.length;
//        int forward = 0;
//        int backward = n-1;
//        int sum = 0;
//        while(forward <= backward){
//            sum = sum + arr[forward];
//            forward ++;
//            backward = backward -2;
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int result = shopcandy(arr);
//        System.out.println(result);
//    }
//}

public class ShopCandyStore{
    public static int MinCostToffes(int k,int [] arr){
        Arrays.sort(arr);
        int totalToffess = arr.length;
        int forward = 0;
        int backward = totalToffess - 1;
        int mincost = 0;
        while(forward<=backward){
            mincost = mincost + arr[forward];
            forward ++;
            backward = backward -k;
        }
        return mincost;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("No of Free Toffees after one purchase: ");
        int k = sc.nextInt();
        System.out.println("Total Number of toffees: ");
        int m = sc.nextInt();
        System.out.println("Gives all the prices of the toffees: ");
        int arr[] = new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        int mincost = MinCostToffes(k,arr);
        System.out.println(mincost);
    }
}
