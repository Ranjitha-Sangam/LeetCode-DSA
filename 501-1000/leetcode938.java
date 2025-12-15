
DATE :15-DEC-2025
LEVEL : Easy
TOPIC : Binary Search Tree

class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        if(root.val>=low && root.val<=high){
            sum+=root.val;
            rangeSumBST(root.left,low,high);
            rangeSumBST(root.right,low,high);
        }else if(root.val<=low){
            rangeSumBST(root.right,low,high);
        }else{
            rangeSumBST(root.left,low,high);
        }
        return sum;
    }
}