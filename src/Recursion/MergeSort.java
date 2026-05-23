package Recursion;

//public class MergeSort {
//    public static void merge(int []arr,int low,int high,int mid){
//        int left = low,right = mid+1,index = 0;
//        int []temp = new int[high-low+1];
//        while(left <= mid && right<=high){
//            if(arr[left]<=arr[right]){
//                temp[index] = arr[left];
//                index++;left++;
//            }
//            else{
//                temp[index] = arr[right];
//                index++;right++;
//            }
//        }
//        while(left <= mid){
//            temp[index] = arr[left];
//            index++;left++;
//        }
//        while(right<=high){
//            temp[index] = arr[right];
//            index++;right++;
//        }
//        for(int i=low;i<=high;i++){
//            arr[i] = temp[i-low];
//        }
//    }
//    public static void sort(int []arr,int low,int high){
//        if(low>= high)
//            return;
//        int mid = (low+high)/2;
//        sort(arr,low,mid);
//        sort(arr,mid+1,high);
//        merge(arr,low,high,mid);
//    }
//    public static void main(String[] args){
//        int []arr = {6,3,5,2,2,8,1,3,2,9};
//        int low = 0;
//        int high = arr.length-1;
//        sort(arr,low,high);
//        for(int X : arr)
//            System.out.print(X +" ");
//    }
//}

//public class MergeSort{
//    public static void mergeSort(int []arr,int low,int high,int mid){
//        int []temp = new int[high-low+1];
//        int left = low, right = mid+1,index = 0;
//       while(left<=mid && right<=high){
//           if(arr[left]<=arr[right]){
//               temp[index] = arr[left];
//               index++;left++;
//           }
//           else{
//               temp[index] = arr[right];
//               index++;right++;
//           }
//       }
//       while(left<=mid){
//           temp[index] = arr[left];
//           index++;left++;
//       }
//       while(right<=high){
//           temp[index] = arr[right];
//           index++;right++;
//       }
//       for(int i=low;i<=high;i++){
//           arr[i] = temp[i-low];
//       }
//    }
//    public static void sort(int []arr,int low,int high){
//        if(high <= low)
//            return;
//        int mid = (low+high)/2;
//        sort(arr,low,mid);
//        sort(arr,mid+1,high);
//        mergeSort(arr,low,high,mid);
//    }
//    public static void main(String[] args){
//        int []arr = {6,3,5,2,2,8,1,3,2,9};
//        int low = 0;
//        int high = arr.length-1;
//        sort(arr,low,high);
//        for(int X : arr)
//            System.out.print(X +" ");
//
//    }
//}
//
//public class MergeSort{
//    public static void mergeSort(int arr[],int low,int high,int mid){
//        int temp[] = new int[high-low+1];
//        int index = 0;
//        int left = low, right = mid+1;
//        while(left <= mid && right <= high){
//            if(arr[left] <= arr[right]){
//                temp[index] = arr[left];
//                index++;left++;
//            }
//            else{
//                temp[index] = arr[right];
//                index++;right++;
//            }
//        }
//        while(left <= mid){
//            temp[index] = arr[left];
//            index++;left++;
//        }
//        while(right <= high){
//            temp[index] = arr[right];
//            right++;index++;
//        }
//        for(int i=low;i<=high;i++){
//            arr[i] = temp[i-low];
//        }
//    }
//    public static void sort(int[]arr,int low,int high){
//        if(low == high)
//            return;
//        int mid = (low+high)/2;
//        sort(arr,low,mid);
//        sort(arr,mid+1,high);
//        mergeSort(arr,low,high,mid);
//    }
//    public static void main(String[] args){
//        int[] arr = {6,3,5,2,2,8,1,3,2,9};
//        int low = 0;
//        int high = arr.length-1;
//        sort(arr,low,high);
//        for(int X : arr){
//            System.out.print(X +" ");
//        }
//    }
//}

//public class MergeSort{
//    public static void mergeSort(int[]arr,int low,int high,int mid){
//        int []temp = new int[high-low+1];
//        int index = 0,left = low,right = mid+1;
//        while(left<=mid && right<=high){
//            if(arr[left]<=arr[right]){
//                temp[index] = arr[left];
//                index++;left++;
//            }
//            else{
//                temp[index] = arr[right];
//                index++;right++;
//            }
//        }
//        while (left<=mid){
//            temp[index] = arr[left];
//            left++;index++;
//        }
//        while(right<=high){
//            temp[index] = arr[right];
//            right++;index++;
//        }
//        for(int i=low;i<=high;i++){
//            arr[i] = temp[i-low];
//        }
//    }
//    public static void sort(int[]arr,int low,int high){
//        if(low>=high)
//            return;
//        int mid = (low+high)/2;
//        sort(arr,low,mid);
//        sort(arr,mid+1,high);
//        mergeSort(arr,low,high,mid);
//    }
//    public static void main(String[] args){
//        int []arr = {12,1,0,12,19,18,77};
//        int low = 0;
//        int high = arr.length-1;
//        sort(arr,low,high);
//        for(int X : arr)
//            System.out.print(X +" ");
//    }
//}

//public class MergeSort{
//    public static void mergeSort(int[]arr,int low,int high,int mid){
//        int []temp = new int[high-low+1];
//        int index =  0, left = low,right = mid+1;
//        while(left<=mid && right <= high){
//            if(arr[left]<=arr[right]){
//                temp[index] = arr[left];
//                left ++; index++;
//            }
//            else {
//                temp[index] = arr[right];
//                index++;right++;
//            }
//        }
//        while(left<=mid){
//            temp[index] = arr[left];
//            left++;index++;
//        }
//        while(right<=high){
//            temp[index] = arr[right];
//            right++;index++;
//        }
//        for(int i = low;i<=high;i++){
//            arr[i] = temp[i-low];
//        }
//    }
//    public static void sort(int []arr,int low,int high){
//        if(low>=high)
//            return;
//        int mid = (low+high)/2;
//        sort(arr,low,mid);
//        sort(arr,mid+1,high);
//        mergeSort(arr,low,high,mid);
//    }
//    public static void main(String[] args){
//        int []arr = {1,90,2,20,100};
//        int low = 0;
//        int high = arr.length-1;
//        sort(arr,low,high);
//        for(int X : arr)
//            System.out.print(X +" ");
//    }
//}
//
//public class MergeSort{
//    public static void mergeSort(int []arr,int low,int high,int mid){
//        int []temp = new int[high-low+1];
//        int left = low, right = mid+1;
//        int index = 0;
//        while(left<=mid && right<=high){
//            if(arr[left]<=arr[right]){
//                temp[index] = arr[left];
//                left++;index++;
//            }
//            else{
//                temp[index]  = arr[right];
//                right++;index++;
//            }
//        }
//        while(left<=mid){
//            temp[index] = arr[left];
//            left++;index++;
//        }
//        while(right<=high){
//            temp[index]= arr[right];
//            right++;index++;
//        }
//        for(int i=low;i<=high;i++){
//            arr[i] = temp[i-low];
//        }
//    }
//    public static void sort(int []arr,int low,int high){
//        if(low>=high)
//            return;
//        int mid = (low+high)/2;
//        sort(arr,low,mid);
//        sort(arr,mid+1,high);
//        mergeSort(arr, low,high,mid);
//    }
//    public static void main(String[] args){
//        int []arr = {20,10,33,1,99};
//        int low = 0;
//        int high = arr.length-1;
//        sort(arr,low,high);
//        for(int X : arr)
//            System.out.print(X +" ");
//    }
//}