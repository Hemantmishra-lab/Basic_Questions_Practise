package GreedyApproach;

import java.util.*;

class Tasks{
    int processId;
    int enqueue;
    int PTime;
    public Tasks(int processId,int enqueue,int PTime){
        this.processId = processId;
        this.enqueue = enqueue;
        this.PTime = PTime;
    }
}
public class SingleThreadedCPU {
    public static int[] MinProcess(int [] processId,int []enqueue,int [] PTime,int n){
        List<Tasks> tasks = new ArrayList<>();
        for(int i=0;i<n;i++){
            tasks.add(new Tasks(processId[i],enqueue[i],PTime[i] ));
        }
        Collections.sort(tasks,(a,b)->a.enqueue - b.enqueue);
        PriorityQueue<Tasks> minheap = new PriorityQueue<>((a,b)->{
            if(a.PTime != b.PTime)
                return a.PTime - b.PTime;
            return a.processId - b.processId;
        });
        int taskIndex = 0;
        int[] result = new int[n];
        long currentTime = 0;
        int resultIndex = 0;
        while(taskIndex < n || !minheap.isEmpty()){
            if(minheap.isEmpty() && taskIndex < n && currentTime < tasks.get(taskIndex).enqueue){
                currentTime = tasks.get(taskIndex).enqueue;
            }
            while(taskIndex<n && tasks.get(taskIndex).enqueue<=currentTime){
                minheap.add(tasks.get(taskIndex));
                taskIndex++;
            }




            Tasks currentTask = minheap.poll();
            result[resultIndex++]=currentTask.processId;
            currentTime = currentTime + currentTask.PTime;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] processId = new int[n];
        int []enqueue = new int[n];
        int [] PTime = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Process ID"+i);
            processId[i] = sc.nextInt();
            System.out.println("Enqueue"+i);
            enqueue[i] = sc.nextInt();
            System.out.println("PTime"+i);
            PTime[i] = sc.nextInt();
        }
        int[] result=MinProcess(processId,enqueue,PTime,n);
        for(int i=0;i<n;i++){
            System.out.print(result[i] +" ");
        }
    }
}
