package Array_Questions;

//public class BubbleSort {
//    public static void main(String[] args){
//        int [] arr = {64,85,0,62,45};
//        int n = arr.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class BubbleSort{
//    public static  int [] bubbleSort(int [] arr){
//        int n = arr.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        return arr;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr =new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int []narr = bubbleSort(arr);
//        for(int i=0;i<narr.length;i++){
//            System.out.println(arr[i]);
//        }
//
//    }
//}

import java.util.Scanner;

//public class BubbleSort{
//    public static int[] bubbleSort(int[] arr){
//        int n = arr.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j+1]<arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        return arr;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(bubbleSort(arr)[i]);
//        }
//    }
//}


//public class BubbleSort{
//    public static int bubbleSort(int []arr,int low,int high,int N){
//        if (low > high) {
//            return -1;
//        }
//        int mid = (low+high)/2;
//        if(arr[mid] == N){
//            return mid;
//        }
//        if(arr[mid]>N){
//            return bubbleSort(arr,low,mid-1,N);
//        }
//        return bubbleSort(arr,mid+1,high,N);
//    }
//    public static void main(String[] args){
//        int []arr = {10,20,30,40,50,60};
//        int N = 40;
//        int low = 0;
//        int high = arr.length-1;
//        System.out.println(bubbleSort(arr,low,high,N));
//    }
//}

//public class BubbleSort{
//    public static int[] calcBubbleSort(int []arr){
//        int n = arr.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        return arr;
//    }
//    public static void main(String[] args){
//        int []arr = {10,50,2,44};
//        calcBubbleSort(arr);
//        for(int X : arr)
//            System.out.print(X +" ");
//    }
//}

//public class BubbleSort {
//    public static void calcBubbleSort(int []arr){
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j< arr.length-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//    }
//    public static void main(String[] args){
//        int []arr = {1,9,7,3,6,7};
//        calcBubbleSort(arr);
//        for(int X:arr)
//            System.out.print(X +" ");
//    }
//}

public class BubbleSort {
    public static int[] calcBubbleSort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int []arr = {1,52,5,8,0};
        calcBubbleSort(arr);
        for(int X:arr)
            System.out.print(X+" ");
    }
}