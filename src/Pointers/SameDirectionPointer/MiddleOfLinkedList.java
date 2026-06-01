package Pointers.SameDirectionPointer;

// Linked List Node structure
class ListNode1 {
    int val;
    ListNode next;
    ListNode1(int x) {
        val = x;
        next = null;
    }
}

public class MiddleOfLinkedList {
    public static ListNode findMiddle(ListNode head) {
        // Fast aur slow dono ko shuruat me head par set kiya
        ListNode slow = head;
        ListNode fast = head;

        // Jab tak fast aur uska agla node null nahi hota
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Slow chalega 1 step
            fast = fast.next.next;  // Fast chalega 2 steps
        }

        // Jab fast loop se bahar aayega, slow hamesha middle element par hoga
        return slow;
    }

    public static void main(String[] args) {
        // Input: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Processing
        ListNode middleNode = findMiddle(head);

        // Output Process
        System.out.println(middleNode.val); // Output: 3
    }
}
