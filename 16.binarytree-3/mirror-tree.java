
class Solution {
    // Function to convert a binary tree into its mirror tree.
    Node mr(Node root){
        if(root==null) return null;
        Node left=mr(root.left);
        Node right=mr(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    void mirror(Node node) {
        mr(node);
    }
}
