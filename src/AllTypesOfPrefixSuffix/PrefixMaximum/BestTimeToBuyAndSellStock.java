package AllTypesOfPrefixSuffix.PrefixMaximum;

public class BestTimeToBuyAndSellStock {

    public static int calcMaximumProfit(int[] prices) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = prices.length;

        // Prefix Minimum store karega
        int[] prefixMin = new int[n];

        // Pehla price hi minimum hoga
        prefixMin[0] = prices[0];

        // Prefix Minimum Build
        for (int i = 1; i < n; i++) {
            prefixMin[i] = Math.min(prefixMin[i - 1], prices[i]);
        }

        int maxProfit = 0;

        for (int i = 1; i < n; i++) {

            // Current day bechne par profit
            int profit = prices[i] - prefixMin[i];

            // Maximum profit update karo
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int maxProfit = calcMaximumProfit(prices);

        System.out.println("Maximum Profit = " + maxProfit);
    }
}