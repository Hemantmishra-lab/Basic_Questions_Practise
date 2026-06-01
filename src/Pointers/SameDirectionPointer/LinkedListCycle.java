package Pointers.SameDirectionPointer;

// Linked List Node structure
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        // Agar list khali hai ya sirf ek hi node hai bina cycle ke
        if (head == null || head.next == null) {
            return false;
        }

        // Aapka bataya hua Fast & Slow Pointer setup
        ListNode slow = head;
        ListNode fast = head;

        // Jab tak fast aur uska agla node null nahi hota (taaki fast 2 step chal sake)
        while (fast != null && fast.next != null) {
            slow = slow.next;         // 1 step move
            fast = fast.next.next;    // 2 steps move

            // Agar dono ek hi node par mil gaye, matlab cycle pakdi gayi!
            if (slow == fast) {
                return true;
            }
        }

        return false; // Agar fast null tak pahunch gaya, toh cycle nahi hai
    }

    public static void main(String[] args) {
        // Input: 1 -> 2 -> 3 -> 4 -> 2 (Cycle back to 2)
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        head.next = node2;
        node3.next = node4;
        node2.next = node3;
        node4.next = node2; // 4 wapas 2 par point kar raha hai (Cycle Created)

        // Output Process
        boolean result = hasCycle(head);
        System.out.println(result); // Output: true
    }
}
