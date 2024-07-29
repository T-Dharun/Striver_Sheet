/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int difference(ListNode a,ListNode b){
        int cnt1=0,cnt2=0;
        while(a!=null){
            cnt1++;
            a=a.next;
        } 
        while(b!=null){
            cnt2++;
            b=b.next;
        }
        return cnt1-cnt2;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff=difference(headA,headB);
        if(diff>0)
            while(diff-- > 0) headA=headA.next;
        else
            while(diff++ < 0) headB=headB.next;
        while(headA!=null && headB!=null){
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}