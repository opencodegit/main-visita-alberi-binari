/* Preorder vs Inorder vs Postorder
 * Source: https://www.geeksforgeeks.org/dsa/preorder-vs-inorder-vs-postorder/
 */

package alberi;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class MainVisitaAlberiBinari {
    // Pre-order traversal
    public static void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " "); // Visit root
            preorderTraversal(root.left); // Recursively traverse left subtree
            preorderTraversal(root.right); // Recursively traverse right subtree
        }
    }

    // In-order traversal
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left); // Recursively traverse left subtree
            System.out.print(root.val + " "); // Visit root
            inorderTraversal(root.right); // Recursively traverse right subtree
        }
    }

    // Post-order traversal
    public static void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left); // Recursively traverse left subtree
            postorderTraversal(root.right); // Recursively traverse right subtree
            System.out.print(root.val + " "); // Visit root
        }
    }

    // Example tree
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // Pre-order traversal
        System.out.print("Pre-order traversal: ");
        preorderTraversal(root);
        System.out.println();

        // In-order traversal
        System.out.print("In-order traversal: ");
        inorderTraversal(root);
        System.out.println();

        // Post-order traversal
        System.out.print("Post-order traversal: ");
        postorderTraversal(root);
        System.out.println();
    }
}
