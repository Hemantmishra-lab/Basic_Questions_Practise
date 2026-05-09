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

public class recursion02{
    public static void main(String[] args){

    }
}