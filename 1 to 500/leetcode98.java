
DATE : 22-March-2026
LEVEL : Medium
TOPIC : Trees

class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean isValidate(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.val<=min || root.val>=max){
            return false;
        }
        return isValidate(root.left,min,root.val) && isValidate(root.right,root.val,max);
    }
}