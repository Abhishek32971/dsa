import java.util.*;

public class SumOfLeftLeaves404 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    // static int sum(TreeNode root) {
    //     return (root.left!=null?root.left.val:0) + (root.left!=null?sum(root.left):0) + (root.right!=null?sum(root.right):0) ;
    // }                             
    // wrong for the test case where left node has a left leaf node (it adds the left node as well)



    // static int sum(TreeNode root) {
    //     return (root.left!=null ?(root.left.left==null && root.left.right== null?root.left.val:0):0) + (root.left!=null?sum(root.left):0) + (root.right!=null?sum(root.right):0) ;
    // }
    // gave the answer "0"

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum = root.left.val;
        }
        
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        
        return sum;
    }
    // optimal solution first checks if the current node is null then the comba of  first and second sol logic and finally left and right. 


    public static void main(String[] args) {
        // Create tree nodes with the specified values
        TreeNode node3 = new TreeNode(3);
        TreeNode node1= new TreeNode(1);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);

        // Build the binary tree structure
        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;

        // Print the values of the nodes to verify the tree structure
        System.out.println("Root Node Value: " + node3.val);
        System.out.println("Left Child of Root: " + node3.left.val);
        System.out.println("Right Child of Root: " + node3.right.val);
        System.out.println("Left Child of 20: " + node20.left.val);
        System.out.println("Right Child of 20: " + node20.right.val);
        System.out.println("sum of left leaves"+sum(node1));
    }

}
