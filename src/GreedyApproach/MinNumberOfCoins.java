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

public class MinNumberOfCoins{
    public static void main(String[] args){
        int []moneyColl = {10,2,5,1};

    }
}