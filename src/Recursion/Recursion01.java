package Recursion;

import com.sun.security.jgss.GSSUtil;

//public class Recursion01 {
//    public static void fn(int n){
//        if(n==0) {
//            System.out.println("Happy Birthday");
//            return;
//        }
//        System.out.println(n+" Days left");
//        fn(n-1);
//    }
//    public static void main(String[] args){
//        fn(8);
//    }
//}

//public class Recursion01{
//    public static void recursion01(int n){
//        if(n==0){
//            System.out.println("Happy Birthday");
//            return;
//        }
//        System.out.println(n+"Days left");
//        recursion01(n-1);
//    }
//    public static void main(String[]args){
//        recursion01(10);
//    }
//}

public class Recursion01{
    public static void revCount(int N){
        if(N == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(N);
        revCount(N-1);
    }
    public static void main(String[] args){
        int N = 10;
        revCount(N);
    }
}