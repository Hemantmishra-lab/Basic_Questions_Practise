package Numers_Questions;

public class Armstrong {
    public static void main(String[] args){
        int num = 153;
        int temp = num;
        int len = String.valueOf(temp).length();
        int sum = 0;
        while(temp>0){
            int digit = temp % 10;
            sum = (int) (sum + Math.pow(digit,len));
            temp = temp / 10;
        }
        if(num == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
