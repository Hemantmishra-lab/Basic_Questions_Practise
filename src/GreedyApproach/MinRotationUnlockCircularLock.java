package GreedyApproach;

import java.util.Scanner;

//public class MinRotationUnlockCircularLock {
//    public static int minRotation(int[]curr,int[]des){
//        int n = curr.length;
//        int minstep = 0;
//        for(int i=0;i<n;i++){
//            int diff = Math.abs(curr[i] - des[i]);
//            int sdiff = Math.abs(10 - diff);
//
//            minstep = minstep +  Math.min(diff,sdiff);
//        }
//        return minstep;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Total no of column: ");
//        int n = sc.nextInt();
//        int []curr = new int[n];
//        int[] des = new int[n];
//        for(int i=0;i<n;i++){
//            System.out.println("for curr");
//            curr[i]=sc.nextInt();
//            System.out.println("for des");
//            des[i] = sc.nextInt();
//        }
//        int minstep = minRotation(curr,des);
//        System.out.println(minstep);
//    }
//}

//public class MinRotationUnlockCircularLock {
//    public static int MinRotation(int []curr,int []des){
//        int absdiff , cirdiff;
//        int sum = 0;
//        int max;
//        for(int i=0;i<curr.length;i++){
//            absdiff = Math.abs(curr[i]-des[i]);
//            cirdiff = 10-absdiff;
//            max = Math.min(absdiff,cirdiff);
//            sum += max;
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//        int []curr = {2,8,5};
//        int []des = {5,2,9};
//        System.out.println(MinRotation(curr,des));
//    }
//}
//
//public class  MinRotationUnlockCircularLock{
//    public static int calcMinRotation(int[]curr,int[]des){
//        int MaxTime = 0;
//        for(int i=0;i<curr.length;i++){
//           int diff = Math.abs(curr[i] - des[i]);
//           int cirDiff = 10 - diff;
//           MaxTime = Math.max(MaxTime,Math.min(diff,cirDiff));
//        }
//        return MaxTime;
//    }
//    public static void main(String[] args){
//        int[]curr = {2,8,5};
//        int []des = {5,2,9};
//        System.out.println(calcMinRotation(curr,des));
//    }
//}

public class MinRotationUnlockCircularLock {
    public static int calcMinRotationUnlockCircularLock(int []curr,int []des){
        int MinRotate = 0;
        for(int i=0;i<curr.length;i++){
            int diff = Math.abs(curr[i]-des[i]);
            int cirDif = 10 - diff;
            MinRotate = Math.max(MinRotate,Math.min(diff,cirDif));
        }
        return MinRotate;
    }
    public static void main(String[] args){
        int[]curr = {2,8,5};
        int []des = {5,2,9};
        System.out.println(calcMinRotationUnlockCircularLock(curr,des));
    }
}