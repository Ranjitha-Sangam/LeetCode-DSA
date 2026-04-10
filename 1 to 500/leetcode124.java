
DATE : 10-April-2026
LEVEL : Hard
TOPIC : Trees

class Solution {
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }
    private int maxGain(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftGain=Math.max(0, maxGain(node.left));
        int rightGain=Math.max(0, maxGain(node.right));

        int currSumPath=node.val+leftGain+rightGain; 
        maxSum=Math.max(currSumPath,maxSum);
        return node.val+Math.max(leftGain,rightGain);
    }  
}