package GreedyApproach;//package GreedyApproach;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//class jobseq{
//    int jobId;
//    int deadline;
//    int profit;
//    int pos;
//    public jobseq(int jobId,int deadline,int profit,int pos){
//        this.jobId = jobId;
//        this.deadline = deadline;
//        this.profit  = profit;
//        this.pos = pos;
//    }
//}
//public class JobSequencingProblem {
//    public static void MaxProfit(int[]jobId,int[]deadline,int[]profit,int n){
//        ArrayList<jobseq> JobSeq = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            JobSeq.add(new jobseq(jobId[i],deadline[i],profit[i],i+1 ));
//        }
//        Collections.sort(JobSeq,(a,b)-> b.profit- a.profit);
//        int maxProfit = JobSeq.get(0).profit;
//
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []jobId = new int[n];
//        int[] deadline = new int[n];
//        int [] profit = new int[n];
//        for(int i=0;i<n;i++){
//            System.out.println("jobID"+i);
//            jobId[i] = sc.nextInt();
//            System.out.println("Deadline"+i);
//            deadline[i] = sc.nextInt();
//            System.out.println("Profit Generates"+i);
//            profit[i] = sc.nextInt();
//
//        }
//    }
//}

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//class job{
//    int jobId;
//    int  deadline;
//    int profit;
//    public job(int jobId,int deadline,int profit){
//        this.jobId = jobId;
//        this.deadline = deadline;
//        this.profit = profit;
//    }
//}
//public class JobSequencingProblem{
//    public static void maxProfit(int[] jobId,int[] deadline,int[] profit,int n){
//        ArrayList<job> JobIdProfitList = new ArrayList<>();
//        int maxdeadline = 0;
//        for(int i=0;i<n;i++){
//            JobIdProfitList.add(new job(jobId[i],deadline[i],profit[i] ));
//            maxdeadline = Math.max(maxdeadline,deadline[i]);
//        }
//        Collections.sort(JobIdProfitList,(a,b)->b.profit - a.profit);
//        int []result = new int[maxdeadline+1];
//        for(int i=0;i<=maxdeadline;i++){
//            result[i]= -1;
//        }
//        int countJob = 0;
//        int totalProfit = 0;
//        for(int i=0;i<n;i++){
//            for(int j=JobIdProfitList.get(i).deadline;j>0;j--){
//                if(result[j] == -1){
//                    result[j] = JobIdProfitList.get(i).jobId;
//                    totalProfit = totalProfit + JobIdProfitList.get(i).profit;
//                    countJob++;
//                    break;
//                }
//            }
//        }
//        System.out.println("Execute Summary");
//        System.out.println("Number of Jobs Done "+countJob);
//        System.out.println("Total Profit generated : "+totalProfit);
//        System.out.println("Job Sequence :");
//        for(int i=1;i<=maxdeadline;i++){
//            if(result[i] != -1){
//                System.out.println(result[i] +" ");
//            }
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []jobId = new int[n];
//        int []deadline = new int[n];
//        int []profit = new int[n];
//        for(int i=0;i<n;i++){
//            System.out.println("Job ID: " +i);
//            jobId[i]=sc.nextInt();
//            System.out.println("DeadLine : "+i);
//            deadline[i] = sc.nextInt();
//            System.out.println("profit : "+i);
//            profit[i] = sc.nextInt();
//        }
//        maxProfit(jobId,deadline,profit,n);
//    }
//}

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.*;
//
//class Job{
//    int JobID;
//    int deadline;
//    int profit;
//    public Job(int jobID,int deadline,int profit){
//        this.JobID = jobID;
//        this.deadline = deadline;
//        this.profit = profit;
//    }
//}
//public class JobSequencingProblem{
//    public static void MaxProfit(int[] JobID,int[] deadline,int[] profit,int n){
//        List<Job> maxProfitList = new ArrayList<>();
//        int maxDeadline = 0;
//        for(int i=0;i<n;i++){
//            maxProfitList.add(new Job(JobID[i],deadline[i],profit[i]));
//            maxDeadline = Math.max(maxDeadline,deadline[i]);
//        }
//        Collections.sort(maxProfitList,(a,b)->b.profit - a.profit);
//        int []JobIdSeq = new int[maxDeadline + 1];
//        for(int i=0;i<=maxDeadline;i++){
//            JobIdSeq[i] = -1;
//        }
//        int totalProfit = 0;
//        int JobCount = 0;
//        for(int i=0;i<n;i++){
//            for(int j=maxProfitList.get(i).deadline;j>0;j--){
//                if(JobIdSeq[j] == -1){
//                    JobIdSeq[j] = maxProfitList.get(i).JobID;
//                    totalProfit = totalProfit + maxProfitList.get(i).profit;
//                    JobCount++;
//                    break;
//                }
//            }
//        }
//        System.out.println("EXECUTION SUMMARY");
//        System.out.println(totalProfit+" is Total Profit");
//        System.out.println(JobCount+" is the JobCount");
//        System.out.println("Job ID is in sequence");
//        for(int i=1;i<=maxDeadline;i++){
//            if(JobIdSeq[i] != -1){
//                System.out.println(JobIdSeq[i]);
//            }
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] jobId = new int[n];
//        int [] deadline = new int[n];
//        int [] profit = new int[n];
//        for(int i=0;i<n;i++){
//            System.out.println("JobID"+i);
//            jobId[i] = sc.nextInt();
//            System.out.println("deadline"+i);
//            deadline[i] = sc.nextInt();
//            System.out.println("Profit"+i);
//            profit[i] = sc.nextInt();
//        }
//        MaxProfit(jobId,deadline,profit,n);
//    }
//}
record ClassRowList(int deadline,int profit,String JobId){}
record OutputClass(List<String> jbId,int TotalProfit){}
public class JobSequencingProblem{
    public static OutputClass MaxProfit(int []deadline,int []profit,String[]JobId){
        List<ClassRowList> DetailJobL = new ArrayList<>();
        int maxDeadline = 0;
        int n = profit.length;
        List<String> outputStr = new ArrayList<>();
        for(int i=0;i<n;i++){
            DetailJobL.add(new ClassRowList(deadline[i],profit[i],JobId[i]));
            maxDeadline=Math.max(maxDeadline,deadline[i]);
        }
        Collections.sort(DetailJobL,(a,b)->Integer.compare(b.profit(), a.profit()));
        int[] maxDeadlineArray = new int[maxDeadline+1];
        for(int i=0;i<maxDeadlineArray.length;i++){
            maxDeadlineArray[i] = -1;
        }
        int maxProfit = 0;
        for(int i=0;i<n;i++){
//            maxProfit += DetailJobL.get(i).profit();
            int x = DetailJobL.get(i).deadline();
            if(maxDeadlineArray[x] == -1){
                maxProfit += DetailJobL.get(i).profit();
                outputStr.add(DetailJobL.get(i).JobId());
            }
            else{
                for(int m = x-1;m>=1;m--){

                }
            }
        }
        return new OutputClass(outputStr,maxProfit);
    }
    public static void main(String[] args){
        int []deadline = {2,1,3,2,1,3};
        int []profit = {100,19,27,25,15,35};
        String []JobId = {"J1","J2","J3","J4","J5","J6"};
    }
}
//
//record OutputFormatClass(String[] JobId,int TotalProfit){}
//record ListFormat(int deadline,int profit ,String jobId){}
//public class JobSequencingProblem{
//    public static OutputFormatClass MaxProfit(int []deadline,int [] profit,String []jobId){
//        List<ListFormat> list = new ArrayList<>();
//        int n = deadline.length;
//        int maxdeadline = 0;
//        for(int i=0;i<n;i++){
//            list.add(new ListFormat(deadline[i],profit[i],jobId[i]));
//            maxdeadline = Math.max(maxdeadline,list.get(i).deadline());
//        }
//        int []maxDeadlineArray = new int[maxdeadline];
//        for(int i=0;i<n;i++){
//            maxDeadlineArray[i] = -1;
//        }
//        String []JobId = new String[maxdeadline];
//        int TotalProfit = 0;
//        Collections.sort(list,(a,b)-> Integer.compare(b.profit(),a.profit()));
//        for(int i=0;i<n;i++){
//            int deadl = list.get(i).deadline();
//            if(maxDeadlineArray[deadl] == -1){
//                TotalProfit += list.get(i).profit();
//                JobId[deadl] = list.get(i).jobId();
//            }
//            else {
//                while(deadl >= 1){
//                    TotalProfit += list.get(i).profit();
//                    JobId[deadl] = list.get(i).jobId();
//                    deadl--;
//                }
//            }
//        }
//        return new OutputFormatClass(JobId,TotalProfit);
//    }
//    public static void main(String[] args){
//        int [] deadline = {2,1,3,2,1,3};
//        int [] profit = {100,19,27,25,15,35};
//        String[] jobId = {"J1","J2","J3","J4","J5","J6"};
//        System.out.print(MaxProfit(deadline,profit,jobId));
//    }
//}