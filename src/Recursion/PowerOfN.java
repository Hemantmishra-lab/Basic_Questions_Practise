package Recursion;

public class PowerOfN {
    public static int calcPowerOfN(int base,int pow){
        if(pow == 0)
            return 1;
        return base * calcPowerOfN(base,pow-1);
    }
    public static void main(String[] args){
        int base = 5;
        int power = 2;
        System.out.println(calcPowerOfN(base,power));
    }
}
