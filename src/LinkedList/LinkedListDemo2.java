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
//    }
//    public static Node LinkedListReverse(){
//        Node curr = head;
//        Node prev = null;
//        while(curr!=null){
//            Node nextNode = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextNode;
//        }
//        return prev;
//    }
//    public static void display(){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+" ->");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//    public static void main(String[] args){
//        addBeg(1);
//        addBeg(2);
//        addLast(3);
//        addLast(4);
//        addBeg(5);
//        display();
//        Node head = LinkedListReverse();
//        display();
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
//public class LinkedListDemo2 {
//    public static Node head = null;
//
//    public static void addBeg(int data){
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    public static void addLast(int data){
//        Node newNode= new Node(data);
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//
//    public static int MiddleElement(){
//        Node fast = head;Node slow = head;
//        while(fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow.data;
//    }
//
//    public static void revLinkedList(){
//        Node prev = null;
//        Node curr = head;
//        while(curr != null){
//            Node nextNode = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextNode;
//        }
//        head = prev;
//    }
//
//    public static boolean isCycle(){
//        Node fast = head;Node slow = head;
//        while(fast.next != null){
//            if(slow.next == fast.next.next){
//                return true;
//            }
//            fast = fast.next.next;
//        }
//        return false;
//    }
//
//    public static void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data+" ->");
//            temp = temp.next;
//        }
//        System.out.print("null");
//        System.out.println();
//    }
//
//    public static void main(String[] args){
//        addBeg(1);
//        addLast(2);
//        addLast(3);
//        addLast(4);
//        addLast(5);
//        revLinkedList();
//        display();
//        System.out.println(MiddleElement());
//        System.out.println(isCycle());
//    }
//}
//

//
//class Node{
//    int data;
//    Node next;
//    public Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//public class LinkedListDemo2 {
//    public static Node head = null;
//
//    public static void addBed(int data){
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
//        temp.next = newNode;
//    }
//    public static void addIndex(int index,int data){
//        Node newNode = new Node(data);
//        Node temp = head;
//        for(int i=1;i<index-1;i++){
//            temp =  temp.next;
//        }
//        newNode.next = temp.next;
//        temp.next = newNode;
//    }
//    public static boolean search(int data){
//        Node temp = head;
//        while(temp != null){
//            if(temp.data == data)
//                return true;
//            temp = temp.next;
//        }
//        return false;
//    }
//    public static void delete(int index){
//        Node temp = head;
//        for(int i=1;i<=index-1;i++){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//    }
//    public static void reverseLinkedList(){
//        Node curr = head;
//        Node prev = null;
//        while(curr != null){
//            Node newNode = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = newNode;
//        }
//        head = prev;
//    }
//    public static int middleNode(){
//        Node slow = head;
//        Node fast = head;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow.data;
//    }
//    public static int nthEnd(int k){
//        Node first = head;
//        Node second = head;
//        for(int i=1;i<=k;i++){
//            first = first.next;
//        }
//        while(first != null){
//            second = second.next;
//            first = first.next;
//        }
//        return second.data;
//    }
//    public static boolean cycleDetection(){
//        Node slow = head;
//        Node fast = head;
//        while(fast != null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next;
//            if(slow == fast){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data+" ->");
//            temp = temp.next;
//        }
//        System.out.print("null");
//        System.out.println();
//    }
//    public static void main(String[] args){
//        addBed(1);
//        addLast(2);
//        addLast(3);
//        addIndex(2,99);
//        delete(2);
//        addLast(5);
//        addLast(4);
//        addLast(5);
//        System.out.println("Search "+search(5));
//        System.out.println(cycleDetection());
//        display();
//        System.out.println(nthEnd(2));
//        System.out.println(middleNode());
//        reverseLinkedList();
//        display();
//    }
//}
//
//public class LinkedListDemo2 {
//    public static void main(String[] args){
//
//    }
//}












