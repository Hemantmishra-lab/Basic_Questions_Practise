package Array_Questions;

import java.util.Scanner;

public class ArrayReverse {
    public static int[] reverseArray(int[]  arr){
        int n = arr.length;
        int [] rev  = new int[n];
        for(int i=n;i>=1;i--){
            rev[i] = arr[n-i-1];
        }
        return rev;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = reverseArray(arr);

        System.out.println("Reversed Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
