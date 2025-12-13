
DATE : 13-DEC-2025
LEVEL : Easy
TOPIC : Binary Search Tree 

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        if(root.val>val){
           return searchBST(root.left,val);
        }else{
           return searchBST(root.right,val);
        }
    }
}