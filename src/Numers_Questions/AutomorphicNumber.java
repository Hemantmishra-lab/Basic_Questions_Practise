package Numers_Questions;

public class AutomorphicNumber {

    public static boolean isAutomorphic(int num) {
        if (num < 0) return false; // Negative numbers generally aren't considered automorphic

        long square = (long) num * num; // Use long to prevent integer overflow for large numbers
        int temp = num;
        long divisor = 1;

        // Count digits and build the divisor (10^d)
        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }

        // Extract the last digits of the square and compare
        return (square % divisor) == num;
    }

    public static void main(String[] args) {
        int[] testCases = {5, 25, 76, 9, 625};

        for (int num : testCases) {
            System.out.println(num + " is Automorphic? " + isAutomorphic(num));
        }
    }
}
