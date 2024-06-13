class Solution {
    public void deleteNode(ListNode node) {
        while(node.next!=null){
            node.val=node.next.val;
           // System.out.println(node.val);
            ListNode temp=node.next;
            if(temp.next==null){
                node.next=null;
            }
            if(node.next!=null)
            node=node.next;
        }
        System.out.println(node.val);
    }
}