package Tree;

public class BSTDelete {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public Node deleteNode(Node root, int data) {
        if (root == null) return null;

        if (root.data > data) {
            root.left = deleteNode(root.left, data);
        } else if (root.data < data) {
            root.right = deleteNode(root.right, data);
        } else {
            // Case 1 & 2: One child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node minNode = minimum(root.right);
            root.data = minNode.data;
            root.right = deleteNode(root.right, minNode.data);
        }
        return root;
    }

    private Node minimum(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Helper method to print the tree in-order to verify deletion
    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Fixed main method signature with standard arguments
    public static void main(String[] args) {
        BSTDelete tree = new BSTDelete();

        /* Formed Tree:
              50
             /  \
            30   70
           /  \  /  \
          20  40 60  80
        */
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.print("Original Tree (Inorder): ");
        tree.inorder(root);
        System.out.println();

        // Delete a leaf node (no children)
        root = tree.deleteNode(root, 20);

        // Delete a node with one child
        root = tree.deleteNode(root, 30);

        // Delete a node with two children
        root = tree.deleteNode(root, 50);

        System.out.print("Modified Tree (Inorder): ");
        tree.inorder(root);
        System.out.println();
    }
}
