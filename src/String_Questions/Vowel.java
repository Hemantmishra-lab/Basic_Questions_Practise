package String_Questions;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'e' ||ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
