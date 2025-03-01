
class Solution {
    public static void traverse(Node root, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ls){
        
        if(root==null) return;
        if(root.left==null && root.right==null ){
            ls.add(new ArrayList<>(list));
            return;
        }
        if(root.left!=null){
            list.add(root.left.data);
            traverse(root.left,list,ls);
            list.remove(list.size()-1);
        }
        if(root.right!=null){
            list.add(root.right.data);
            traverse(root.right,list,ls);
            list.remove(list.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> ls=new ArrayList<>();
        if(root == null) return list;
        ls.add(root.data);
        traverse(root,ls,list);
        return list;
    }
}
