package Tree;

public class AllTreeMethods {
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
            return null;
        }
        if(root.data>data){
            root.left = insert(root.left,data);
        }
        else{
            root.right = insert(root.right,data);
        }
        return root;
    }
    static boolean search(Node root,int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        if(data<root.data){
            return search(root.left,data);
        }
       return  search(root.right,data);
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
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    static int maxValue(Node root){
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(Math.max(maxValue(root.left),maxValue(root.right)),root.data);
    }
    static int minValue(Node root){
        if(root == null)
            return Integer.MAX_VALUE;
        return Math.min(Math.min(minValue(root.left),minValue(root.right)),root.data);
    }
    static int count(Node root){
        if(root == null)
            return 0;
        return count(root.left) + count(root.right) + 1;
    }
    static int sumAllNode(Node root){
        if(root == null)
            return 0;
        return sumAllNode(root.left) + sumAllNode(root.right) + root.data;
    }
    static int maxDiameter = 0;
    static int diameterTree(Node root){
          heightDiameter(root);
          return maxDiameter;
    }

    private static int heightDiameter(Node root){
        if(root == null)
            return 0;
        int left = heightDiameter(root.left);
        int right = heightDiameter(root.right);
        maxDiameter = Math.max(maxDiameter,left + right);
        return Math.max(left,right) + 1;
    }
    static boolean isBalanced(Node root){
        if(calcisBalanced(root)!=-1){
            return true;
        }
        return false;
    }
    private static int calcisBalanced(Node root){
        if(root == null)
            return 0;
        int left = calcisBalanced(root.left);
        if(left == -1){
            return -1;
        }
        int right = calcisBalanced(root.right);
        if(right == -1){
            return -1;
        }
        if(Math.abs(right-left)>1){
            return -1;
        }
        return Math.max(left,right) + 1;
    }
    static Node mirror(Node root){
        if(root == null)
            return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        root.left = mirror(root.left);
        root.right = mirror(root.right);
        return root;
    }
    static boolean isIdentical(Node root1,Node root2){
        if(root1==null || root2==null)
            return false;
        if(root1==null && root2==null){
            return true;
        }
        return isIdentical(root1.left,root1.left) && isIdentical(root1.right,root2.right) && (root1.data==root2.data);
    }
    static Node deleteBSTNode(Node root,int key){
        if(root == null)
            return null;
        if(root.data>key){
            root.left = deleteBSTNode(root.left,key);
        }
        else if(root.data<key){
            root.right = deleteBSTNode(root.right,key);
        }
        else{
            Node MinNode = MinNodeValue(root.right);
            root.data = MinNode.data;
            root.right = deleteBSTNode(MinNode,root.data);
        }
        return root;
    }
    private static Node MinNodeValue(Node root){
        while (root.left!=null){
            root = root.left;
        }
        return root;
    }
}
