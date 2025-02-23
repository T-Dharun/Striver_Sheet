/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public void flat(Node res,List<Integer> h){
        if(res==null) return;
        h.add(res.val);
        if(res.next==null && res.child==null){
            return;
        }
        if(res.child==null){
            flat(res.next,h);
        }
        else{
            flat(res.child,h);
            if(res.next!=null) flat(res.next,h);
        }
    }
    public Node flatten(Node head) {
        List<Integer> list=new ArrayList<>();
        Node ptr=null;
        Node temp=null;
        flat(head,list);
        for(int i:list){
            if(ptr==null) ptr=temp=new Node(i);
            else{
                temp.next=new Node(i);
                temp.next.prev=temp;
                temp=temp.next;
            }
            
        }
        
        return ptr;
    }
}
