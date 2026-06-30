package Tree;

//public class TreeImpMethods {
//    static class Node{
//        int data;
//        Node left,right;
//        Node(int data){
//            this.data = data;
//        }
//    }
//    static Node root;
//    static Node insert(Node root,int data){
//        if(root == null)
//            return new Node(data);
//        if (data < root.data) {
//            root.left = insert(root.left,data);
//        }
//        else{
//            root.right = insert(root.right,data);
//        }
//        return root;
//    }
//    static boolean search(Node root,int key){
//        if(root == null)
//            return false;
//        if(root.data == key)
//            return true;
//        else if(root.data>key)
//            return search(root.left,key);
//        else
//            return search(root.right,key);
//    }
//    static void inOrder(Node root){
//        if(root == null)
//            return;
//        inOrder(root.left);
//        System.out.print(root.data+" ");
//        inOrder(root.right);
//    }
//    static void preOrder(Node root){
//        if(root == null)
//            return;
//        System.out.print(root.data+" ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }
//    static void postOrder(Node root){
//        if(root == null)
//            return;
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.data+" ");
//    }
//    public  static void main(String[] args){
//        root = insert(root, 2);
//        root = insert(root, 1);
//        root = insert(root, 3);
//
//        System.out.println("Search 3: " + search(root, 3));
//
//        System.out.print("PreOrder: ");
//        preOrder(root);
//        System.out.println();
//
//        System.out.print("PostOrder: ");
//        postOrder(root);
//        System.out.println();
//
//        System.out.print("InOrder: ");
//        inOrder(root);
//        System.out.println();
//    }
//}

import com.sun.source.tree.BreakTree;

public class TreeImplMethods {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    static Node root;
    static Node insert(Node root,int data){
        if(root == null)
            return new Node(data);
        if(data<root.data){
            root.left = insert(root.left,data);
        }
        else {
            root.right = insert(root.right,data);
        }
        return root;
    }
    static boolean search(Node root,int data){
        if(root.data != data)
            return false;
        if(root.data == data)
            return true;
        if(data<root.data)
            return search(root.left,data);
        else{
            return search(root.right,data);
        }
    }
    static void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    static int height(Node root){
        if(root == null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

    public static void main(String[] args){
        root = insert(root,1);
        root = insert(root,2);
        root = insert(root,5);
        preOrder(root);
        inOrder(root);
        postOrder(root);
        System.out.println(search(root,2));

    }
}


























