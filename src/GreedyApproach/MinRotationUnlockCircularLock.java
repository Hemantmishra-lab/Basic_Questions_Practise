package GreedyApproach;

import java.util.Scanner;

public class MinRotationUnlockCircularLock {
    public static int minRotation(int[]curr,int[]des){
        int n = curr.length;
        int minstep = 0;
        for(int i=0;i<n;i++){
            int diff = Math.abs(curr[i] - des[i]);
            int sdiff = Math.abs(10 - diff);

            minstep = minstep +  Math.min(diff,sdiff);
        }
        return minstep;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Total no of column: ");
        int n = sc.nextInt();
        int []curr = new int[n];
        int[] des = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("for curr");
            curr[i]=sc.nextInt();
            System.out.println("for des");
            des[i] = sc.nextInt();
        }
        int minstep = minRotation(curr,des);
        System.out.println(minstep);
    }
}
