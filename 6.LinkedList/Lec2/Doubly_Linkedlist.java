
class Solution {
    
    Node constructDLL(int arr[]) {
        Node head=new Node(arr[0]);
        Node ptr=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            temp.prev=ptr;
            ptr.next=temp;
            ptr=temp;
        }
        return head;
        
    }
}