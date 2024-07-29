
class Solution {
    ListNode reverse(ListNode head){
        ListNode ptr=null,temp=head;
        while(head!=null){
            temp=head.next;
            head.next=ptr;
            ptr=head;
            head=temp;
        }
        return ptr;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=new ListNode(-1);
        ListNode ans=temp;
        ListNode ptr=head;
        int cnt=1;
        while(head!=null){
            if(cnt==k){
                ListNode hey=head.next;
                head.next=null;
                temp.next=reverse(ptr);
                while(temp.next!=null) temp=temp.next;
                System.out.println();
                head=ptr=hey;
                cnt=0;
            }
            else
            head=head.next;
            cnt++;
        }
        temp.next=ptr;
        return ans.next;
    }
}