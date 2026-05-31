package GreedyApproach;

/*
 * PROBLEM:
 * Find the minimum number of coins needed to make a total amount 'N'.
 * Example: moneycoll = {2, 5, 10, 1}, Target N = 18.
 *
 * STRATEGY:
 * 1. Sort coins in Descending Order (Greedy choice: pick largest first).
 * 2. Use a 'for' loop to check each coin type.
 * 3. Use a 'while' loop to pick the same coin multiple times if it fits in N.
 *
 * ANALYSIS:
 * - Time Complexity: O(M log M) [Due to sorting M coin types].
 * - Space Complexity: O(M) [To store the coin list and result].
 *
 * OUTPUTS:
 * 1. Coin Sequence: The list of actual coins picked (e.g., [10, 5, 2, 1]).
 * 2. Total Count: The minimum number of coins used (e.g., 4).
 *
 * VARIABLE DEFINITIONS:
 * - coins (List): The sorted collection of available denominations.
 * - target/N (int): The remaining amount we still need to collect.
 * - currentCoin (int): The specific coin we are trying to use right now.
 * - resultSeq (List): A bucket to store every coin we successfully pick.
 * - count (int): A simple counter for every time a coin is added.

 *
 * DRY RUN (N = 18):
 * 1. Sorted Coins: [10, 5, 2, 1]
 * 2. Try 10: 10 <= 18? Yes -> N becomes 8 | Seq: [10] | Count: 1
 * 3. Try 10: 10 <= 8?  No  -> Move to next coin.
 * 4. Try 5:  5 <= 8?  Yes -> N becomes 3 | Seq: [10, 5] | Count: 2
 * 5. Try 5:  5 <= 3?  No  -> Move to next coin.
 * 6. Try 2:  2 <= 3?  Yes -> N becomes 1 | Seq: [10, 5, 2] | Count: 3
 * 7. Try 2:  2 <= 1?  No  -> Move to next coin.
 * 8. Try 1:  1 <= 1?  Yes -> N becomes 0 | Seq: [10, 5, 2, 1] | Count: 4
 *
 * Result: 4 coins used.
 */

import java.util.Arrays;

//import java.util.Arrays;
//
//public class MinNumberOfCoins{
//    public static int MinCoinUsed(int[]moneycoll,int N){
//        Arrays.sort(moneycoll);
//        int currentCoin ;
//        int count = 0;
//        for(int i = moneycoll.length-1;i>=0;i--){
//            currentCoin = moneycoll[i];
//            while(currentCoin <= N){
//                count++;
//                N -= currentCoin;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        int []moneycoll = {10,2,5,1};
//        int N = 15;
//        System.out.println(MinCoinUsed(moneycoll,N));
//    }
////}
//public class MinNumberOfCoins{
//    public static int calcMinNoCoins(int[]moneyColl,int N){
//        Arrays.sort(moneyColl);
//        int count = 0;
//        for(int i=moneyColl.length-1;i>=0;i--){
//            int currentCoin = moneyColl[i];
//            while(N>=currentCoin){
//                N -= currentCoin;
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        int []moneyColl = {2,5,10,1};
//        int N = 19;
//        System.out.println(calcMinNoCoins(moneyColl,N));
//    }
//}

public class MinNumberOfCoins {
    public static int calcMinNumberOfCoins(int []moneyColl,int N){
        Arrays.sort(moneyColl);
        int count = 0;
        for(int i=moneyColl.length-1;i>=0;i--){
            int current = moneyColl[i];
            if(current <=N){
                N -= current;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int []moneyColl = {2,5,10,1};
        int N = 19;
        System.out.println(calcMinNumberOfCoins(moneyColl,N));
    }
}