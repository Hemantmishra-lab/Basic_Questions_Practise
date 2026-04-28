package GreedyApproach;

import java.util.ArrayList;
import java.util.Collections;

class Meeting{
    int start;
    int end;
    int pos;
    Meeting(int start,int end,int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
public class NMeetingInOneRoom {

    public static int maxmeeting(int []start,int[]end,int n){
        ArrayList<Meeting> meetList = new ArrayList<>();
        for(int i=0;i<n;i++){
            meetList.add(new Meeting(start[i],end[i],i+1 ));
        }
        Collections.sort(meetList,(a,b)->a.end - b.end);
        int count = 1;
        int lastEndTime = meetList.get(0).end;
        for(int i=0;i<n;i++){
            if(meetList.get(i).start>lastEndTime){
                count++;
                lastEndTime = meetList.get(i).end;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        System.out.println(maxmeeting(start,end,n));
    }
}
