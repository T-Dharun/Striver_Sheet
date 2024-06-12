
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        if(head==null){
            head=new Node(x);
            return head;
        }
        
        Node ptr=head;
        
        while(ptr.next!=null){
           // System.out.println(ptr.data);
            ptr=ptr.next;
        }
        Node temp=new Node(x);
        temp.next=null;
        ptr.next=temp;
        return head;
    }
}