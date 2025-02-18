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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode nhead=head;
        ListNode temp=head;
        while(head!=null){
          if(head.val!=temp.val){
            temp.next=head;
            temp=temp.next;
          }
          head=head.next;
        }
        if(temp!=null) temp.next=null;
        return nhead;
    }
}
