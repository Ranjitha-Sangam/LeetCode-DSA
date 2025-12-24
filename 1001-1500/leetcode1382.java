
DATE : 24-DEC-2025
LEVEL : Medium
TOPIC : Binary Search Tree

class Solution {
    public TreeNode balanceBST(TreeNode root) {
        //finding inorder
        ArrayList<Integer> inorder = new ArrayList<>();
        inorder(root,inorder);
        
        //constructing BST using inorder list
        root=createBST(inorder,0,inorder.size()-1);
        return root;
    }
    public void inorder(TreeNode root,ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        inorder(root.left,inorder);
        inorder.add(root.val);
        inorder(root.right,inorder);
    }
    public TreeNode createBST(ArrayList<Integer> inorder,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        TreeNode root=new TreeNode(inorder.get(mid));
        root.left=createBST(inorder,st,mid-1);
        root.right=createBST(inorder,mid+1,end);
        return root;
    }
}