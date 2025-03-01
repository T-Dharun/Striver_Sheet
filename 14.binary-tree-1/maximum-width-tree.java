/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair{
    TreeNode node;
    int id;
    public Pair(TreeNode node, int id){
        this.node=node;
        this.id=id;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(root,0));
        int max=0;
        while(queue.size()!=0){
            int n=queue.size();
            int first=0,second=0;
            for(int i=0;i<n;i++){
                Pair temp=queue.poll();
                TreeNode ptr=temp.node;
                int id=temp.id;
                if(i==0) first=id;
                second=id;
                if(ptr.left!=null) queue.add(new Pair(ptr.left,2*id));
                if(ptr.right!=null) queue.add(new Pair(ptr.right,2*id+1));
            }
            max=Math.max(max,second-first+1);
        }
        return max;
    }
}
