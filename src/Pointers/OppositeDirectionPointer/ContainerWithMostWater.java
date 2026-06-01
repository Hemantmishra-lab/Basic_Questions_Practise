package Pointers.OppositeDirectionPointer;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            // 1. Width nikal lo
            int width = right - left;

            // 2. Chhoti height nikal lo
            int currentHeight = Math.min(height[left], height[right]);

            // 3. Current area calculate karke maxWater update karo
            int currentWater = width * currentHeight;
            maxWater = Math.max(maxWater, currentWater);

            // 4. Jis pillar ki height chhoti hai, us pointer ko aage badhao
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        // Input Format
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        // Output Process
        int result = maxArea(arr);
        System.out.println(result); // Output: 49
    }
}

