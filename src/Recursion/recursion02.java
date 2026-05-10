package Recursion;
//
//public class recursion02 {
//
//        static void print(int n) {
//
//            if (n == 0)
//                return;
//
//            System.out.println(n); // Forward tracking
//
//            print(n - 1);
//        }
//
//        public static void main(String[] args) {
//            print(5);
//        }
//
//}
//
//public class recursion02{
//    static void print(int n){
//        if(n==0){
//            System.out.println(0);
//            return;
//        }
//        System.out.println(n);
//        print(n-1);
//    }
//    public static void main(String[] args){
//        print(10);
//    }
//}
//
//public class recursion02{
//    public static void print(int n){
//        if(n==0){
//            System.out.println(0);
//            return;
//        }
//        System.out.println(n);
//        print(n-1);
//    }
//    public static void main(String[] args){
//        int n = 5;
//        print(n);
//    }
//}

//public class recursion02{
//    public static void backtrackingPrint(int n){
//        if(n==0){
//            System.out.println(0);
//            return;
//        }
//        backtrackingPrint(n-1);
//        System.out.println(n);
//    }
//    public static void main(String[] args){
//        int n = 10;
//        backtrackingPrint(n);
//    }
//}
//10 -> 9 -> 8 ->7 ->6 ->5 ->4 ->3 ->2 ->1 ->0
//print (0 -> 1- > 2-> 3 ->4 ->5 ->6 ->7 ->8 ->9 ->10)

//public class recursion02{
//    static void print(int n){
//        if(n==0){
//            System.out.println(0);
//            return;
//        }
//        System.out.println("Forward Tracking : "+n);
//
//        print(n-1);
//
//        System.out.println("Backtracking : "+n);
//    }
//    public static void main(String[] args){
//        print(5);
//    }
//}

//public class recursion02{
//    public static void print(int n){
//        if(n==0){
//            System.out.println(0);
//            return;
//        }
//        System.out.println("FORWARD TRACKING : "+n);
//        print(n-1);
//        System.out.println("BACKTRACKING : "+n);
//    }
//    public static void main(String[] args){
//        print(5);
//    }
//}

//public class recursion02 {
//    public static void printNumbers(int current, int n) {
//// Base case: Stop when current exceeds n
//        if (current > n) {
//            return;
//        }
//// Print the current number
//        System.out.println(current);
//// Recursive call for the next number
//        printNumbers(current + 1, n);
//    }
//
//    public static void main(String[] args) {
//        int n = 5; // Example input
//        printNumbers(1, n);
//    }
//}

//public class recursion02{
//    public static void printNumber(int current,int N){
//        if(current>N){
//            return;
//        }
//        System.out.println("Forward Tracking : "+current);
//        printNumber(current+1,N);
//        System.out.println("backtracking : "+current);
//    }
//    public static void main(String[] args){
//        printNumber(1,5);
//    }
//}
//
//public class recursion02{
//    public static void merge(int []arr,int low,int high,int mid){
//        int[] temp = new int[high-low+1];
//        int index =  0,left = low,right = mid+1;
//        while(left <= mid && right <= high){
//            if(arr[left]<= arr[right]){
//                temp[index] = arr[left];
//                left++;index++;
//            }
//            else{
//                temp[index] = arr[right];
//                right++;index++;
//            }
//        }
//        while(left <= mid){
//            temp[index] = arr[left];
//            left++;index++;
//        }
//        while(right <= high){
//            temp[index] = arr[right];
//            right++;index++;
//        }
//        for(int i=low;i<=high;i++){
//            arr[i] = temp[i-low];
//        }
//    }
//    public static void sort(int []arr,int low,int high){
//        if(low==high)
//            return;
//        int mid = (low+high)/2;
//        sort(arr,low,mid);
//        sort(arr,mid+1,high);
//        merge(arr,low,high,mid);
//    }
//    public static void main(String[] args){
//        int arr[] = {6,3,5,2,2,8,1,3,2,9};
//        sort(arr,0,arr.length-1);
//        for(int X : arr){
//            System.out.print(X +" ");
//        }
//    }
//}

