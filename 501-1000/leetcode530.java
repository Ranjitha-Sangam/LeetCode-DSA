
DATE : 14-DEC-2025
LEVEL : Easy
TOPIC : Binary Search Tree

class Solution {
    Integer prev=null;
    int minDiff=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null){
            minDiff=Math.min(minDiff,root.val-prev);
        }
        prev=root.val;
        inorder(root.right);
    }
}

//prev- stores previous value of inorder (BST inorder is sorted)