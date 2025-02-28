
import java.util.List;
import java.util.*;
public class Solution {
    public static void traversal(TreeNode root, List<Integer> in,List<Integer> pre,List<Integer> post){
        if(root==null) return;
        pre.add(root.data);
        traversal(root.left,in,pre,post);
        in.add(root.data);
        traversal(root.right,in,pre,post);
        post.add(root.data);
    }
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> pre=new ArrayList<>();
        List<Integer> post=new ArrayList<>();
        traversal(root,in,pre,post);
        list.add(in);
        list.add(pre);
        list.add(post);
        return list;

    }
}
