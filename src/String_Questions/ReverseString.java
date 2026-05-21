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

//public class ReverseString{
//    public static String reverseString(String input){
//        String rev = "";
//        for(int i=input.length()-1;i>=0;i--){
//            rev += input.charAt(i);
//        }
//        return rev;
//    }
//    public static void main(String[] args){
//        String input = "INPUT";
//        System.out.println(reverseString(input));
//    }
//}

//public class ReverseString{
//    public static void calcReverseString(String str){
//        String rev = "";
//         for(int i=0;i<str.length();i++){
//             rev += str.charAt(str.length()-i-1);
//         }
//        System.out.println(rev);
//    }
//    public static void main(String[] args){
//        String str = "HEMANT MISHRA";
//        calcReverseString(str);
//    }
//}

//public class ReverseString{
//    public static String calcReverseString(String str){
//        String rev = "";
//        for(int i=0;i<str.length();i++){
//            rev = rev + str.charAt(str.length()-i-1);
//        }
//        return rev;
//    }
//    public static void main(String[] args){
//        String str = "HEMANT MISHRA";
//        System.out.print(calcReverseString(str));
//    }
//}