
DATE : 23-DEC-2025
LEVEL : Medium
TOPIC : Binary Search Tree

class Solution {
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        reverseInorder(root);
        return root;
    }
    private void reverseInorder(TreeNode node){
        if(node==null){
            return;
        }
//Inorder reverse Traversal(right,root,left)
        reverseInorder(node.right);
        sum+=node.val;
        node.val=sum;
        reverseInorder(node.left);
    }
}