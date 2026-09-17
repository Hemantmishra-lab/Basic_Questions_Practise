package Tree;

//public class TreeImplMethod2 {
//    static class Node{
//        int data;
//        Node left ,right;
//        Node(int data){
//            this.data = data;
//        }
//    }
//    static Node root;
//    static Node insert(Node root,int data){
//        if(root==null){
//            return new Node(data);
//        }
//        if(root.data>data){
//            root.left = insert(root.left,data);
//        }
//        else{
//            root.right = insert(root.right,data);
//        }
//        return root;
//    }
//
//    static boolean search(Node root,int data){
//        if(root == null)
//            return false;
//        if(root.data == data)
//            return true;
//        if(data<root.data){
//            return search(root.left,data);
//        }
//        else {
//            return search(root.right,data);
//        }
//    }
//
//    static void InOrder(Node root){
//        if(root==null){
//            return;
//        }
//        InOrder(root.left);
//        System.out.print(root.data+" ");
//        InOrder(root.right);
//    }
//
//    static void PreOrder(Node root){
//        if(root == null)
//            return;
//        System.out.print(root.data+" ");
//        PreOrder(root.left);
//        PreOrder(root.right);
//
//    }
//
//    static void PostOrder(Node root){
//        if(root==null)
//            return;
//        PostOrder(root.left);
//        PostOrder(root.right);
//        System.out.print(root.data+" ");
//
//    }
//
//    public static void main(String []args){
//        root = insert(root,1);
//        insert(root,2);
//        insert(root,3);
//        insert(root,4);
//        insert(root,5);
//        insert(root,6);
//        insert(root,7);
//        System.out.println(search(root,3));
//        InOrder(root);
//        System.out.println();
//        PreOrder(root);
//        System.out.println();
//        PostOrder(root);
//        System.out.println();
//    }
//}


//public class TreeImplMethod2 {
//    static class Node{
//        int data;
//        Node left,right;
//        Node(int data){
//            this.data = data;
//        }
//    }
//    static Node root;
//    static Node insert(Node root,int data){
//        if(root==null){
//            return new Node(data);
//        }
//        if(root.data>data){
//            root.left = insert(root.left,data);
//        }
//        if(root.data<data){
//            root.right = insert(root.right,data);
//        }
//        return root;
//    }
//
//    public static  boolean search(Node root,int data){
//        if(root==null)
//            return false;
//        if(root.data==data)
//            return true;
//        if(root.data>data){
//            return search(root.left,data);
//        }
//        else{
//            return search(root.right,data);
//        }
//    }
//
//    public static void InOrder(Node root){
//        if(root==null){
//            return;
//        }
//        InOrder(root.left);
//        System.out.print(root.data+" ");
//        InOrder(root.right);
//    }
//
//    public static void main(String[] args){
//        root = insert(root,1);
//        insert(root,2);
//        insert(root,3);
//        insert(root,4);
//        insert(root,5);
//        System.out.println(search(root,4));
//        InOrder(root);
//    }
//}

