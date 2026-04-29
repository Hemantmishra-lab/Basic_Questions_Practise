package GreedyApproach;

import java.lang.classfile.MethodTransform;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//class Meeting{
//    int start;
//    int end;
//    int pos;
//    Meeting(int start,int end,int pos){
//        this.start = start;
//        this.end = end;
//        this.pos = pos;
//    }
//}
//public class NMeetingInOneRoom {
//
//    public static int maxmeeting(int []start,int[]end,int n){
//        ArrayList<Meeting> meetList = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            meetList.add(new Meeting(start[i],end[i],i+1 ));
//        }
//        Collections.sort(meetList,(a,b)->a.end - b.end);
//        int count = 1;
//        int lastEndTime = meetList.get(0).end;
//        for(int i=0;i<n;i++){
//            if(meetList.get(i).start>lastEndTime){
//                count++;
//                lastEndTime = meetList.get(i).end;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        int start[] = {1, 3, 0, 5, 8, 5};
//        int end[] = {2, 4, 6, 7, 9, 9};
//        int n = start.length;
//        System.out.println(maxmeeting(start,end,n));
//    }
//}

//class Meeting{
//    int start;
//    int end;
//    int pos;
//    public Meeting(int start,int end,int pos){
//        this.start = start;
//        this.end = end;
//        this.pos = pos;
//    }
//}
//public class NMeetingInOneRoom{
//
//    public static int maxMeeting(int []start,int[] end,int n){
//        ArrayList<Meeting> meetlist = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            meetlist.add(new Meeting(start[i],end[i],i+1));
//        }
//        Collections.sort(meetlist,(a,b)->a.end - b.end);
//        int count = 1;
//        int endtime = meetlist.get(0).end;
//        for(int i=1;i<n;i++){
//            if(meetlist.get(i).start > endtime){
//                count++;
//                endtime = meetlist.get(i).end;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []start = new int[n];
//        int []end = new int[n];
//        for(int i=0;i<n;i++){
//            System.out.println("start"+i);
//            start[i]=sc.nextInt();
//            System.out.println("end"+i);
//            end[i]=sc.nextInt();
//        }
//        System.out.println(maxMeeting(start,end,n));
//    }
//}

//class Meeting{
//    int start;
//    int end;
//    int pos;
//    public Meeting(int start,int end,int pos){
//        this.start = start;
//        this.end = end;
//        this.pos = pos;
//    }
//}
//public class NMeetingInOneRoom{
//    public static int MaxMeeting(int[]start,int[]end,int n){
//        ArrayList<Meeting> maxmeeting = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            maxmeeting.add(new Meeting(start[i],end[i],i+1));
//        }
//        Collections.sort(maxmeeting,(a,b)->a.end - b.end);
//        int count = 1;
//        int endmeeting = maxmeeting.get(0).end;
//        for(int i=0;i<n;i++){
//            if(maxmeeting.get(i).start > endmeeting){
//                count++;
//                endmeeting = maxmeeting.get(i).end;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []start = new int[n];
//        int []end = new int[n];
//        for(int i=0;i<n;i++){
//            System.out.println("Start"+i);
//            start[i] = sc.nextInt();
//            System.out.println("end"+i);
//            end[i] = sc.nextInt();
//        }
//        System.out.println(MaxMeeting(start,end,n));
//    }
//}
class Meeting{
    int start;
    int end;
    int pos;
    public Meeting(int start,int end,int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
public class NMeetingInOneRoom{
    public static int MaxMeeting(int[] start,int[] end,int n){
        ArrayList<Meeting> maxMeetingList = new ArrayList<>();
        for(int i=0;i<n;i++){
            maxMeetingList.add(new Meeting(start[i],end[i],i+1));
        }
        Collections.sort(maxMeetingList,(a,b)->a.end - b.end);
        int count = 1;
        int endtime = maxMeetingList.get(0).end;
        for(int i=1;i<n;i++){
            if(maxMeetingList.get(i).start > endtime){
                count++;
                endtime = maxMeetingList.get(i).end;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []start = new int[n];
        int []end = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Start"+i);
            start[i]=sc.nextInt();
            System.out.println("end"+i);
            end [i] = sc.nextInt();
        }
        System.out.println(MaxMeeting(start,end,n));
    }
}