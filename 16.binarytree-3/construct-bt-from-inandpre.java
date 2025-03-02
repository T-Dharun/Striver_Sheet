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
    public TreeNode build(int[] preorder,int[] inorder,int prestart,int preend,int instart,int inend,HashMap<Integer,Integer>  map){
        if(prestart>preend || instart>inend) return null;
        TreeNode temp=new TreeNode(preorder[prestart]);
        int idx=map.get(preorder[prestart]);
        int num=idx-instart;
        temp.left=build(preorder,inorder,prestart+1,prestart+num,instart,idx-1,map);
        temp.right=build(preorder,inorder,prestart+num+1,preend,idx+1,inend,map);
        return temp;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        int m=inorder.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++) map.put(inorder[i],i);
        return build(preorder,inorder,0,n-1,0,m-1,map);
    }
}
