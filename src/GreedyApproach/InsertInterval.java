//package GreedyApproach;
//
//import java.util.ArrayList;
//import java.util.List;
//
//record outputForm(int STime,int ETime){}
//public class InsertInterval {
//    public static List<Integer> ReqIntervals(int [][]nonOverlap,int []InsertInt){
//        int endTime ;
//        int startTime = InsertInt[0];
//        int n = nonOverlap.length;
//        List<outputForm> out = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            endTime = nonOverlap[i][1];
//            if(endTime >= startTime){
//                startTime = nonOverlap[i][0];
//                endTime = InsertInt[1];
//                out.add(new outputForm(startTime,endTime));
//            }
//            else {
//                out.add(new outputForm(startTime,endTime));
//            }
//        }
//        return new outputForm(out);
//    }
//    public static void main(String[] args){
//        int [][]nonOverlap = {{1,2},{3,5},{6,7},{8,10},{12,16}};
//        int []InsertInt = {4,8};
//    }
//}


