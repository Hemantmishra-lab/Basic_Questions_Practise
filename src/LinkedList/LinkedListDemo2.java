package LinkedList;

import java.util.LinkedList;

//public class LinkedListDemo2 {
//
//    //Node class
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//        Node head;
//
//        // Add at beginning
//        public void addbeg(int data){
//            Node newNode = new Node(data);
//            newNode.next = head;
//            head = newNode;
//        }
//        //Add at last
//        public void addLast(int data){
//            Node newNode = new Node(data);
//            if (head == null) {
//                head = newNode;
//                return;
//            }
//            Node temp = head;
//            while(temp != null && temp.next != null){
//                temp = temp.next;
//            }
//            temp.next = newNode;
//        }
//    }
//    public static void main(String[] args){
//
//    }
//}
//
//class Node{
//    int data;
//    Node next;
//    public Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class LinkedListDemo2 {
//    public static Node head = null;
//    public static void addBeg(int data){
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//    public static void addLast(int data){
//        Node newNode = new Node(data);
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        temp.next  = newNode;
//
//    }
//    public static Node reverseLinkedList(Node head){
//        Node prev = null;
//        Node curr = head;
//        while(curr != null){
//            Node nextNode = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextNode;
//        }
//        return prev;
//    }
//    public static void display(Node head){
//        Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+" ->");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//    public static void main(String[] args){
//        addBeg(1);
//        addLast(2);
//        addLast(3);
//        addLast(4);
//        addLast(5);
//        display(head);
//        head = reverseLinkedList(head);
//       display(head);
//    }
//}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo2 {
    public static Node head = null;
    public static void addBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next  = newNode;
    }
    public static Node LinkedListReverse(){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        addBeg(1);
        addBeg(2);
        addLast(3);
        addLast(4);
        addBeg(5);
        display();
        Node head = LinkedListReverse();
        display();
    }
}

















