package Pointers.SameDirectionPointer;//    package Pointers.SameDirectionPointer;
//    //
//    //// Linked List Node1 structure
//    class ListNode1 {
//        int val;
//        ListNode1 next;
//        ListNode1(int x) {
//            val = x;
//            next = null;
//        }
//    }
//
//    public class LinkedListCycle {
//        public static boolean hasCycle(ListNode1 head) {
//            // Agar list khali hai ya sirf ek hi Node1 hai bina cycle ke
//            if (head == null || head.next == null) {
//                return false;
//            }
//
//            // Aapka bataya hua Fast & Slow Pointer setup
//            ListNode1 slow = head;
//            ListNode1 fast = head;
//
//            // Jab tak fast aur uska agla Node1 null nahi hota (taaki fast 2 step chal sake)
//            while (fast != null && fast.next != null) {
//                slow = slow.next;         // 1 step move
//                fast = fast.next.next;    // 2 steps move
//
//                // Agar dono ek hi Node1 par mil gaye, matlab cycle pakdi gayi!
//                if (slow == fast) {
//                    return true;
//                }
//            }
//
//            return false; // Agar fast null tak pahunch gaya, toh cycle nahi hai
//        }
//
//        public static void main(String[] args) {
//            // Input: 1 -> 2 -> 3 -> 4 -> 2 (Cycle back to 2)
//            ListNode1 head = new ListNode1(1);
//            ListNode1 Node12 = new ListNode1(2);
//            ListNode1 Node13 = new ListNode1(3);
//            ListNode1 Node14 = new ListNode1(4);
//
//            head.next = Node12;
//            Node13.next = Node14;
//            Node12.next = Node13;
//            Node14.next = Node12; // 4 wapas 2 par point kar raha hai (Cycle Created)
//
//            // Output Process
//            boolean result = hasCycle(head);
//            System.out.println(result); // Output: true
//        }
//    }

//class Node1{
//    int data;
//    Node1 next;
//    public Node1(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//public class LinkedListCycle {
//    public static boolean calcLinkedListCycle(Node1 head){
//        Node1 fast = head;
//        Node1 slow = head;
//        while(fast!=null && fast.next!=null){
//
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args){
//        Node1 head = new Node1(1);
//        Node1 Node12 = new Node1(2);
//        Node1 Node13 = new Node1(3);
//        Node1 Node14 = new Node1(4);
//
//        // Connecting Node1s linearly
//        head.next = Node12;
//        Node12.next = Node13;
//        Node13.next = Node14;
//
//        // Creating a REAL cycle: 4 wapas 2 par point karega
//        Node14.next = Node12;
//
//        // Ab output exact 'true' aayega!
//        System.out.println(calcLinkedListCycle(head));
//    }
//}

//class Node1{
//    int data;
//    Node1 next;
//    public Node1(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//public class LinkedListCycle {
//    public static boolean calcLinkedListCycle(Node1 head){
//        Node1 fast = head; Node1 slow = head;
//        while(fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args){
//        Node1 head = new Node1(1);
//        Node1 Node12 = new Node1(2);
//        Node1 Node13 = new Node1(3);
//        Node1 Node14 = new Node1(4);
//
//        head.next = Node12;
//        Node12.next = Node13;
//        Node13.next = Node14;
//        Node14.next = Node12;
////        Node14.next = null;
//
//        System.out.println(calcLinkedListCycle(head));
//    }
//}
