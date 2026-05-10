package Recursion;

public class Factorial {
    public static int calcFactorial(int num){
        if(num == 0)
            return 1;
        return num * calcFactorial(num-1);
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println(calcFactorial(num));
    }
}
