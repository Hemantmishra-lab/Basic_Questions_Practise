package Tree;

public class TreeAllMethods {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    static Node root;
    static Node insert(Node root,int data){
        if(root == null){
            return new Node(data);
        }
        if(root.data>data){
            root.left = insert(root.left,data);
        }
       root.right = insert(root.right,data);
        return root;
    }

    static boolean serach(Node root,int data){
        if(root == null)
            return false;
        if(root.data == data){
            return true;
        }
        if(root.data>data){
           return serach(root.left,data);
        }
        else{
            return serach(root.right,data);
        }
    }

    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    static int maximum(Node root){
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(Math.max(maximum(root.left),maximum(root.right)),root.data);
    }

    static int minimum(Node root){
        if(root == null)
            return Integer.MAX_VALUE;
        return Math.min(Math.min(minimum(root.left),minimum(root.right)),root.data);
    }

    static int sumAllNode(Node root){
        if(root == null){
            return 0;
        }
        return sumAllNode(root.left) + sumAllNode(root.right) + root.data;
    }

    static int countAllNode(Node root){
        if(root == null){
            return 0;
        }
        return countAllNode(root.left) + countAllNode(root.right) + root.data;
    }


    public static void main(String[] args){
        root = insert(root,1);
        insert(root,2);
        insert(root,10);
        insert(root,5);
        insert(root,7);
        insert(root,9);
        serach(root,10);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println(maximum(root));
        System.out.println(maximum(root));
        System.out.println(countAllNode(root));
        System.out.println(countAllNode(root));
    }
}
