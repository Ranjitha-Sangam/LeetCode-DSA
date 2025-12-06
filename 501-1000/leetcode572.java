
DATE : 06-Dec-2025
LEVEL : Easy
TOPIC : Binary Tree

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(subRoot==null){
            return true;
        }
        if(root.val == subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    private static boolean isIdentical(TreeNode node,TreeNode subRoot){
        if(node==null && subRoot==null){
            return true;
        }
        if(node==null || subRoot==null || node.val!=subRoot.val){
            return false;
        }
        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right,subRoot.right)){
            return false;
        }
        return true;
    }
}