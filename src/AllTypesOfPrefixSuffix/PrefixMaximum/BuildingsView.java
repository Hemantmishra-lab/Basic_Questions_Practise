package AllTypesOfPrefixSuffix.PrefixMaximum;

public class BuildingsView {

    public static boolean[] calcBuildingsViewFromLeft(int[] heights) {

        // Time Complexity : O(n)
        // Space Complexity: O(n)

        int n = heights.length;

        // Prefix Maximum store karega
        int[] prefixMax = new int[n];

        // Building visible hai ya nahi
        boolean[] visible = new boolean[n];

        // Pehli building hamesha visible hogi
        prefixMax[0] = heights[0];
        visible[0] = true;

        for (int i = 1; i < n; i++) {

            // Agar current building previous sabhi buildings se badi hai
            if (heights[i] > prefixMax[i - 1]) {
                visible[i] = true;
            }

            // Prefix Maximum update karo
            prefixMax[i] = Math.max(prefixMax[i - 1], heights[i]);
        }

        return visible;
    }

    public static void main(String[] args) {

        int[] heights = {4, 2, 7, 5, 9, 3, 10};

        boolean[] visible = calcBuildingsViewFromLeft(heights);

        System.out.println("Visible Buildings:");

        for (int i = 0; i < visible.length; i++) {

            if (visible[i]) {
                System.out.println("Index = " + i + ", Height = " + heights[i]);
            }
        }
    }
}