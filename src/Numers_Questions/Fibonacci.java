package Numers_Questions;

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i=2;i<=num;i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
        sc.close();

    }
}



