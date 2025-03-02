
class Solution {
    int max=Integer.MIN_VALUE;
    public int maxSum(TreeNode root){
        if(root==null) return 0;
        int left=maxSum(root.left);
        int right=maxSum(root.right);
        int l=left<0?0:left;
        int r=right<0?0:right;
        max=Math.max(max,root.val+l+r);
        return root.val+Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return max;
    }
}
