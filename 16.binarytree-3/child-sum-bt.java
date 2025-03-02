
class Solution
{
    public static int isSum(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.data;
        int left=isSum(root.left);
        int right=isSum(root.right);
        //System.out.println(root.data+" "+left+" "+right);
        if(left==-1 || right== -1) return -1;
        if(left+right!=root.data) return -1;
        return right+left;
    }
    public static int isSumProperty(Node root)
    {
        int value=isSum(root);
        if(value==-1) return 0;
        return 1;
    }
}
