package Tree;

//public class InsrtionBstSortInOrder {
//    static class Node{
//        int data;
//        Node left,right;
//        Node(int data){
//            this.data = data;
//        }
//    }
//
//    static Node root;
//
//    static Node insert(Node root,int data){
//        if(root==null)
//            return new Node(data);
//        if(root.data>data){
//            root.left = insert(root.left,data);
//        }
//        else {
//            root.right = insert(root.right, data);
//        }
//        return root;
//    }
//
//    static void InOrder(Node root){
//        if(root == null)
//            return;
//        InOrder(root.left);
//        System.out.print(root.data+" ");
//        InOrder(root.right);
//    }
//
//    static void main() {
//        root = insert(root,1);
//        root = insert(root,9);
//        root = insert(root,8);
//        root = insert(root,3);
//        root = insert(root,4);
//        InOrder(root);
//    }
//}
//
//import static Tree.InsrtionBstSortInOrder.Node.*;

//public class InsrtionBstSortInOrder {
//    static class Node{
//        int data;
//        Node left,right;
//        Node(int data){
//            this.data = data;
//        }
//    }
//
//    static Node root;
//
//    static Node insert(Node root,int data){
//        if(root == null)
//            return new Node(data);
//        if(root.data>data){
//            root.left = insert(root.left,data);
//        }
//        else {
//            root.right = insert(root.right,data);
//        }
//        return root;
//    }
//
//    static void inOrder(Node root){
//        if(root == null)
//            return;
//        inOrder(root.left);
//        System.out.print(root.data+" ");
//        inOrder(root.right);
//    }
//
//    static void main() {
//        root = insert(root,1);
//        insert(root,9);
//        insert(root,2);
//        insert(root,5);
//        inOrder(root);
//    }
//}
//public class InsrtionBstSortInOrder {
//    static class Node{
//        int data;
//        Node left,right;
//        Node(int data){
//            this.data = data;
//        }
//        public static Node root;
//        static Node insert(Node root,int data){
//            if(root == null)
//                return new Node(data);
//            if(root.data>data){
//                root.left = insert(root.left,data);
//            }
//            else{
//                root.right = insert(root.right,data);
//            }
//            return root;
//        }
//        static void inOrder(Node root){
//            if(root == null)
//                return;
//            inOrder(root.left);
//            System.out.print(root.data+" ");
//            inOrder(root.right);
//        }
//        static Node deletebst(Node root,int key){
//            if(root == null)
//                return null;
//            if(root.data>key){
//                root.left = deletebst(root.left,key);
//            }
//            else if(root.data<key){
//                root.right = deletebst(root.right,key);
//            }
//            else{
//                if(root.left == null)
//                    return root.right;
//                else if(root.right == null)
//                    return root.left;
//                Node minNode = minValueNode(root.right);
//                root.data = minNode.data;
//                root.right = deletebst(root.right,minNode.data);
//            }
//            return root;
//        }
//        private static  Node minValueNode(Node root){
//            while (root.left!=null){
//                root = root.left;
//            }
//            return root;
//        }
//    }
//
//    public static void main(String[] args) {
//        root = insert(root,1);
//        insert(root,3);
//        insert(root,6);
//        insert(root,10);
//        inOrder(root);
//        deletebst(root,3);
//        System.out.println();
//        inOrder(root);
//    }
//}

//public class InsrtionBstSortInOrder {
//    static class Node{
//        int data;
//        Node left,right;
//        Node(int data){
//            this.data = data;
//        }
//    }
//    static Node root;
//    public static Node insert(Node root,int data){
//        if(root  == null)
//            return null;
//        if(root.data>data){
//            root.left = insert(root.left,data);
//        }
//        else if(root.data<data){
//
//        }
//    }
//}