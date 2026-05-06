package Numers_Questions;

import java.util.Scanner;

//public class Factorial {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num=sc.nextInt();
//        System.out.println(num);
//        long fact = 1;
//        for(int i = 1;i<=num;i++){
//            fact = fact * i;
//        }
//        System.out.println(fact);
//        sc.close();
//    }
//}

//public class Factorial{
//    public static long factorial(int num){
//        long fact = 1;
//        for(int i=1;i<=num;i++){
//            fact = fact * i;
//        }
//        return fact;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(factorial(num));
//    }
//}

public class Factorial{
    public static int factorial(int N){
        int fact = 1;
        for(int i=2;i<=N;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        int N = 5;
        System.out.println(factorial(N));
    }
}