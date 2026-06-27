package AllTypesOfPrefixSuffix.SuffixMaximum;

public class RainWaterUsingSuffixMaximum {

    public static int calcTrappedRainWater(int[] height) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = height.length;

        // 3 se kam buildings me water trap nahi hoga
        if (n < 3) {
            return 0;
        }

        // Left Maximum store karega
        int[] prefixMax = new int[n];

        // Right Maximum store karega
        int[] suffixMax = new int[n];

        // Prefix Maximum Build
        prefixMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }

        // Suffix Maximum Build
        suffixMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }

        int totalWater = 0;

        for (int i = 0; i < n; i++) {

            // Left aur Right boundary me jo choti hogi wahi water level hogi
            int waterLevel = Math.min(prefixMax[i], suffixMax[i]);

            // Current building ki height hata do
            totalWater += waterLevel - height[i];
        }

        return totalWater;
    }

    public static void main(String[] args) {

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int trappedWater = calcTrappedRainWater(height);

        System.out.println("Total Trapped Rain Water = " + trappedWater);
    }
}
