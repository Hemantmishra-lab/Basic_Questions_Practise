package Pointers.ThreePointers;

public class SortColors {
    public static void sortColors(int[] arr) {
        // Three Pointers Setup
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        // Loop tab tak chalega jab tak mid aur high cross nahi hote
        while (mid <= high) {
            if (arr[mid] == 0) {
                // 0 ko low wale spot par bhejo
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                // 1 apni sahi jagah par hi ja raha hai, bas aage badho
                mid++;
            }
            else { // arr[mid] == 2
                // 2 ko high wale spot par bhejo
                swap(arr, mid, high);
                high--; // mid++ NAHI karenge, naye element ko agle loop me check karenge
            }
        }
    }

    // Helper method elements ko swap karne ke liye
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Input Format
        int[] arr = {2, 0, 2, 1, 1, 0};

        // Processing (In-place)
        sortColors(arr);

        // Output Format
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("]");
        // Output: [0,0,1,1,2,2]
    }
}

