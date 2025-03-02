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
    public TreeNode build(int[] inorder,int[] postorder,int instart,int inend,int poststart,int postend,HashMap<Integer,Integer> hash){
        if(instart>inend || poststart>postend) return null;
        TreeNode ptr=new TreeNode(postorder[postend]);
        int inroot=hash.get(postorder[postend]);
        int numRight=inend-inroot;
        ptr.right=build(inorder,postorder,inroot+1,inend,postend-numRight,postend-1,hash);
        ptr.left=build(inorder,postorder,instart,inroot-1,poststart,postend-numRight-1,hash);
        return ptr;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int n=inorder.length;
        int m=postorder.length;
        for(int i=0;i<n;i++) hash.put(inorder[i],i);
        return build(inorder,postorder,0,n-1,0,m-1,hash);
    }
}
