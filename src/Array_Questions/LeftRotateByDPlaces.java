package Array_Questions;
//
//public class LeftRotateByDPlaces {
//    public static int[] calcLeftRotateByDPlaces(int[]arr,int D){
//        int []temp = new int[arr.length];
//        for(int i=D;i< arr.length;i++){
//            temp[i-D] = arr[i];
//        }
//        int dif = arr.length - D;
//        for(int i=0;i<D;i++){
//            temp[i+dif] = arr[i];
//        }
//        return temp;
//    }
//    public static void main(String[] args){
//        int[]arr = {1,2,3,4,5,6,7};
//        int D = 2;
//        int []temp = calcLeftRotateByDPlaces(arr,D);
//        for(int X : temp)
//            System.out.print(X + " ");
//    }
//}

//
//public class LeftRotateByDPlaces {
//
//    /**
//     * Rotates an array to the left by D positions.
//     *
//     * @param arr The input array to be rotated.
//     * @param d   The number of positions to shift left.
//     * @return    A new array containing the rotated elements.
//     */
//    public static int[] leftRotate(int[] arr, int d) {
//        int n = arr.length;
//
//        // Handle cases where D is greater than the array length
//        d = d % n;
//
//        int[] rotatedArray = new int[n];
//
//        // Shift the remaining elements (from index D to n-1) to the front
//        for (int i = d; i < n; i++) {
//            rotatedArray[i - d] = arr[i];
//        }
//
//        // Move the first D elements to the end of the new array
//        for (int i = 0; i < d; i++) {
//            rotatedArray[n - d + i] = arr[i];
//        }
//
//        return rotatedArray;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int d = 2; // Test with values like 9 or 16 to verify the modulo logic
//
//        int[] result = leftRotate(arr, d);
//
//        // Print the rotated array
//        for (int element : result) {
//            System.out.print(element + " ");
//        }
//    }
//}

//public class LeftRotateByDPlaces {
//    public static int[] calcLeftRotateByDPlaces(int []arr,int d){
//        int []temp = new int[arr.length];
//        for(int i= d;i<arr.length;i++){
//            temp[i-d] = arr[i];
//        }
//        for(int i=0;i<d;i++){
//            temp[i+ arr.length-d] = arr[i];
//        }
//        return temp;
//    }
//    public static void main(String[] args){
//        int [] arr = {1, 2, 3, 4, 5, 6, 7};
//        int d = 2;
//        int []temp = calcLeftRotateByDPlaces(arr,d);
//        for(int X : temp)
//            System.out.print(X +" ");
//    }
//}
//
//public class LeftRotateByDPlaces {
//    public static int[] calcLeftRotateByDPlaces(int []arr,int k){
//        int []temp = new int[arr.length];
//        for(int i=0;i<k;i++){
//            temp[arr.length-k+i]=arr[i];
//        }
//        for(int i=k;i<arr.length;i++){
//            temp[i-k]=arr[i];
//        }
//        return temp;
//    }
//    public static void main(String[] args){
//        int []arr = {1,2,3,4,5,6,7};
//        int K = 2;
//        int []temp = calcLeftRotateByDPlaces(arr,K);
//        for(int X:temp)
//            System.out.print(X+" ");
//    }
//}

public class LeftRotateByDPlaces {
    public static int[] calcLeftRotateByDPlaces(int []arr,int k){
        int []temp = new int[arr.length];
        for(int i=0;i<k;i++){
            temp[arr.length-k+i]=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            temp[i-k] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args){
        int []arr ={1,2,3,4,5,6,7};int k=2;
        int []temp = calcLeftRotateByDPlaces(arr,k);
        for(int X:temp)
            System.out.print(X+" ");
    }
}