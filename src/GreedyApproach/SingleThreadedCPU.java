package GreedyApproach;
//
//import java.util.*;
//
//class Tasks{
//    int processId;
//    int enqueue;
//    int PTime;
//    public Tasks(int processId,int enqueue,int PTime){
//        this.processId = processId;
//        this.enqueue = enqueue;
//        this.PTime = PTime;
//    }
//}
//public class SingleThreadedCPU {
//    public static int[] MinProcess(int [] processId,int []enqueue,int [] PTime,int n){
//        List<Tasks> tasks = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            tasks.add(new Tasks(processId[i],enqueue[i],PTime[i] ));
//        }
//        Collections.sort(tasks,(a,b)->a.enqueue - b.enqueue);
//        PriorityQueue<Tasks> minheap = new PriorityQueue<>((a,b)->{
//            if(a.PTime != b.PTime)
//                return a.PTime - b.PTime;
//            return a.processId - b.processId;
//        });
//        int taskIndex = 0;
//        int[] result = new int[n];
//        long currentTime = 0;
//        int resultIndex = 0;
//        while(taskIndex < n || !minheap.isEmpty()){
//            if(minheap.isEmpty() && taskIndex < n && currentTime < tasks.get(taskIndex).enqueue){
//                currentTime = tasks.get(taskIndex).enqueue;
//            }
//            while(taskIndex<n && tasks.get(taskIndex).enqueue<=currentTime){
//                minheap.add(tasks.get(taskIndex));
//                taskIndex++;
//            }
//
//
//
//
//            Tasks currentTask = minheap.poll();
//            result[resultIndex++]=currentTask.processId;
//            currentTime = currentTime + currentTask.PTime;
//        }
//        return result;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] processId = new int[n];
//        int []enqueue = new int[n];
//        int [] PTime = new int[n];
//        for(int i=0;i<n;i++){
//            System.out.println("Process ID"+i);
//            processId[i] = sc.nextInt();
//            System.out.println("Enqueue"+i);
//            enqueue[i] = sc.nextInt();
//            System.out.println("PTime"+i);
//            PTime[i] = sc.nextInt();
//        }
//        int[] result=MinProcess(processId,enqueue,PTime,n);
//        for(int i=0;i<n;i++){
//            System.out.print(result[i] +" ");
//        }
//    }
//}

import java.util.*;

//class Task{
//    int enqueue;
//    int PTime;
//    int ProcessId;
//    public Task(int enqueue,int PTime,int ProcessId){
//        this.enqueue = enqueue;
//        this.PTime = PTime;
//        this.ProcessId = ProcessId;
//    }
//}
//public class SingleThreadedCPU{
//    public static int[] getOrder(int[] enqueue,int[] PTime,int[] ProcessId){
//        List<Task> tasks = new ArrayList<>();
//        int n = enqueue.length;
//        for(int i=0;i<n;i++){
//            tasks.add(new Task(enqueue[i],PTime[i],ProcessId[i]));
//        }
//        Collections.sort(tasks,(a,b)->a.enqueue - b.enqueue);
//        PriorityQueue<Task> minHeap = new PriorityQueue<>((a,b)->{
//            if(a.PTime != b.PTime)
//                return a.PTime - b.PTime;
//            return  a.ProcessId - b.ProcessId;
//        });
//        int taskIndex = 0;
//        int result[] = new int[n];
//        int resultIndex = 0;
//        int CurrentTime = 0;
//        while(taskIndex < n || !minHeap.isEmpty()){
//            if(minHeap.isEmpty() && CurrentTime < tasks.get(taskIndex).enqueue){
//                CurrentTime=tasks.get(taskIndex).enqueue;
//            }
//            while (taskIndex < n && tasks.get(taskIndex).enqueue <= CurrentTime) {
//                minHeap.add(tasks.get(taskIndex));
//                taskIndex++;
//            }
//            Task currentTask = minHeap.poll();
//            result[resultIndex++] = currentTask.ProcessId;
//            CurrentTime = CurrentTime + currentTask.PTime;
//        }
//        return result;
//    }
//    public static void  main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int [] enqueue  = new int[n];
//        int [] PTime = new int[n];
//        int [] ProcessId = new int[n];
//        for(int i=0;i<n;i++){
//            System.out.println("Enqueue"+i);
//            enqueue[i] = sc.nextInt();
//            System.out.println("PTime"+i);
//            PTime[i] = sc.nextInt();
//            System.out.println("ProcessId"+i);
//            ProcessId[i] = sc.nextInt();
//        }
//        int []result = getOrder(enqueue,PTime,ProcessId);
//        for(int i=1;i<n;i++){
//            System.out.print(result[i]+" ");
//        }
//    }
//}

//class Task{
//    int enqueue;
//    int PTime;
//    int PId;
//    public Task(int enqueue,int PTime,int PId){
//        this.enqueue = enqueue;
//        this.PTime = PTime;
//        this.PId = PId;
//    }
//}
//public class SingleThreadedCPU{
//    public static int[] getOrder(int[]enqueue,int[]PTime,int[]PId){
//        int n = enqueue.length;
//        List<Task> tasks = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            tasks.add(new Task(enqueue[i],PTime[i],PId[i]));
//        }
//        Collections.sort(tasks,(a,b)->a.enqueue - b.enqueue);
//        PriorityQueue<Task> minheap = new PriorityQueue<>((a,b)->{
//            if(a.PTime != b.PTime)
//                return a.PTime - b.PTime;
//            return a.PId - b.PId;
//        });
//        int currentTime = 0;
//        int TaskIndex = 0;
//        int result[] = new int[n];
//        int resultindex = 0;
//        while(TaskIndex < n || !minheap.isEmpty()){
//            if(minheap.isEmpty() && currentTime < tasks.get(TaskIndex).enqueue){
//                currentTime = tasks.get(TaskIndex).enqueue;
//            }
//
//            while (currentTime >= tasks.get(TaskIndex).enqueue && TaskIndex<n) {
//                minheap.add(tasks.get(TaskIndex));
//                TaskIndex++;
//            }
//
//            Task currentTask = minheap.poll();
//            result[resultindex++] = currentTask.PId;
//            currentTime = currentTime + currentTask.enqueue;
//        }
//        return result;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []enqueue = new int[n];
//        int[]PTime = new int[n];
//        int[]PId = new int[n];
//        for(int i=0;i<n;i++){
//            System.out.println("Enqueue : "+i);
//            enqueue[i] = sc.nextInt();
//            System.out.println("Ptime  : "+i);
//            PTime [i] = sc.nextInt();
//            System.out.println("ProcessId : "+i);
//            PId[i] = sc.nextInt();
//        }
//        int[] result=getOrder(enqueue,PTime,PId);
//        for(int i=0;i<n;i++){
//            System.out.println(result[i]);
//        }
//    }
//}

class Task{
    int enqueue;
    int PTime;
    int ProcessId;
    public Task(int enqueue,int PTime,int ProcessId){
        this.enqueue = enqueue;
        this.PTime = PTime;
        this.ProcessId = ProcessId;
    }
}
public class SingleThreadedCPU{
    public static int[] GetOrder(int []enqueue,int[] PTime,int[] ProcessId){
        List<Task> taskslist = new ArrayList<>();
        int n = enqueue.length;
        for(int i=0;i<n;i++){
            taskslist.add(new Task(enqueue[i],PTime[i],ProcessId[i]));
        }
        Collections.sort(taskslist,(a,b)-> a.enqueue-b.enqueue);
        int taskIndex = 0;
        PriorityQueue<Task> minheap = new PriorityQueue<>((a,b)->{
            if(a.PTime != b.PTime)
                return a.PTime - b.PTime;
            return  a.ProcessId - b.ProcessId;
        });
        int currentTime=0;
        int result[] = new int[n];
        int resultIndex = 0;
        while(!minheap.isEmpty() || taskIndex < n){
            if(minheap.isEmpty() && currentTime < taskslist.get(taskIndex).enqueue){
                currentTime = taskslist.get(taskIndex).enqueue;
            }
            while(currentTime >= taskslist.get(taskIndex).enqueue && taskIndex < n) {
                minheap.add(taskslist.get(taskIndex));
                taskIndex++;
            }

            Task currentTask = minheap.poll();
            result[resultIndex++] = currentTask.ProcessId;
            currentTime = currentTime + currentTask.enqueue;

        }
        return  result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int []enqueue = new int[n];
        int []PTime = new int[n];
        int []ProcessId = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enqueue: "+i);
            enqueue[i] = sc.nextInt();
            System.out.println("PTime: "+i);
            PTime[i] = sc.nextInt();
            System.out.println("ProcessId: "+i);
            ProcessId[i] = sc.nextInt();
        }
        int[] result = GetOrder(enqueue,PTime,ProcessId);
        for(int i=0;i<n;i++){
            System.out.println(result[i]);
        }
    }
}