package Array_Questions;
//
//public class SwapAtIndex {
//    public static int[] calcSwapAtIndex(int []arr,int k){
//
//        for(int i=arr.length-1;i>=0;i--){
//            if(k-1 == arr.length-1-i){
//                int tempend = arr[i];
//                arr[i] = arr[k-1];
//                arr[k-1] = tempend;
//            }
//        }
//        return arr;
//    }
//    public static void main(String []args){
//        int []arr = {1,2,3,4,5,6,7,8,9};
//        int k = 2;
//        calcSwapAtIndex(arr,k);
//        for(int X:arr)
//            System.out.print(X+" ");
//    }
//}


import java.sql.SQLData;

public class SwapAtIndex {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
        public void addLastElement(int data){
            Node newNode = new Node(data);
            Node temp = head;
            while(temp.next !=null){
               temp = temp.next;
            }
            temp.next = newNode;
        }
    public void display(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            System.out.print(temp.data +"-> ");
        }
        System.out.print(" "+"null");
        System.out.println();
    }
    public static void main(String[] args){
        SwapAtIndex st = new SwapAtIndex();
        st.addLastElement(10);
        st.addLastElement(20);
        st.addLastElement(30);
        st.addLastElement(40);
        st.display();
    }
}