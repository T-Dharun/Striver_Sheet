class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ptr,prev=null,next=null;
        ptr=head;
        while(ptr!=null){
            next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
        }
        return prev;
    }
}