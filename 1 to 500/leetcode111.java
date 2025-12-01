
DATE : 01-DEC-2025
LEVEL : Easy
TOPIC : Binary Tree

class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftHeight=minDepth(root.left);
        int rightHeight=minDepth(root.right);
        //when one child is null (spcl conditions)
        if (root.left == null) return rightHeight + 1;
        if (root.right == null) return leftHeight + 1;

        return Math.min(leftHeight,rightHeight)+1;
    }
}


We dnt use  Math.min() when one child is null.
for ex : 1   3
        /     \
       2       5
       in these conditions we dnt use Math.min()

    answer is returnd from one of the 2 spcl conditons
