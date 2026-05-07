package String_Questions;

import java.util.Scanner;

//public class ReverseString {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        System.out.println(input);
//        String reversed = "";
//        for(int i = input.length()-1;i>=0;i--){
//            reversed = reversed + input.charAt(i);
//        }
//        System.out.println(reversed);
//        sc.close();
//    }
//}

//public class ReverseString{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String reversed = "";
//        for(int i=input.length()-1;i>=0;i--){
//            reversed = reversed + input.charAt(i);
//        }
//        System.out.println(reversed);
//        sc.close();
//    }
//}

public class ReverseString{
    public static String reverseString(String input){
        String rev = "";
        for(int i=input.length()-1;i>=0;i--){
            rev += input.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args){
        String input = "INPUT";
        System.out.println(reverseString(input));
    }
}