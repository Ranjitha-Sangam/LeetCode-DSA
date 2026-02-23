
DATE : 23-FEB-2026
LEVEL : Easy
TOPIC : Binary Tree

//brute force O(n)

class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;  // base case
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}



//optimal--------------> O(log² n)

 class Solution{
    public int countNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftheight=getLeftHeight(root);
        int rightheight=getRightHeight(root);

        if(leftheight==rightheight){
            return (1<<leftheight)-1; //2^h - 1  Bit is faster
            // return (int)Math.pow(2, leftheight) - 1;
            //we dont use math bcoz mathe internally works with double so 
            // Casting from double → int: Can introduce precision issues
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    private int getLeftHeight(TreeNode root){
        int height =0;
        while(root!=null){
            height++;
            root=root.left;
        }
        return height;
    }
    private int getRightHeight(TreeNode root){
        int height=0;
        while(root!=null){
            height++;
            root=root.right;
        }
        return height;
    }
 }



.