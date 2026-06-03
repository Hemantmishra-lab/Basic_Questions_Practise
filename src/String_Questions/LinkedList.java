package String_Questions;

public class LinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void addIndex(int index,int data){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public boolean search(int data){
        Node temp = head;
        while(temp.next != null){
            if(temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }
    public void delete(int index){
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data+" -> ");
            temp  = temp.next;
        }
        System.out.println("null");
    }
    public int nthFromEnd(int index){
        Node fast = head;
        Node slow = head;
        for(int i=1;i<=index;i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
    public void deleteNthFromEnd(int index){
        Node fast = head;
        Node slow = head;
        for(int i=1;i<=index;i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
    }




    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addBeg();
    }
}
