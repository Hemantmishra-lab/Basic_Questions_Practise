package GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class MaxShopCandyStore {
    public static int MaxShopCandy(int k,int[] arr){
        Arrays.sort(arr);
        int totalToffee = arr.length;
        int forward = totalToffee - 1;
        int backward = 0;
        int maxcost = 0;
        while(forward>=backward){
            maxcost = maxcost + arr[forward];
            forward --;
            backward = backward +k;
        }
        return maxcost;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int []arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        int maxCost = MaxShopCandy(k,arr);
        System.out.println(maxCost);
    }
}
