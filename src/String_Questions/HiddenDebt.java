package String_Questions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HiddenDebt {
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
        Pattern pt = Pattern.compile("-?\\d+");
        Matcher mt = pt.matcher(input);
        while(mt.find()){
            String Strnum = mt.group();
            int num = Integer.parseInt(Strnum);
            sum = sum + num;
        }
        System.out.println(sum);
        sc.close();
    }
}
