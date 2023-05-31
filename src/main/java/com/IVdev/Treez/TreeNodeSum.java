package com.IVdev.Treez;

import org.w3c.dom.Node;
import javax.swing.tree.TreeNode;

/*  Task: find the path with the maximum sum from the root of the tree to the leaf.
    Input receives vertex of the tree - TreeNode.
*/
public class TreeNodeSum {
    private int value;
    private TreeNode root;
    private TreeNode leftChild;
    private Node rightChild;

    public static void main(String[] args) {}

    public TreeNode getLeftChild(TreeNode node) {
        return this.leftChild;
    }
    public TreeNode getRightChild(TreeNode node) {
        return this.leftChild;
    }
    public int val(TreeNode node) {
        return this.value;
    }

    int maxPathSum (TreeNode root) {
        if(root == null) return 0;
        int maxLeftPath = maxPathSum(getLeftChild(root));
        int maxRightPath = maxPathSum(getRightChild(root));
        return Math.max(maxLeftPath, maxRightPath) + val(root);
    }

    /*
    Salt: The function is called recursively for the left and right child of each vertex.
    Using the max() function, both sub-branches + the vertex value are compared.
    This will be the solution to the problem.
    */
}
