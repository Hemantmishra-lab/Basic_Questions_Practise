package String_Questions;

import java.util.Scanner;

public class SecondLargestDigit {
    public static int secLarge(String input){
        int Max = 0;
        int SecMax = 0;
        int n = input.length();
        for(int i=0;i<n;i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                int num = ch - '0';
                if(num>Max){
                    SecMax = Max;
                    Max = num;
                } else if (num<Max && num>SecMax) {
                    SecMax = num;
                }
            }
        }
        return SecMax;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(secLarge(input));
        sc.close();
    }
}
