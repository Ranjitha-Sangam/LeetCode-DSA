
DATE : 26-March-2026
LEVEL : Easy
TOPIC : Binary Trees

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
    private void inorder(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}