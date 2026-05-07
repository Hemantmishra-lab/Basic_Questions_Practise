package String_Questions;

import java.util.Scanner;

//public class Palindrome{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num =sc.nextInt();
//        int temp = num;
//        int reverse = 0;
//        while(num>0){
//            int digit = num%10;
//            reverse = reverse*10 + digit;
//            num = num / 10;
//        }
//        if(temp == reverse){
//            System.out.println("Palindrome Number");
//        }
//        else{
//            System.out.println("Not a Palindrome Number");
//        }
//        sc.close();
//    }
//}

public class Palindrome {
    public static boolean palindrome(int input){
        int org = input;
        int digit ,sum = 0;
        while(input>0){
            digit = input % 10;
            sum  = sum*10 + digit;
            input = input/10;
        }
        if(org == sum)
            return true;
        return false;
    }
    static void main() {
        int input = 12321;
        System.out.println(palindrome(input));
    }
}