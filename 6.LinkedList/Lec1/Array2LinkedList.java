class Solution {
    static Node constructLL(int arr[]) {
        
        Node head = new Node(arr[0]);
        Node ptr=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            ptr.next=temp;
            ptr=temp;
        }
        return head;
    }
}
