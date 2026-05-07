package String_Questions;

import java.util.Scanner;

//public class DigitSum {
//    public static void main(String[] args){
//        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(str);
//        for(int i=0;i<str.length();i++){
//            char chr = str.charAt(i);
//            if(Character.isDigit(chr)){
//                int digit = chr - '0';
//                sum = sum + digit;
//            }
//        }
//        System.out.println(sum);
//        sc.close();
//    }
//}

//public class DigitSum{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        System.out.println(input);
//        int sum =0;
//        for(int i=0;i<input.length();i++){
//            char ch = input.charAt(i);
//            if(Character.isDigit(ch)){
//                int temp = ch - '0';
//                sum = sum + temp;
//            }
//
//        }
//        System.out.println(sum);
//    }
//}

public class DigitSum{
        public static int digitSum(String input){
            int sum = 0;
            for(int i=0;i<input.length();i++){
                char ch = input.charAt(i);
                if(Character.isDigit(ch))
                    sum += ch - '0';

            }
            return sum;
        }
    public static void main(String[] args){
        String input = "a1b2c3";
        System.out.println(digitSum(input));
    }
}
