
DATE : 25-FEB-2026
LEVEL : Easy
TOPIC : Strings

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums,0,nums.length-1);
    }
    private TreeNode buildBST(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;

        TreeNode root=new TreeNode(nums[mid]);

        root.left=buildBST(nums,left,mid-1);
        root.right=buildBST(nums,mid+1,right);

        return root;
    }
}