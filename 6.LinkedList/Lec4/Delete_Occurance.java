class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp=head,ptr=null;
        while(head!=null){
            if(head.data==x){
                if(ptr==null){
                    temp=temp.next;
                }
                else if(head.next==null){
                    ptr.next=null;
                    break;
                }
                else{
                    ptr.next=head.next;
                    head.next.prev=ptr;
                }
            }
            else
                ptr=head;
            head=head.next;
        }
        return temp;
    }
}