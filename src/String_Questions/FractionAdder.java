package String_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class FractionAdder {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        System.out.println(input);
//        Pattern pt = Pattern.compile("-?\\d+");
//        Matcher mt = pt.matcher(input);
//        int i=0;
//        int arr[] = new int[4];
//        while(mt.find() && i<4){
//            arr[i++] = Integer.parseInt(mt.group());
//        }
//        int a = arr[0];
//        int m = arr[1];
//        int b = arr[2];
//        int n = arr[3];
//        int numerator = (a*n + b*m);
//        int denominator = (m*n);
//        String ans = String.valueOf(numerator) + "/" + String.valueOf(denominator);
//        System.out.println(ans);
//    }
//}


//    public class FractionAdder{
//        public static void fractionAdder(String input){
//        int arr[] = new int[input.length()];
//        Pattern pt = Pattern.compile("-?\\d+");
//        Matcher mt = pt.matcher(input);
//        int i =0;
//        while(mt.find()){
//            arr[i++] = Integer.parseInt(mt.group());
//        }
//        int a = arr[0];
//        int m = arr[1];
//        int b = arr[2];
//        int n = arr[3];
//        int numerator = (a*n) + (b*m);
//        int denominator = (m*n);
//        System.out.println(numerator +"/"+denominator);
//    }
//    public static void main(String[] args){
//        String input = "-1/2man+6/j9";
//        fractionAdder(input);
//    }
//}

//public class FractionAdder{
//    public static int calcFractionAdder(String str){
//        Pattern pt = Pattern.compile("-?\\d+");
//        Matcher mt = pt.matcher(str);
//        while(mt.find()){
//
//        }
//    }
//    public static void main(String[] args){
//        String str = "-1/2+6/9";
//    }
//}

//    public class FractionAdder{
//        public static void calcFractionAdder(String str){
//            Pattern pt = Pattern.compile("-?\\d+");
//            Matcher mt = pt.matcher(str);
//            List<Integer> list = new ArrayList<>();
//            while(mt.find()){
//                String st = mt.group();
//                int x = Integer.parseInt(st);
//                list.add(x);
//            }
//            int a = list.get(0);
//            int m = list.get(1);
//            int b = list.get(2);
//            int n = list.get(3);
//            int num = (a*n) + (b*m);
//            int den = (m*n);
//            System.out.println(num +"/"+den);
//        }
//        public static void main(String[] args){
//            String str = "hemant-1/2+helloJI3/4";
//            calcFractionAdder(str);
//        }
//    }

