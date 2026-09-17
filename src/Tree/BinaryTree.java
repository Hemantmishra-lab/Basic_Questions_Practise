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

import java.util.ArrayList;
import java.util.List;

//public class TreeImplMethods {
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
//        if(data<root.data){
//            root.left = insert(root.left,data);
//        }
//        else {
//            root.right = insert(root.right,data);
//        }
//        return root;
//    }
//    static boolean search(Node root,int data){
//        if(root.data != data)
//            return false;
//        if(root.data == data)
//            return true;
//        if(data<root.data)
//            return search(root.left,data);
//        else{
//            return search(root.right,data);
//        }
//    }
//    static void inOrder(Node root){
//        if(root == null)
//            return;
//        inOrder(root.left);
//        System.out.println(root.data+" ");
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
//    static int height(Node root){
//        if(root == null)
//            return 0;
//        return Math.max(height(root.left),height(root.right))+1;
//    }
//
//    public static void main(String[] args){
//        root = insert(root,1);
//        root = insert(root,2);
//        root = insert(root,5);
//        preOrder(root);
//        inOrder(root);
//        postOrder(root);
//        System.out.println(search(root,2));
//
//    }
//}

//public class TreeImplMethods {
//    static class Node{
//        int data;
//         Node left,right;
//         Node(int data){
//             this.data = data;
//         }
//    }
//    static Node root;
//    static Node insert(Node root,int data){
//        if(root==null)
//            return new Node(data);
//        if(data<root.data){
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
//        if(data<root.data)
//            return search(root.left,data);
//        else
//            return search(root.right,data);
//    }
//
//    static void inOrder(Node root){
//        if(root == null)
//            return;
//        inOrder(root.left);
//        System.out.print(root.data);
//        inOrder(root.right);
//        System.out.println();
//    }
//
//    static void preOrder(Node root){
//        if(root == null)
//            return;
//        System.out.print(root.data);
//        preOrder(root.left);
//        preOrder(root.right);
//        System.out.println();
//    }
//
//    static void postOrder(Node root){
//        if(root == null)
//            return;
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.data);
//        System.out.println();
//    }
//
//    static int height(Node root){
//        if(root == null)
//            return 0;
//        return Math.max(height(root.left),height(root.right))+1;
//    }
//
//    static int count(Node root){
//        if(root==null)
//            return 0;
//        return count(root.left) +  count(root.right) + 1;
//    }
//
//    static int Maximum(Node root){
//        if(root == null)
//            return Integer.MIN_VALUE;
//        return Math.max(root.data,Math.max(Maximum(root.right),Maximum(root.left)));
//    }
//
//    static int Minimum(Node root){
//        if(root == null)
//            return Integer.MAX_VALUE;
//        return Math.min(root.data,Math.min(Minimum(root.left),Minimum(root.right)));
//    }
//
//    static int sumOfAllNodes(Node root){
//        if(root == null)
//            return 0;
//        return sumOfAllNodes(root.left) + sumOfAllNodes(root.right) + root.data;
//    }
//
//    public static void main(String[] args){
//        root = insert(root,1);
//        insert(root,2);
//        insert(root,3);
//        insert(root,4);
//        insert(root,5);
//        search(root,3);
//        preOrder(root);
//        inOrder(root);
//        postOrder(root);
//        System.out.println(count(root));
//        System.out.println(sumOfAllNodes(root));
//    }
//}


//public class TreeImplMethods{
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
//        if(data<root.data){
//          root.left = insert(root.left,data);
//        }
//        else {
//          root.right = insert(root.right, data);
//        }
//        return root;
//    }
//
//    static boolean search(Node root,int data){
//        if(root==null)
//            return false;
//        if(root.data==data)
//            return true;
//        if(data<root.data){
//           return  search(root.left,data);
//        }
//        else{
//           return  search(root.right,data);
//        }
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
//    static void preOrder(Node root){
//        if(root == null)
//            return;
//        System.out.print(root.data+" ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }
//
//    static void postOrder(Node root){
//        if(root == null)
//            return;
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.data);
//    }
//
//    static int height(Node root){
//        if(root==null)
//            return 0;
//        return Math.max(height(root.left),height(root.right)) + 1;
//    }
//
//    static int count(Node root){
//        if(root == null){
//            return 0;
//        }
//        return count(root.left) + count(root.right) + 1;
//    }
//    static int MaxValue(Node root){
//        if(root == null)
//            return Integer.MIN_VALUE;
//        return Math.max(Math.max(MaxValue(root.left),MaxValue(root.right)),root.data);
//    }
//
//
//}



//public class TreeImplMethods {
//    static class Node{
//        Node left,right;
//        int data;
//        public Node(int data){
//            this.data = data;
//        }
//    }
//
//    static Node root;
//
//    static  Node insert(Node root,int data){
//        if(root == null){
//            return new Node(data);
//        }
//        if(root.data>data){
//            root.left= insert(root.left,data);
//        }
//        else if(root.data<data){
//            root.right =  insert(root.right,data);
//        }
//        return root;
//    }
//
//    static boolean search(Node root,int data){
//        if(root == null)
//            return false;
//        if(root.data == data)
//            return true;
//        if(root.data>data){
//            return search(root.left,data);
//        }
//        else
//            return search(root.right,data);
//    }
//
//    static void Preorder(Node root){
//        if(root == null)
//            return;
//        System.out.print(root.data);
//        Preorder(root.left);
//        Preorder(root.right);
//    }
//
//    static void InOrder(Node root){
//        if(root == null)
//            return;
//        InOrder(root.left);
//        System.out.println(root.data);
//        InOrder(root.right);
//    }
//
//    static void PostOrder(Node root){
//        if(root == null)
//            return;
//        PostOrder(root.left);
//        PostOrder(root.right);
//        System.out.println(root.data);
//    }
//
//    static int sumOfAllNode(Node root){
//        if(root == null)
//            return 0;
//        return sumOfAllNode(root.left) + sumOfAllNode(root.right) + root.data;
//    }
//
//    static int max(Node root){
//        if(root == null)
//            return Integer.MIN_VALUE;
//        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
//    }
//
//    static int height(Node root){
//        if(root == null)
//            return 0;
//        return Math.max(height(root.left),height(root.right))+1;
//    }
//
//
//    public static void main(String[] args){
//        root = new Node(1);
//        insert(root,2);
//        insert(root,3);
//        insert(root,4);
//        insert(root,5);
//        System.out.println(search(root,2));
//       }
//}

//public class TreeImplMethods{
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
//    static int height(Node root){
//        if(root==null)
//            return 0;
//        return Math.max(height(root.left),height(root.right))+1;
//    }
//
//    static int diameter(Node root){
//        if(root == null)
//            return 0;
//        int leftHeight = height(root.left);
//        int rightHeight = height(root.right);
//
//        int leftDiameter = diameter(root.left);
//        int rightDiameter = diameter(root.right);
//
//        return Math.max(leftHeight+rightHeight,Math.max(leftDiameter,rightDiameter));
//    }
//
//    public static void main(String[] args){
//        root = insert(root,1);
//        insert(root,20);
//        insert(root,3);
//        insert(root,4);
//        insert(root,5);
//        System.out.println(height(root));
//        System.out.println(diameter(root));
//    }
//}

//public class TreeImplMethods {
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
//    public static void diameter(Node root){
//        System.out.println(height(root));
//    }
//
//    private static int height(Node root){
//        int maxD = 0;
//        if(root == null)
//            return 0;
//        int leftHeight = height(root.left);
//        int rightHeight = height(root.right);
//        maxD = Math.max(maxD,leftHeight+rightHeight);
//        return Math.max(leftHeight,rightHeight) + 1;
//    }
//    public static void main(String[] args){
//        root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        diameter(root);
//    }
//}



//class Node {
//    int data;
//    Node left, right;
//
//    public Node(int data) {
//        this.data = data;
//        left = right = null;
//    }
//}
//
//public class BinaryTree {
//    private int maxDiameter = 0;
//
//    // Wrapper method to match standard signatures
//    public int getDiameter(Node root) {
//        maxDiameter = 0; // Reset tracker for fresh execution
//        calculateHeight(root);
//        return maxDiameter;
//    }
//
//    // Helper function: Returns height, updates diameter on the fly
//    private int calculateHeight(Node root) {
//        if (root == null) {
//            return 0;
//        }
//
//        // Post-order traversal: Go deep into subtrees first
//        int leftHeight = calculateHeight(root.left);
//        int rightHeight = calculateHeight(root.right);
//
//        // Update the global diameter if the path through this node is longer
//        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
//
//        // Return the height of the current subtree to the parent call
//        return Math.max(leftHeight, rightHeight) + 1;
//    }
//
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//
//        // Creating a sample tree
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//
//        System.out.println("Diameter of the tree: " + tree.getDiameter(root));
//    }
//}

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
    }

    static Node root;

    static Node insert(Node root,int data){
        if(root == null)
            return new Node(data);
        if(root.data>data){
            root.left = insert(root.left,data);
        }
        else
            root.right = insert(root.right,data);
        return root;
    }

    static boolean search(Node root,int data){
        if(root == null)
            return false;
        if(root.data == data){
            return true;
        }
        if(root.data>data){
            return search(root.left,data);
        }
        else
           return search(root.right,data);
    }

    static void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
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
        return Math.max(height(root.left) , height(root.right)) + 1;
    }

    static int count(Node root){
        if(root == null)
            return 0;
        return count(root.left) + count(root.right) + 1;
    }

    static int sum(Node root){
        if(root == null)
            return 0;
        return sum(root.left)  + sum(root.right)  + root.data;
    }

    static int min(Node root){
        if(root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(min(root.left),min(root.right)));
    }

    static int max(Node root){
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }
    private static int maxD = 0;

    static void diameter(Node root){
        System.out.println(clacHeight(root));
    }

    private static int clacHeight(Node root){
        if(root == null)
            return 0;
        int left = clacHeight(root.left);
        int right = clacHeight(root.right);
        maxD = Math.max(maxD,left+right);
        return Math.max(left,right)+1;
    }

    static boolean isBalanced(Node root){
        return checkHeight(root) != -1;
    }

    private static int checkHeight(Node root){
        if(root == null)
            return 0;
        int left = checkHeight(root.left);
        if(left == -1)
            return -1;
        int right = checkHeight(root.right);
        if(right == -1)
            return -1;
        if(Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }

    static Node mirror(Node root){
        if(root == null)
            return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }

    static boolean isIdentical(Node root1,Node root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        return root1.data == root2.data && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
    }


}















