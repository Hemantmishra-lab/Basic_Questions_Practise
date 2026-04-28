package GreedyApproach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class jobseq{
    int jobId;
    int deadline;
    int profit;
    int pos;
    public jobseq(int jobId,int deadline,int profit,int pos){
        this.jobId = jobId;
        this.deadline = deadline;
        this.profit  = profit;
        this.pos = pos;
    }
}
public class JobSequencingProblem {
    public static void MaxProfit(int[]jobId,int[]deadline,int[]profit,int n){
        ArrayList<jobseq> JobSeq = new ArrayList<>();
        for(int i=0;i<n;i++){
            JobSeq.add(new jobseq(jobId[i],deadline[i],profit[i],i+1 ));
        }
        Collections.sort(JobSeq,(a,b)-> b.profit- a.profit);
        int maxProfit = JobSeq.get(0).profit;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []jobId = new int[n];
        int[] deadline = new int[n];
        int [] profit = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("jobID"+i);
            jobId[i] = sc.nextInt();
            System.out.println("Deadline"+i);
            deadline[i] = sc.nextInt();
            System.out.println("Profit Generates"+i);
            profit[i] = sc.nextInt();

        }
    }
}
