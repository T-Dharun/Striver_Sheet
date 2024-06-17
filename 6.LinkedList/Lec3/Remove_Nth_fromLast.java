
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr=head;
        int cnt=0;
        while(ptr!=null){
            cnt++;
            ptr=ptr.next;
        }
        n=cnt-n;
        ptr=head;
        ListNode prev=head;
        while(ptr!=null){
            System.out.println(n);
            if(n==0){
                if(ptr==head) return head.next;
                prev.next=ptr.next;
                break;
            }
            n--;
            prev=ptr;
            ptr=ptr.next;
        }
        return head;
    }
}