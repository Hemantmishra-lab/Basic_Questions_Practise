package Array_Questions;
import GreedyApproach.MinRotationLetterUnlockCircularLock;

import javax.management.remote.rmi.RMIJRMPServerImpl;
import java.util.PriorityQueue;
import java.util.Scanner;
//Very Important : Wrraper class use Integer.Min_value
//public class SecondLargestElement {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int first = Integer.MIN_VALUE;
//        int second = Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>first){
//                second = first;
//                first = arr[i];
//            } else if (arr[i]>second && arr[i]<first) {
//                second = arr[i];
//
//            }
//        }
//        System.out.println(first);
//        System.out.println(second);
//
//    }
//}

//public class SecondLargestElement{
//    public static int secLarge(int [] arr){
//        int Max = Integer.MIN_VALUE;
//        int SecMax = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max){
//                SecMax = Max;
//                Max =arr[i];
//            }
//            else if(arr[i]>SecMax && arr[i]<Max){
//                SecMax = arr[i];
//            }
//        }
//        return SecMax;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(secLarge(arr));
//    }
//}

//public class SecondLargestElement{
//    public static int secLargestNo(int []arr){
//        int Max = Integer.MIN_VALUE;
//        int SecMax = Integer.MAX_VALUE;
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]>Max){
//                SecMax = Max;
//                Max = arr[i];
//            } else if (arr[i]<Max && arr[i]>SecMax) {
//                SecMax = arr[i];
//            }
//        }
//        return SecMax;
//    }
//    public static void main(String[] args){
//        int []arr = {10,8,4,3};
//        System.out.println(secLargestNo(arr));
//    }
//}
//
//public class SecondLargestElement{
//    public static int calcSecondLargestElement(int arr[]){
//        int Max = Integer.MIN_VALUE, SecMax = Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(Max < arr[i]){
//                SecMax = Max;
//                Max = arr[i];
//            } else if (Max > arr[i] && SecMax < arr[i] ) {
//                SecMax = arr[i];
//            }
//        }
//        return SecMax;
//    }
//    public static void main(String[] args){
//        int []arr = {10,2,4,8};
//        System.out.println(calcSecondLargestElement(arr));
//
//    }
//}
//
//public class SecondLargestElement{
//    public static int calcSecondLargestElement(int []arr){
//        int Max = Integer.MIN_VALUE;
//        int SecMax = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max){
//                SecMax = Max;
//                Max = arr[i];
//            } else if (arr[i]<Max && arr[i]>SecMax) {
//                SecMax = arr[i];
//
//            }
//        }
//        return SecMax;
//    }
//    public static void main(String[] args){
//        int arr[] = {10,22,77,1};
//        System.out.print(calcSecondLargestElement(arr));
//    }
//}

//public class SecondLargestElement {
//    public static int calcSecondLargestElement(int []arr){
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
//        for(int X: arr)
//            maxHeap.add(X);
//        maxHeap.poll();
//        return maxHeap.poll();
//    }
//    public static void main(String[] args){
//        int []arr = {10,22,77,1};
//        System.out.println(calcSecondLargestElement(arr));
//    }
//}

//public class SecondLargestElement {
//    public static int calcSecondLargestElement(int[]arr){
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
//        for(int X: arr)
//            maxHeap.add(X);
//        maxHeap.poll();
//        return maxHeap.poll();
//    }
//    public static void main(String[] args){
//        int []arr = {10,22,77,1};
//        System.out.println(calcSecondLargestElement(arr));
//    }
//}

//public class SecondLargestElement {
//    public static int calcSecondLargestElement(int []arr){
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->a-b);
//        for(int X: arr)
//            minHeap.add(X);
//        minHeap.poll();
//        return minHeap.poll();
//    }
//    public static void main(String[] args){
//        int []arr = {10,22,77,1};
//        System.out.println(calcSecondLargestElement(arr));
//    }
//}


//public class SecondLargestElement {
//    public static int calcSecondLargestElement(int []arr){
//        int Max = Integer.MIN_VALUE;
//        int SecMax = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Max){
//                SecMax = Max;
//                Max = arr[i];
//            }
//            else if(arr[i]<Max && arr[i]>SecMax){
//                SecMax = arr[i];
//            }
//        }
//        return SecMax;
//    }
//    public static void main(String []args){
//        int []arr ={10,22,77,1};
//        System.out.println(calcSecondLargestElement(arr));
//    }
//}

