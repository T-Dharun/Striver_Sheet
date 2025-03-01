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
    public List<Integer> reverse(List<Integer> list){
        List<Integer> ls=new ArrayList<>();
        int n=list.size();
        for(int i=n-1;i>=0;i--) ls.add(list.get(i));
        return ls;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return list;
        queue.add(root);
        Boolean flag=false;
        while(queue.size()!=0){
            List<Integer> level=new ArrayList<>();
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode temp=queue.poll();
                level.add(temp.val);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            System.out.println(level.toString());
            if(flag){
                list.add(reverse(level));
            }
            else list.add(level);
            flag=!flag;
        }
        return list;
    }
}
