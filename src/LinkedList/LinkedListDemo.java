package LinkedList;

public class LinkedListDemo {

    // Node Class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // 1. Add at Beginning
    public void addBeg(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // 2. Add at Last
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 3. Add at Index
    public void addIndex(int index, int data) {

        if (index == 0) {
            addBeg(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Search
    public boolean search(int data) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == data) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // 5. Delete by Index
    public void delete(int index) {

        if (head == null)
            return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    // 6. Display
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // 7. Nth Node From End
    public int nthFromEnd(int n) {

        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.data;
    }

    // 8. Delete Nth Node From End
    public void deleteNthFromEnd(int n) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        head = dummy.next;
    }

    // Main Method
    public static void main(String[] args) {

        LinkedListDemo list = new LinkedListDemo();

        // Add Last
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Add Beginning
        list.addBeg(5);

        // Add At Index
        list.addIndex(2, 15);

        System.out.println("Linked List:");
        list.display();

        // Search
        System.out.println("Search 20 = " + list.search(20));

        // Delete Index
        list.delete(2);

        System.out.println("After Delete Index 2:");
        list.display();

        // Nth Node From End
        System.out.println("2nd Node From End = "
                + list.nthFromEnd(2));

        // Delete Nth Node From End
        list.deleteNthFromEnd(2);

        System.out.println("After Delete 2nd Node From End:");
        list.display();
    }
}
