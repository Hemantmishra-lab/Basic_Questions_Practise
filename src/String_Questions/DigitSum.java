package String_Questions;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            char chr = str.charAt(i);
            if(Character.isDigit(chr)){
                int digit = chr - '0';
                sum = sum + digit;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
