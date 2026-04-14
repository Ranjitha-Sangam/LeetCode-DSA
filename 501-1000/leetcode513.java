
DATE : 14-April-2026
LEVEL : Medium
TOPIC : DFS

class Solution {
    int maxDepth=-1;
    int result=0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return result;
    }
    private void dfs(TreeNode node,int depth){
        if(node==null){
            return;
        }
        if(depth>maxDepth){
            maxDepth=depth;
            result=node.val;
        }
        dfs(node.left,depth+1);
        dfs(node.right,depth+1);
    }
}


DATE : 14-April-2026
LEVEL : Medium
TOPIC : BFS

//using BFS
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int ans=root.val;

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(i==0) ans=node.val;
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
        }
        return ans;
    }
}