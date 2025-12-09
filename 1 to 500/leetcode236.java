
DATE : 09-DEC-2025
LEVEL : Medium
TOPIC : Binary Tree

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode leftlca=lowestCommonAncestor(root.left,p,q);
        TreeNode rightlca=lowestCommonAncestor(root.right,p,q);
        // both nodes are in right subtree
        if(leftlca==null){
            return rightlca;
        }
        // both nodes are in left subtree
        if(rightlca==null){
            return leftlca;
        }
        // one node on left, one on right
        return root;
    }
}