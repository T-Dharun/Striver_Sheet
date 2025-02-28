class Solution {
    // Function to return list containing elements of left view of binary tree.
    void print(Node root,int level,ArrayList<Integer> list){
        if(root==null) return;
        if(list.size()<level) list.add(root.data) ;
        print(root.left,level+1,list);
        print(root.right,level+1,list);
    }
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        print(root,1,list);
        return list;
    }
}
