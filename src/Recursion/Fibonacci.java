package Recursion;

//public class Fibonacci {
//    public static int calcFibonacci(int num){
//        if(num ==0){
//            return 0;
//        }
//        if(num == 1)
//            return 1;
//        return calcFibonacci(num-1)+calcFibonacci(num-2);
//    }
//    public static void main(String[] args){
//        int num = 5;
//        System.out.println(calcFibonacci(num));
//    }
//}

//public class Fibonacci{
//    public static int calcFibonacci(int num){
//        if(num == 0)
//            return 0;
//        if(num == 1)
//            return 1;
//        return calcFibonacci(num-1) + calcFibonacci(num-2);
//    }
//    public static void main(String[] args){
//        int num = 5;
//        System.out.println(calcFibonacci(num));
//    }
//}

//public class Fibonacci{
//    public static int calcFibonacci(int num){
//        if(num<=1)
//            return num;
//        return calcFibonacci(num-1) + calcFibonacci(num-2);
//    }
//    public static void main(String[] args){
//        int num = 10;
//        System.out.print(calcFibonacci(num));
//    }
//}

public class Fibonacci{
    public static int calcFibonacci(int num){
        if(num <= 1){
            return num;
        }
        return calcFibonacci(num-1) + calcFibonacci(num-2);
    }
    public static void main(String[] args){
        int num = 15;
        System.out.print(calcFibonacci(num));
    }
}