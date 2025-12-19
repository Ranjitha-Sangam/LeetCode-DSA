
DATE : 19-DEC-2025
LEVEL : Easy
TOPIC : Binary Search Tree and HashSet

class Solution {
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null){
            return false;
        }
        if(set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        return findTarget(root.left,k)||findTarget(root.right,k);
    }
}