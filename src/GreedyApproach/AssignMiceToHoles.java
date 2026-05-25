package GreedyApproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//public class AssignMiceToHoles {
//    public static int assignmice(int[]mouse,int[]holes){
//        Arrays.sort(mouse);
//        Arrays.sort(holes);
//        int n = mouse.length;
//
//        int maxTime = 0;
//        for(int i=0;i<n;i++){
//            int diff = Math.abs(mouse[i] - holes[i]);
//
//            // The total time is determined by the mouse that has the longest walk
//            maxTime = Math.max(maxTime, diff);;
//        }
//        return maxTime;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []mouse =new int[n];
//        int []holes = new int[n];
//        for(int i =0;i<n;i++){
//            System.out.println("Mouse array"+i+1+"th");
//            mouse[i] = sc.nextInt();
//            System.out.println("holes array"+i+1+"th");
//            holes[i] = sc.nextInt();
//        }
//        int sum = assignmice(mouse,holes);
//        System.out.println(sum);
//    }
//}

//public class AssignMiceToHoles{
//    public static int MaxTimeMiceHole(int[]mice,int[]holes,int n){
//        Arrays.sort(mice);
//        Arrays.sort(holes);
//        int MaxTime = 0;
//        for(int i=0;i<n;i++){
//            int time = Math.abs(mice[i] - holes[i]);
//            MaxTime=Math.max(MaxTime,time);
//        }
//        return MaxTime;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []mice = new int[n];
//        int []holes = new int[n];
//        for(int i =0 ; i<n;i++){
//            System.out.println("Mice"+i);
//            mice[i]=sc.nextInt();
//            System.out.println("Holes"+i);
//            holes[i] = sc.nextInt();
//        }
//        System.out.println(MaxTimeMiceHole(mice,holes,n));
//    }
//}

//public class AssignMiceToHoles{
//    public static int MaxTimeHole(int[] mice,int[] holes){
//        Arrays.sort(mice);
//        Arrays.sort(holes);
//        int maxTime = 0;
//        for(int i=0;i<mice.length;i++){
//            int Time = Math.abs(mice[i]-holes[i]);
//            maxTime=Math.max(maxTime,Time);
//        }
//        return  maxTime;
//    }
//    public static void main(String[] args){
//        int[] holes ={4,0,5};
//        int[] mice = {4,-4,2};
//        int maxTime = MaxTimeHole(mice,holes);
//        System.out.println(maxTime);
//    }
//
//}

//public class AssignMiceToHoles{
//    public static int MinTime(int []mice,int[]holes){
//        Arrays.sort(mice);
//        Arrays.sort(holes);
//        int diff;
//        int max =0;
//        for(int i=0;i< mice.length;i++){
//            diff = Math.abs(mice[i]-holes[i]);
//            max = Math.max(diff,max);
//        }
//        return max;
//    }
//    public static void main(String[] args){
//        int []mice = {4,-4,2};
//        int []holes = {4,0,5};
//        System.out.println(MinTime(mice,holes));
//    }
//}

//public class AssignMiceToHoles{
//    public static int assignholes(int []mice,int[]holes){
//        int max = 0;
//        for(int i=0;i<mice.length;i++){
//            int absDiff = Math.abs(mice[i]-holes[i]);
//            max = Math.max(absDiff,max);
//        }
//        return max;
//    }
//    public static void main(String[] args){
//        int []mice = {4,-4,2};
//        int []holes = {4,0,5};
//        System.out.println(assignholes(mice,holes));
//    }
//}\

//public class AssignMiceToHoles{
//    public static int calcAssignMiceToHoles(int []mice,int[]holes){
//        int MaxTime = 0;
//        for(int i=0;i<mice.length;i++){
//            MaxTime = Math.max(MaxTime,Math.abs(mice[i]-holes[i]));
//        }
//        return MaxTime;
//    }
//    public static void main(String[] args){
//        int []mice = {4,-4,2};
//        int []holes = {4,0,5};
//        System.out.println(calcAssignMiceToHoles(mice,holes));
//    }
//}

public class AssignMiceToHoles {
    public static int calcAssignMiceToHoles(int []mice,int []holes){
        int MaxTime = 0;
        for(int i=0;i<mice.length;i++) {
            MaxTime = Math.max(MaxTime, Math.abs(mice[i] - holes[i]));
        }
        return MaxTime;
    }
    public static void main(String[] args){
        int []mice = {4,-4,2};
        int []holes = {4,0,5};
        System.out.println(calcAssignMiceToHoles(mice,holes));
    }
}