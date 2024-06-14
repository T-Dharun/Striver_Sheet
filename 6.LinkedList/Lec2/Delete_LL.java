
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
        if(head==null || x==1) return head.next;
        int cnt=0;
        Node temp=head;
        Node ptr=null;
        while(temp!=null){
            cnt++;
            if(cnt==x){
                ptr.next=temp.next;
                break;
            }
            ptr=temp;
            temp=temp.next;
        }
        return head;
        
    }
}