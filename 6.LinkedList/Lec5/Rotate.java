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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode fast=head,slow=head;
        int cnt=0;
        while(fast!=null){
            fast=fast.next;
            cnt++;
        }
        k%=cnt;
        if(k==0) return head;
        fast=head;
        while( k != 0){
            fast=fast.next;
            k--;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        fast.next=head;
        head=slow.next;
        slow.next=null;
        return head;
    }
}