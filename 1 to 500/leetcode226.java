
DATE : 02-DEC-2025
LEVEL : Easy
TOPIC : Binary Tree


class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode leftMirror=invertTree(root.left);
        TreeNode rightMirror=invertTree(root.right);
        root.left=rightMirror;
        root.right=leftMirror;

        return root;
        
    }
}