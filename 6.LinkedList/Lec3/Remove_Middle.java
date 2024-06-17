
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head,fast=head;
        ListNode temp=null;
        if(head==null || head.next==null) return null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            temp=slow;
            slow=slow.next;
        }
        temp.next=slow.next;
        return head;
    }
}