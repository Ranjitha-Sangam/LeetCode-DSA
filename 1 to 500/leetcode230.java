
DATE : 21-DEC-2025
LEVEL : Medium
TOPIC : Binary Search Tree

class Solution {
    int count=0;
    int ans=-1;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }
    private void inorder(TreeNode root,int k){
        if(root==null) return;
        
        inorder(root.left,k);
        count++;
        if(count==k){
            ans=root.val;
            return;
        }
        inorder(root.right,k);
    }
}


//Approach 2

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k - 1);
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

