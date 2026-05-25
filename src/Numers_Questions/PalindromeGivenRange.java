package Numers_Questions;

import java.util.ArrayList;
import java.util.List;

//public class PalindromeGivenRange {
//    public static boolean isPalindrome(int num){
//        int sum = 0; int org = num;
//        while(num>0){
//            int digit = num % 10;
//            sum = sum * 10 + digit;
//            num = num / 10;
//        }
//        if(org == sum)
//            return true;
//        return false;
//    }
//    public static List<Integer> Palindrome_Given_Range(int start,int end){
//        List<Integer> list = new ArrayList<>();
//        for(int i=start;i<=end;i++){
//            if(isPalindrome(i))
//                list.add(i);
//        }
//        return list;
//    }
//    public static void main(String[] args){
//        int start = 100;
//        int end = 150;
//        System.out.print(Palindrome_Given_Range(start,end));
//    }
//}

public class PalindromeGivenRange{
    public static boolean isPalindrome(int num){
        int sum = 0,digit,org = num;
        while(num>0){
            digit = num % 10;
            sum = sum*10 + digit;
            num = num / 10;
        }
        if(org == sum)
            return true;
        return false;
    }
    public static List<Integer> Palindrome_Given_Range(int start,int end){
        List<Integer> list = new ArrayList<>();
        for(int i=start;i<=end;i++){
            if(isPalindrome(i))
                list.add(i);
        }
        return list;
    }
    public static void main(String[] args){
        int start = 100;
        int end = 150;
        System.out.println(Palindrome_Given_Range(start,end));
    }
}