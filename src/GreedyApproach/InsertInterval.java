package GreedyApproach;//package GreedyApproach;
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

//import java.util.ArrayList;
//import java.util.List;
//
//record Schedule(int start,int end){}
//public class InsertInterval{
//    public static List<Schedule> insertInterval(int[][]nonOverlap, int[]interval){
//        List<Schedule> list = new ArrayList<>();
//        int i=0;int n = nonOverlap.length;
//            while(i<n && nonOverlap[i][1]<interval[0]){
//                list.add(new Schedule(nonOverlap[i][0],nonOverlap[i][1]));
//                i++;
//            }
//            while(i<n && nonOverlap[i][0]<=interval[1]){
//                nonOverlap[i][0]=Math.min(nonOverlap[i][0],interval[0]);
//                nonOverlap[i][1]=Math.max(nonOverlap[i][1],interval[1]);
//                i++;
//            }
//            list.add(new Schedule(nonOverlap[i][0],nonOverlap[i][1]));
//            while(i<n){
//                list.add(new Schedule(nonOverlap[i][0],nonOverlap[i][1]));
//                i++;
//            }
//            return list;
//
//    }
//    public static void main(String[] args){
//        int [][]nonOverlap = {{1,3},{6,9},{10,20}};
//        int []interval = {2,5};
//        System.out.println(insertInterval(nonOverlap,interval));
//    }
//}

import java.util.ArrayList;
import java.util.List;

//record OutputFormat(int start,int end){}
//public class InsertInterval{
//    public static List<OutputFormat> calcInsertinterval(int[][]nonOverlap, int []interval){
//        int n = nonOverlap.length , i = 0;
//        List<OutputFormat> list = new ArrayList<>();
//        while(i<n && nonOverlap[i][1] < interval[0]){
//            list.add(new OutputFormat(nonOverlap[i][0],nonOverlap[i][1]));
//            i++;
//        }
//        while(i<n && nonOverlap[i][0] <= interval[1]){
//           interval[0] = Math.min(nonOverlap[i][0],interval[0]);
//            interval[1] = Math.max(nonOverlap[i][1],interval[1]);
//            i++;
//        }
//        list.add(new OutputFormat(interval[0],interval[1]));
//        while(i<n){
//            list.add(new OutputFormat(nonOverlap[i][0],nonOverlap[i][1]));
//            i++;
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int [][]nonOverlap = {{1,3},{6,9},{10,20}};
//        int []interval = {2,5};
//        System.out.println(calcInsertinterval(nonOverlap,interval));
//    }
//}

//record OutputFormatClass(int start,int end){}
//public class InsertInterval {
//    public static List<OutputFormatClass> calcInsertInterval(int [][]nonOverlap,int []interval){
//        List<OutputFormatClass> list = new ArrayList<>();
//        int i=0;int n = nonOverlap.length;
//        while(i<n && interval[0]>nonOverlap[i][1]){
//            list.add(new OutputFormatClass(nonOverlap[i][0],nonOverlap[i][1]));
//            i++;
//        }
//        while(i<n && interval[1]>= nonOverlap[i][0]){
//            interval[0] = Math.min(interval[0],nonOverlap[i][0]);
//            interval[1] = Math.max(interval[1],nonOverlap[i][1]);
//            list.add(new OutputFormatClass(interval[0],interval[1]));
//            i++;
//        }
//        while(i<n){
//            list.add(new OutputFormatClass(nonOverlap[i][0],nonOverlap[i][1]));
//            i++;
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int [][]nonOverlap = {{1,3},{6,9},{10,20}};
//        int []interval = {2,5};
//        System.out.println(calcInsertInterval(nonOverlap,interval));
//    }
//}

record ListOutputFormat(int start,int end){}
public class InsertInterval {
    public static List<ListOutputFormat> calcInsertInterval(int [][]nonoverlap,int []interval){
        List<ListOutputFormat> list = new ArrayList<>();
        int i=0;int n = nonoverlap.length;
        while(i<n && interval[0]>nonoverlap[i][1]){
            list.add(new ListOutputFormat(nonoverlap[i][0],nonoverlap[i][1]));
            i++;
        }
        while(i<n && interval[1]>=nonoverlap[i][0]){
            interval[0] = Math.min(interval[0],nonoverlap[i][0]);
            interval[1] = Math.max(interval[1],nonoverlap[i][1]);
            list.add(new ListOutputFormat(interval[0],interval[1]));
            i++;
        }
        while(i<n){
            list.add(new ListOutputFormat(nonoverlap[i][0],nonoverlap[i][1]));
            i++;
        }
        return list;
    }
    public static void main(String[] args){
        int [][]nonOverlap = {{1,3},{6,9},{10,20}};
        int []interval = {2,5};
        System.out.println(calcInsertInterval(nonOverlap,interval));
    }
}