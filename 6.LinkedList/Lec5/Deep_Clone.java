/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    int check(Node head,Node key){
        int cnt=0;
        while(head!=null){
            if(head==key) return cnt;
            head=head.next;
            cnt++;
        }
        return -1;
    }
    Node get(Node head,int i){
        while(head!=null && i!=0){
            head=head.next;
            i--;
        }
        return head;
    }
    public Node copyRandomList(Node head) {
        Node head1=new Node(-1);
        Node temp=head1;
        Node newtemp=head;
        while(head!=null){
            head1.next=new Node(head.val);
            head=head.next;
            head1=head1.next;
        }
        head1=temp.next;
        head=newtemp;
        while(head!=null){
            int i=check(newtemp,head.random);
            head1.random=get(temp.next,i);
            head=head.next;
            head1=head1.next;
        }

        return temp.next;
    }
}