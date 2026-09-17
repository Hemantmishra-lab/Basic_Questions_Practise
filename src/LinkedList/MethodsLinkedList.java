//package LinkedList;
//
//public class MethodsLinkedList{
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//        }
//    }
//
//    static Node head;
//
//    static void addBeg(int data){
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    static void addLast(int data){
//        Node newNode = new Node(data);
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//
//    static void addIndex(int index,int data){
//        Node newNode = new Node(data);
//        Node temp = head;
//        for(int i=1;i<index;i++){
//            temp = temp.next;
//        }
//        Node temp2 = temp.next;
//        temp.next = newNode;
//        newNode.next = temp2;
//    }
//
//    static boolean search(int data){
//        Node temp = head;
//        while(temp != null){
//            if(temp.data == data){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    static Node reverse(Node head){
//        Node curr = head;
//        Node prev = null;
//        while (curr!=null){
//            Node temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//        head = prev;
//        return head;
//    }
//
//    static int middle(Node head){
//        Node fast = head;
//        Node slow = head;
//        while (fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow.data;
//    }
//
//    static int nThFromEnd(int index){
//        Node fast = head,slow = head;
//        for(int i=1;i<=index;i++){
//            fast = fast.next;
//        }
//        while(fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow.data;
//    }
//
//    static boolean isCycle(Node head){
//
//    }
//}
