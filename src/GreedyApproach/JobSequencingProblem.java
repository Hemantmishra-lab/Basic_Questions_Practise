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
import java.util.*;

class Job{
    int JobID;
    int deadline;
    int profit;
    public Job(int jobID,int deadline,int profit){
        this.JobID = jobID;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class JobSequencingProblem{
    public static void MaxProfit(int[] JobID,int[] deadline,int[] profit,int n){
        List<Job> maxProfitList = new ArrayList<>();
        int maxDeadline = 0;
        for(int i=0;i<n;i++){
            maxProfitList.add(new Job(JobID[i],deadline[i],profit[i]));
            maxDeadline = Math.max(maxDeadline,deadline[i]);
        }
        Collections.sort(maxProfitList,(a,b)->b.profit - a.profit);
        int []JobIdSeq = new int[maxDeadline + 1];
        for(int i=0;i<=maxDeadline;i++){
            JobIdSeq[i] = -1;
        }
        int totalProfit = 0;
        int JobCount = 0;
        for(int i=0;i<n;i++){
            for(int j=maxProfitList.get(i).deadline;j>0;j--){
                if(JobIdSeq[j] == -1){
                    JobIdSeq[j] = maxProfitList.get(i).JobID;
                    totalProfit = totalProfit + maxProfitList.get(i).profit;
                    JobCount++;
                    break;
                }
            }
        }
        System.out.println("EXECUTION SUMMARY");
        System.out.println(totalProfit+" is Total Profit");
        System.out.println(JobCount+" is the JobCount");
        System.out.println("Job ID is in sequence");
        for(int i=1;i<=maxDeadline;i++){
            if(JobIdSeq[i] != -1){
                System.out.println(JobIdSeq[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] jobId = new int[n];
        int [] deadline = new int[n];
        int [] profit = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("JobID"+i);
            jobId[i] = sc.nextInt();
            System.out.println("deadline"+i);
            deadline[i] = sc.nextInt();
            System.out.println("Profit"+i);
            profit[i] = sc.nextInt();
        }
        MaxProfit(jobId,deadline,profit,n);
    }
}