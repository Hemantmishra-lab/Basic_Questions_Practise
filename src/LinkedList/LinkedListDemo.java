package LinkedList;

//public class LinkedListDemo {
//
//    // Node Class
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    Node head;
//
//    // 1. Add at Beginning
//    public void addBeg(int data) {
//        Node newNode = new Node(data);
//
//        newNode.next = head;
//        head = newNode;
//    }
//
//    // 2. Add at Last
//    public void addLast(int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        Node temp = head;
//
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = newNode;
//    }
//
//    // 3. Add at Index
//    public void addIndex(int index, int data) {
//
//        if (index == 0) {
//            addBeg(data);
//            return;
//        }
//
//        Node newNode = new Node(data);
//        Node temp = head;
//
//        for (int i = 0; i < index - 1; i++) {
//            temp = temp.next;
//        }
//
//        newNode.next = temp.next;
//        temp.next = newNode;
//    }
//
//    // 4. Search
//    public boolean search(int data) {
//
//        Node temp = head;
//
//        while (temp != null) {
//
//            if (temp.data == data) {
//                return true;
//            }
//
//            temp = temp.next;
//        }
//
//        return false;
//    }
//
//    // 5. Delete by Index
//    public void delete(int index) {
//
//        if (head == null)
//            return;
//
//        if (index == 0) {
//            head = head.next;
//            return;
//        }
//
//        Node temp = head;
//
//        for (int i = 0; i < index - 1; i++) {
//            temp = temp.next;
//        }
//
//        temp.next = temp.next.next;
//    }
//
//    // 6. Display
//    public void display() {
//
//        Node temp = head;
//
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//
//        System.out.println("null");
//    }
//
//    // 7. Nth Node From End
//    public int nthFromEnd(int n) {
//
//        Node fast = head;
//        Node slow = head;
//
//        for (int i = 0; i < n; i++) {
//            fast = fast.next;
//        }
//
//        while (fast != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//
//        return slow.data;
//    }
//
//    // 8. Delete Nth Node From End
//    public void deleteNthFromEnd(int n) {
//
//        Node dummy = new Node(0);
//        dummy.next = head;
//
//        Node fast = dummy;
//        Node slow = dummy;
//
//        for (int i = 0; i <= n; i++) {
//            fast = fast.next;
//        }
//
//        while (fast != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//
//        slow.next = slow.next.next;
//
//        head = dummy.next;
//    }
//
//    // Main Method
//    public static void main(String[] args) {
//
//        LinkedListDemo list = new LinkedListDemo();
//
//        // Add Last
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//
//        // Add Beginning
//        list.addBeg(5);
//
//        // Add At Index
//        list.addIndex(2, 15);
//
//        System.out.println("Linked List:");
//        list.display();
//
//        // Search
//        System.out.println("Search 20 = " + list.search(20));
//
//        // Delete Index
//        list.delete(2);
//
//        System.out.println("After Delete Index 2:");
//        list.display();
//
//        // Nth Node From End
//        System.out.println("2nd Node From End = "
//                + list.nthFromEnd(2));
//
//        // Delete Nth Node From End
//        list.deleteNthFromEnd(2);
//
//        System.out.println("After Delete 2nd Node From End:");
//        list.display();
//    }
//}

//public class LinkedListDemo {
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//        }
//    }
//    static Node head;
//    static void addBeg(int data){
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//    static void addLast(int data){
//        Node newNode = new Node(data);
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = newNode;
//
//    }
//    static void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data +"->");
//            temp = temp.next;
//        }
//        System.out.print("null");
//    }
//    public static void main(String[] args){
//        addBeg(1);
//        addBeg(2);
//        addLast(3);
//        addLast(4);
//        addLast(5);
//        display();
//    }
//}

//public class LinkedListDemo {
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//        }
//    }
//    static Node head;
//    static void addBeg(int data){
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//    static void addLast(int data){
//        Node newNode = new Node(data);
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//    static void reverse(){
//        Node curr = head;
//        Node prev = null;
//        while(curr != null){
//            Node nextNode = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextNode;
//        }
//        head = prev;
//    }
//    static void
//    static void midData(){
//        Node fast = head;
//        Node slow = head;
//        while(fast!=null && fast.next!=null){
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        System.out.println(slow.data);
//    }
//    static void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data +"->");
//            temp = temp.next;
//        }
//        System.out.print("null");
//        System.out.println();
//    }
//    public static void main(String[] args){
//        addBeg(1);
//        addLast(2);
//        addLast(3);
//        addLast(4);
//        addLast(5);
//        display();
//        reverse();
//        display();
//        midData();
//    }
//}

//public class LinkedListDemo {
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//        }
//    }
//    static Node head;
//    static void addBeg(int data){
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//    static void addLast(int data){
//        Node newNode = new Node(data);
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//    static void addIndex(int index,int data){
//        Node newNode = new Node(data);
//        Node temp = head;
//        for(int i=0;i<index-1;i++){
//            temp = temp.next;
//        }
//    }
//}

//public class LinkedListDemo{
//    static class Node{
//        Node prev;
//        int data;
//        Node next;
//        Node(int data){
//            this.prev = null;
//            this.data = data;
//            this.next = null;
//        }
//
//
//    }
//    static Node head;
//    static void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data+"<->");
//            temp = temp.next;
//        }
//        System.out.print("null");
//    }
//    public static void main(String[] args){
//        Node n1 = new Node(10);
//        Node n2 = new Node(11);
//        Node n3 = new Node(12);
//        Node n4 = new Node(13);
//        Node n5 = new Node(14);
//        n1.next = n2;
//        n2.prev = n1;
//        n2.next = n3;
//        n3.prev = n2;
//        n3.next = n4;
//        n4.next = n5;
//        n5.prev = n4;
//
//        display();
//    }
//}

//public class LinkedListDemo {
//   static class Node{
//       Node prev;
//       int data;
//       Node next;
//        Node(int data){
//            this.prev = null;
//           this.data = data;
//           this.next = null;
//       }
//   }
//    static Node head;
//   static void addBeg(int data){
//       Node newNode = new Node(data);
//       newNode.next = head;
//       head.prev = newNode;
//       head = newNode;
//   }
//
//   static void addLast(int data){
//       Node newNode = new Node(data);
//       Node temp = head;
//       while(temp.next != null){
//           temp = temp.next;
//       }
//       temp.next = newNode;
//       newNode.prev = temp;
//   }
//   static void addIndex(int index,int data){
//       Node newNode = new Node(data);
//       Node temp = head;
//       for(int i=0;i<index-1;i++){
//           temp = temp.next;
//       }
//       temp.next = newNode;
//       newNode.prev = temp;
//   }
//   static void display(){
//       Node temp = head;
//       while(temp!=null){
//           System.out.print(temp.data +" <-> ");
//           temp = temp.next;
//       }
//       System.out.print("null");
//   }
//
//   public static void main(String[] args){
//       Node n1 = new Node(1);
//       Node n2 = new Node(2);
//       Node n3 = new Node(3);
//       Node n4 = new Node(4);
//       Node n5 = new Node(5);
//       n1.next = n2;
//       n2.prev = n1;
//       n2.next = n3;
//       n3.prev = n2;
//       n3.next = n4;
//       n4.prev = n3;
//       n4.next = n5;
//       n5.prev = n4;
//
//       addBeg(45);
//       addBeg(63);
//       addLast(99);
//       addLast(78);
//       addIndex(3,666);
//       head = n1;
//       display();
//   }
//}

//public class LinkedListDemo {
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//    static Node head;
//    static void addBeg(int data){
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//    static void addLast(int data){
//        Node newNode = new Node(data);
//        Node temp = head;
//        while(temp.next !=null){
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//    static void addIndex(int index,int data){
//        Node newNode = new Node(data);
//        Node temp = head;
//        for(int i=0;i<index-1;i++){
//            temp = temp.next;
//        }
//        Node temp2 = temp.next;
//        temp.next = newNode;
//        newNode.next = temp2;
//    }
//    static boolean search(int data){
//        Node temp = head;
//        while(temp != null){
//            if(data == temp.data){
//                return true;
//            }
//            temp = temp.next;
//        }
//        return false;
//    }
//    static void delete(int index){
//        Node temp = head;
//        for(int i=0;i<index-1;i++){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//    }
//    static void reverse(){
//        Node curr = head;
//        Node prev = null;
//        while(curr != null){
//            Node temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//        head = prev;
//    }
//    static int middle(){
//        Node fast = head;
//        Node slow = head;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow.data;
//    }
//    static int nThFromEnd(int index){
//        Node first = head;
//        Node second = head;
//        for(int i=0;i<index;i++){
//            first  = first.next;
//        }
//        while(first != null){
//            first = first.next;
//            second = second.next;
//        }
//        return second.data;
//    }
//    static void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data+"->");
//            temp = temp.next;
//        }
//        System.out.print("null");
//        System.out.println();
//    }
//    public static void main(String[] args){
//        addBeg(1);
//        addLast(2);
//        addLast(3);
//        addLast(4);
//        addIndex(1,99);
//        delete(1);
//        display();
//        reverse();
//        display();
//        System.out.println(middle());
//        System.out.println(nThFromEnd(3));
//
//    }
//}

