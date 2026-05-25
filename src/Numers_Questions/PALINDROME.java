package Numers_Questions;

public class PALINDROME {
    public static boolean calcPalindrome(int num){
        int org = num;
        int sum = 0;
        while(num>0){
            int digit = num % 10;
            sum = sum * 10 + digit;
            num = num /10;
        }
        if(sum == org)
            return true;
        return false;
    }
    public static void main(String[] args){
        int num = 129521;
        System.out.println(calcPalindrome(num));
    }
}
