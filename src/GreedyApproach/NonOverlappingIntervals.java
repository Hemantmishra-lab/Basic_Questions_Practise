package GreedyApproach;

import java.util.Arrays;

public class NonOverlappingIntervals{
    public static int output(int [][]interval){
        Arrays.sort(interval,(a,b)->Integer.compare(a[1],b[1]));
        int n = interval.length;
        int end = interval[0][1];
        int count = 0;
        for(int i=0;i<n;i++){
            if(interval[i][0] >= end){
                count++;
                end = interval[i][1];
            }
        }
        return interval.length - count;
    }
    public static void main(String[] args){
        int [][] interval = {{1,2}, {2,3}, {3,4}, {1,3}};
        System.out.println(output(interval));
    }
}
