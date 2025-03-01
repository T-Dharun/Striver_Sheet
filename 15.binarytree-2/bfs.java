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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return list;
        queue.add(root);
        while(queue.size()!=0){
            List<Integer> level=new ArrayList<>();
            int len=queue.size();
            for(int i=0;i<len;i++){
                TreeNode cur=queue.poll();
                level.add(cur.val);
                // System.out.println(cur);
                if(cur.left!=null) queue.add(cur.left);
                if(cur.right!=null) queue.add(cur.right);
            }
            list.add(level);
        }
        return list;
    }
}
