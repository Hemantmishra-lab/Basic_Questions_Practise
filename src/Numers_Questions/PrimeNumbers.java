package Numers_Questions;

import java.util.Scanner;

//public class PrimeNumbers {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num);
//        boolean isPrime = true;
//        if (num <= 1) {
//            isPrime = false;
//
//        } else {
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//
//            }
//            if (isPrime) System.out.println("Prime Number");
//            else System.out.println("Not a Prime Number");
//            sc.close();
//
//        }
//
//    }
//}
//

//public class PrimeNumbers{
//    public static boolean primeNumber(int N){
//        if(N <= 1){
//            return false;
//        }
//        else{
//            for(int i=2;i<=Math.sqrt(N);i++){
//                if(N%i == 0)
//                    return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args){
//        int N = 7;
//        System.out.println(primeNumber(N));
//    }
//}

//public class PrimeNumbers{
//    public static boolean calcPrimeNumber(int num){
//        if(num <=1)
//            return false;
//        else{
//            for(int i=2;i<Math.sqrt(num);i++){
//                if(num%i == 0)
//                    return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args){
//        int num = 5;
//        System.out.print(calcPrimeNumber(num));
//    }
//}