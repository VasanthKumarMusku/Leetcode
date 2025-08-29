/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int findLH(TreeNode root)
    {
        int h=1;
        while(root.left!=null)
        {
            h++;
            root=root.left;
        }
        return h;
    }
    int findRH(TreeNode root)
    {
        int h=0;
        while(root.right!=null)
        {
            h++;
            root=root.right;
        }
        return h;
    }
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        int lh=findLH(root);
        int rh=findRH(root);
        if(lh==rh)
            return (1<<lh)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}