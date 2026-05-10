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
//
//public class Palindrome {
//    public static boolean palindrome(int input){
//        int org = input;
//        int digit ,sum = 0;
//        while(input>0){
//            digit = input % 10;
//            sum  = sum*10 + digit;
//            input = input/10;
//        }
//        if(org == sum)
//            return true;
//        return false;
//    }
//    static void main() {
//        int input = 12321;
//        System.out.println(palindrome(input));
//    }
//}
//
//public class Palindrome{
//    public static boolean calcPalindrome(int x){
//        int sum = 0,org = x;
//        while(x>0){
//            int digit = x % 10;
//            sum = (sum*10) + digit;
//            x = x / 10;
//        }
//        if(org == sum)
//            return true;
//        return false;
//    }
//    public static void main(String[] args){
//        int x = 12781;
//        System.out.println(calcPalindrome(x));
//    }
//}
//
//public class Palindrome{
//    public static boolean calcPalindrome(String str){
//        String org = str;
//        String rev = "";
//        for(int i=0;i<str.length();i++){
//            rev += str.charAt(str.length()-i-1);
//        }
//        if(org.equals(rev))
//            return true;
//
//        return false;
//    }
//    public static void main(String[] args){
//        String str = "BOB";
//        System.out.println(calcPalindrome(str));
//    }
//}

//public class Palindrome{
//    public static boolean calcPalindrome(String str){
//        String rev = "";String org = str;
//        for(int i=0;i<str.length();i++){
//            rev += str.charAt(str.length()-i-1);
//        }
//        if(rev.equals(org))
//            return true;
//        return false;
//    }
//    public static void main(String[] args){
//        String str = "BOB";
//        System.out.println(calcPalindrome(str));
//    }
//}