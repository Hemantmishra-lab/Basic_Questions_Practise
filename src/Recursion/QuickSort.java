package Recursion;
//
//public class QuickSort {
//    public static void main(String[] args) {
//        int[] arr = {24, 9, 29, 14, 19, 27};
//        int n = arr.length;
//
//        System.out.println("Sorting se pehle:");
//        printArray(arr);
//
//        quicksort(arr, 0, n - 1);
//
//        System.out.println("Sorting ke baad:");
//        printArray(arr);
//    }
//
//    // Image 1: Recursive Function
//    public static void quicksort(int arr[], int start, int end) {
//        // Base case: agar array khali hai ya ek hi element hai
//        if (start >= end) {
//            return;
//        }
//
//        // Partition karke pivot ki sahi jagah nikaalna
//        int pivotIndex = partition(arr, start, end);
//
//        // Pivot ke Left side ko sort karna
//        quicksort(arr, start, pivotIndex - 1);
//
//        // Pivot ke Right side ko sort karna
//        quicksort(arr, pivotIndex + 1, end);
//    }
//
//    // Image 2: Partition Logic
//    public static int partition(int arr[], int start, int end) {
//        int pos = start;
//
//        // Loop: start se end tak check karna
//        for (int i = start; i <= end; i++) {
//            // Agar current element pivot (arr[end]) se chota ya barabar hai
//            if (arr[i] <= arr[end]) {
//                // Swap arr[i] and arr[pos]
//                int temp = arr[i];
//                arr[i] = arr[pos];
//                arr[pos] = temp;
//
//                pos++; // pos ko aage badhana
//            }
//        }
//        // Pivot ki sahi position return karna
//        return pos - 1;
//    }
//
//    public static void printArray(int[] arr) {
//        for (int val : arr) {
//            System.out.print(val + " ");
//        }
//        System.out.println();
//    }
//}


//public class QuickSort{
//    public static int partition(int []arr,int start,int end){
//        int pos = start;
//        for(int i=start;i<=end;i++){
//            if(arr[i] <= arr[end]){
//                int temp = arr[i];
//                arr[i] = arr[pos];
//                arr[pos] = temp;
//                pos ++ ;
//            }
//        }
//        return pos-1;
//    }
//    public static void quickSort(int[]arr,int start,int end,int n){
//        if(start >= end){
//            return;
//        }
//        int Pivot = partition(arr,start,end);
//        quickSort(arr, start, Pivot- 1,n);
//        quickSort(arr, Pivot + 1, end,n);
//    }
//    public static void main(String[] args){
//        int []arr = {24, 9, 29, 14, 19, 27};
//       int n = arr.length - 1;
//        int start = 0;
//        int end = n ;
//        quickSort(arr,start,end,n);
//        for(int x : arr)
//            System.out.print(x +" ");
//    }
//}
//
//public class QuickSort{
//    public static int Partition(int []arr,int low,int high){
//        int pos = low;
//        for(int i=low;i<=high;i++){
//            if(arr[high]>=arr[i]){
//                int temp = arr[i];
//                arr[i] = arr[pos];
//                arr[pos] = temp;
//                pos++;
//            }
//        }
//        return pos-1;
//    }
//    public static void quickSort(int []arr,int low,int high){
//        if(low>=high){
//            return;
//        }
//        int Pivot = Partition(arr,low,high);
//        quickSort(arr,low,Pivot-1);
//        quickSort(arr,Pivot+1,high);
//    }
//    public static void main(String[] args){
//        int []arr = {24, 9, 29, 14, 19, 27};
//        quickSort(arr,0,arr.length-1);
//        for(int X : arr)
//            System.out.print(X +" ");
//    }
//}

//public class QuickSort{
//    public static int Partition(int[]arr,int low,int high){
//        int pos = low;
//        for(int i=low;i<=high;i++){
//            if(arr[i]<=arr[high]){
//                int temp = arr[i];
//                arr[i] = arr[pos];
//                arr[pos] = temp;
//                pos++;
//            }
//        }
//        return pos-1;
//    }
//    public static void quickSort(int []arr,int low,int high){
//        if(low >= high){
//            return;
//        }
//        int Pivot = Partition(arr,low,high);
//        quickSort(arr,low,Pivot-1);
//        quickSort(arr,Pivot+1,high);
//    }
//    public static void main(String[] args){
//        int [] arr = {24, 9, 29, 14, 19, 27};
//        int low = 0;
//        int high = arr.length-1;
//        quickSort(arr,low,high);
//        for(int X : arr)
//            System.out.print(X +" ");
//    }
//}
//
//public class QuickSort{
//    public static int Partition(int []arr,int low,int high){
//        int pos = low;
//        for(int i=low;i<=high;i++){
//            if(arr[high]>=arr[i]){
//                int temp = arr[i];
//                arr[i] = arr[pos];
//                arr[pos] = temp;
//                pos++;
//            }
//        }
//        return pos-1;
//    }
//    public static void quickSort(int []arr,int low,int high){
//        if(low >= high)
//            return;
//        int Pivot = Partition(arr,low,high);
//        quickSort(arr,low,Pivot-1);
//        quickSort(arr,Pivot+1,high);
//    }
//    public static void main(String[] args){
//        int[]arr = {24, 9, 29, 14, 19, 27};
//        int low = 0;
//        int high = arr.length-1;
//        quickSort(arr,low,high);
//        for(int X : arr){
//            System.out.print(X +" ");
//        }
//    }
//}

//public class QuickSort{
//    public static int Partition(int []arr,int low,int high){
//        int Pos = low;
//        for(int i=low;i<=high;i++){
//            if(arr[high]>=arr[i]){
//                int temp = arr[i];
//                arr[i] = arr[Pos];
//                arr[Pos] = temp;
//                Pos++;
//            }
//        }
//        return Pos-1;
//    }
//    public static void quickSort(int []arr,int low,int high){
//        if(low>=high)
//            return;
//        int Pivot = Partition(arr,low,high);
//        quickSort(arr, low, Pivot - 1);
//        quickSort(arr,Pivot+1,high);
//    }
//    public static void main(String[] args){
//        int arr[] = {24, 9, 29, 14, 19, 27};
//        int low = 0;
//        int high = arr.length-1;
//        quickSort(arr,low,high);
//        for(int X : arr)
//            System.out.print(X +" ");
//    }
//}
//
//public class QuickSort{
//    public static int Partition(int []arr,int low,int high){
//        int pos = low;
//        for(int i=low;i<=high;i++){
//            if(arr[i]<=arr[high]){
//                int temp = arr[i];
//                arr[i] = arr[pos];
//                arr[pos] = temp;
//                pos++;
//            }
//        }
//        return pos-1;
//    }
//    public static void quickSort(int []arr,int low,int high){
//        if(low>=high)
//            return;
//        int Pivot = Partition(arr,low,high);
//        quickSort(arr,low,Pivot-1);
//        quickSort(arr,Pivot+1,high);
//    }
//    public static void main(String[] args){
//        int arr[] = {24, 9, 29, 14, 19, 27};
//        int low = 0;
//        int high = arr.length-1;
//        quickSort(arr,low,high);
//        for (int X :arr)
//            System.out.print(X +" ");
//    }
//}

//public class QuickSort{
//    public static int Partition(int []arr,int low,int high){
//        int pos = low;
//        for(int i=low;i<=high;i++){
//            if(arr[i]<=arr[high]){
//                int temp = arr[i];
//                arr[i] = arr[pos];
//                arr[pos] = temp;
//                pos++;
//            }
//        }
//        return pos-1;
//    }
//    public static void quickSort(int []arr,int low,int high){
//        if(low>=high)
//            return;
//        int Pivot = Partition(arr,low,high);
//        quickSort(arr,low,Pivot-1);
//        quickSort(arr,Pivot+1,high);
//    }
//    public static void main(String[] args) {
//        int[] arr = {12, 1, 19, 90, 10, 88};
//        int low = 0;
//        int high = arr.length - 1;
//        quickSort(arr, low, high);
//        for (int X : arr)
//            System.out.print(X +" ");
//    }
//}

//public class QuickSort{
//    public static int Partition(int []arr,int low,int high){
//        int end = high;int pos = 0;
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]<=arr[end]){
//                int temp = arr[i];
//                arr[i] = arr[pos];
//                arr[pos]=temp;
//                pos++;
//            }
//        }
//        return pos-1;
//    }
//    public static void quickSort(int []arr,int low,int high){
//        if(low>=high)
//            return;
//        int Pivot = Partition(arr,low,high);
//        quickSort(arr,low,Pivot-1);
//        quickSort(arr,Pivot+1,high);
//    }
//    public static void main(String[] args){
//        int []arr = {1,99,12,31,48};
//        int low = 0;
//        int high = arr.length-1;
//        quickSort(arr,low,high);
//        for(int X : arr)
//            System.out.print(X + " ");
//    }
//}
