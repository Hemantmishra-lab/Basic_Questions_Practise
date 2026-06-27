package AllTypesOfPrefixSuffix.PrefixMinimum;

public class BestBuyPointUsingPrefixMinimum {

    public static int findBestBuyPoint(int[] prices) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = prices.length;

        // Prefix Minimum store karega
        int[] prefixMin = new int[n];

        // Pehle din ka price hi minimum hoga
        prefixMin[0] = prices[0];

        // Har index tak ka minimum price store karo
        for (int i = 1; i < n; i++) {
            prefixMin[i] = Math.min(prefixMin[i - 1], prices[i]);
        }

        // Best Buy Point (Minimum Price) dhoondho
        int bestBuyPrice = prefixMin[n - 1];

        return bestBuyPrice;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int bestBuyPrice = findBestBuyPoint(prices);

        System.out.println("Best Buy Price = " + bestBuyPrice);
    }
}