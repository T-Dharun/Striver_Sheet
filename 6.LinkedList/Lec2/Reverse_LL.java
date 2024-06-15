
public static Node reverseDLL(Node  head)
{
    Node ptr=head;
    Node prev=null;
    if(head==null || head.next==null) return head;
    while(ptr!=null){
        prev=ptr.prev;
        ptr.prev=ptr.next;
        ptr.next=prev;
        ptr=ptr.prev;
    }
    return ptr.next;
}