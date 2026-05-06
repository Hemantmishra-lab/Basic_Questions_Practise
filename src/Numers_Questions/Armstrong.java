package Numers_Questions;

//public class Armstrong {
//    public static void main(String[] args){
//        int num = 153;
//        int temp = num;
//        int len = String.valueOf(temp).length();
//        int sum = 0;
//        while(temp>0){
//            int digit = temp % 10;
//            sum = (int) (sum + Math.pow(digit,len));
//            temp = temp / 10;
//        }
//        if(num == sum){
//            System.out.println("Armstrong Number");
//        }
//        else{
//            System.out.println("Not a Armstrong Number");
//        }
//    }
//}

import java.util.Scanner;

//public class Armstrong{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int temp = num;
//        int new2 = 0;
//        int len = String.valueOf(num).length();
//        while(num>0){
//            int digit = num %10;
//            new2 = (int) (new2 + Math.pow(digit,len));
//            num = num / 10;
//        }
//        if(temp==new2 )
//            System.out.println("Armstrong Number");
//        else
//            System.out.println("Not a Armstrong number");
//    }
//}

//public class Armstrong{
//    public static boolean ArmStrongChecker(int num){
//        int temp = num;
//        int newNum = 0;
//        int len = String.valueOf(num).length();
//        while(num>0){
//            int digit = num %10;
//            newNum = (int) (newNum + Math.pow(digit,len));
//            num = num / 10;
//        }
//        if(temp == newNum)
//            return true;
//        else
//            return false;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if(ArmStrongChecker(num))
//            System.out.println("Armstrong Number");
//        else
//            System.out.println("Not a Armstrong  Number");
//    }
//}

public class Armstrong{
    public static boolean armstrong(int num){
        int len = (String.valueOf(num)).length();
        int temp = num;
        int digit,sum = 0;
        while(num>0){
            digit = num % 10;
            sum += (int) Math.pow(digit,len);
            num = num/10;
        }
        if(temp == sum) return true;
        return false;
    }
    public static void main(String[] args){
        int num = 153;
        System.out.println(armstrong(num));
    }
}