/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode reverse(ListNode head){
        ListNode ptr=head;
        ListNode prev=null, next=null;
        while(ptr!=null){
            next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
        }
        return  prev;
    }
    public boolean isPalindrome(ListNode head) {
    //    ListNode ptr=reverse(head);
        if(head==null ||head.next==null ) return true;
        ListNode fast=head.next,slow=head;
        ListNode temp=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode rev=reverse(slow.next);
       // slow.next=null;
        while(rev!=null){
            if(head.val!=rev.val) return false;
            head=head.next;
            rev=rev.next;
        }
        return true;
    }
}