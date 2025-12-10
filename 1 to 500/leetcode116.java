
DATE : 10-DEC-2025
LEVEL : Medium
TOPIC : Binary Tree

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            Node prev=null;

            for(int i=0;i<size;i++){
                Node node=q.poll();
            //pointing prev node to nextnode(linkedlist)
                if(prev!=null){
                    prev.next=node;
                }
                prev=node;
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            //pointing last node to null
            prev.next=null;
        }
        return root;
    }
}