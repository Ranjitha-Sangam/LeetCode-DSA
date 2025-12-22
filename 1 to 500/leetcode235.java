
DATE : 22-DEC-2025
LEVEL : Medium
TOPIC : Binary Search Tree

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if(p.val<root.val && q.val<root.val){
                root=root.left;
            }else if(p.val>root.val && q.val>root.val){
                root=root.right;
            }else{
                return root;
            }
        }
        return null;
    }
}