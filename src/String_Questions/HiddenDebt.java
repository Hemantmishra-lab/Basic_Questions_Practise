package String_Questions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class HiddenDebt {
//    public static void main(String[] args){
//        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        System.out.println(input);
//        Pattern pt = Pattern.compile("-?\\d+");
//        Matcher mt = pt.matcher(input);
//        while(mt.find()){
//            String Strnum = mt.group();
//            int num = Integer.parseInt(Strnum);
//            sum = sum + num;
//        }
//        System.out.println(sum);
//        sc.close();
//    }
//}

//public class HiddenDebt{
//    public static int HiddenDebt(String input){
//        Pattern pt = Pattern.compile("-?\\d+");
//        int sum = 0;
//        Matcher mt = pt.matcher(input);
//        while(mt.find()){
//            String Strnum =mt.group();
//            int num = Integer.parseInt(Strnum);
//            sum += num;
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//        String input = "Credited : 1000 Debited : -200";
//        System.out.println(HiddenDebt(input));
//    }
//}
//
//public class HiddenDebt{
//    public static int calcHiddenDebt(String str){
//        int sum = 0;
//        Pattern pt = Pattern.compile("-?\\d+");
//        Matcher mt = pt.matcher(str);
//        while(mt.find()){
//            String st = mt.group();
//            sum += Integer.parseInt(st);
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//        String str = "credited : 1000 Debited : -200";
//        System.out.println(calcHiddenDebt(str));
//    }
//}
//
//public class HiddenDebt{
//    public static int calcHidddenDebt(String str){
//        Pattern pt = Pattern.compile("-?\\d++");
//        Matcher mt = pt.matcher(str);
//        int sum = 0;
//        while(mt.find()){
//            String st = mt.group();
//            sum += Integer.parseInt(st);
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//        String str = "credited : 1000 Debited : -200";
//        System.out.print(calcHidddenDebt(str));
//    }
//}

//public class HiddenDebt{
//    public static int calcHiddenDebt(String str){
//        Pattern pt = Pattern.compile("-?\\d++");
//        Matcher mt = pt.matcher(str);
//        int sum = 0;
//        while(mt.find()){
//            String st = mt.group();
//            sum += Integer.parseInt(st);
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//        String str = "Credited : 1000 Debited : -200";
//        System.out.print(calcHiddenDebt(str));
//    }
//}

public class HiddenDebt {
    public static int calcHiddenDebt(String str){
        Pattern pt = Pattern.compile("-?\\d++");
        Matcher mt = pt.matcher(str);
        int sum = 0;
        while(mt.find()){
            String str1 = mt.group();
            sum = sum + Integer.parseInt(str1);
        }
        return sum;
    }
    public static void main(String[] args){
        String str = "Credited : 1000 Debited : -200";
        System.out.println(calcHiddenDebt(str));
    }
}