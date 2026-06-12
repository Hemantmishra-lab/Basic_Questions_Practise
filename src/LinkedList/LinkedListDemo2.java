package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo2 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void addBeg(int data){
        Node newNode  = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addIndex(int data,int index){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        newNode.next=temp.next.next;
        temp.next = newNode;
    }
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data +"-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        LinkedListDemo2 dm = new LinkedListDemo2();
        dm.addBeg(5);
        dm.addBeg(4);
        dm.addBeg(3);
        dm.addBeg(2);
        dm.addBeg(1);
        dm.addLast(6);
        dm.addLast(7);
        dm.display();
    }
}
