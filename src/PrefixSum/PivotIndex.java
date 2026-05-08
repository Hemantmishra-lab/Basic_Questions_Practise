package PrefixSum;


/*
 * PROBLEM:
 * Find the "Pivot Index" where the sum of elements to the left equals the sum
 * of elements to the right. If no such index exists, return -1.
 *
 * STRATEGY:
 * 1. Total Sum: First, calculate the sum of the entire array.
 * 2. Prefix Logic: Maintain a 'leftSum' as you iterate.
 * 3. Comparison: For any index 'i', the right sum is (totalSum - leftSum - arr[i]).
 * 4. Greedy Check: If leftSum equals right sum, 'i' is the pivot.
 *
 * ANALYSIS:
 * - Time Complexity: O(N) [Two linear passes: one for total, one for pivot].
 * - Space Complexity: O(1) [Only using a few integer variables].
 *
 * OUTPUTS:
 * - return (int): The leftmost pivot index found, or -1 if none exist.
 *
 * VARIABLE DEFINITIONS:
 * - total (int): The sum of all elements in the array.
 * - leftSum (int): The running total of elements to the left of index 'i'.
 * - arr[i] (int): The current element (the "pivot candidate").
 *
 * DRY RUN:
 * Input: arr = {1, 7, 3, 6, 5, 6}
 * 1. Total Sum = 28.
 *
 * 2. i = 0: leftSum = 0 | Right = 28 - 0 - 1 = 27 | (0 == 27?) No.
 * 3. i = 1: leftSum = 1 | Right = 28 - 1 - 7 = 20 | (1 == 20?) No.
 * 4. i = 2: leftSum = 8 | Right = 28 - 8 - 3 = 17 | (8 == 17?) No.
 * 5. i = 3: leftSum = 11 | Right = 28 - 11 - 6 = 11 | (11 == 11?) YES!
 *
 * Result: Pivot Index is 3.
 */


public class PivotIndex {
    public static int pivotIndex(int []arr){
        int n = arr.length;
        int []parr = new int[n];
        int totalSum = 0;
        for (int value : arr) {
            totalSum += value;
        }

        int leftsum = 0;
        for(int i=0;i<n;i++){
            if(leftsum == totalSum-leftsum-arr[i])
                return i;
            leftsum += arr[i];
        }
        return -1;

    }
    public static void main(String[] args){
        int []arr = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(arr));
    }
}
