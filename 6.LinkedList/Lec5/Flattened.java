
import java.util.*;
class Node{
    int data;
    Node next,child;
    Node(int data){
        this.data=data;
        next=child=null;
    }
}
public class Main{
    static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    static Node merge(Node a,Node b){
        Node head=new Node(-1);
        Node temp=head;
        while(a!=null && b!=null){
            if(a.data<b.data){
                head.next=new Node(a.data);
                a=a.child;
            }
            else{
                head.next=new Node(b.data);
                b=b.next;
            }
            head=head.next;
        }
        while(a!=null){
            head.next=new Node(a.data);
            a=a.child;
            head=head.next;
        }
        while(b!=null){
            head.next=new Node(b.data);
            b=b.next;
            head=head.next;
        }
      //  print(temp.next);
        return temp.next;
    }
    static Node flattened(Node head){
        Node temp=new Node(-1);
        Node ptr=null;
        while(head!=null){
            ptr=(merge(head,ptr));
        
            //print(ptr);
        
            //print(ptr);
            head=head.next;
        }
        return ptr;
    }
    public static void main(String[] args) {
        // Create a linked list with child pointers
        Node head = new Node(5);
        head.child = new Node(14);

        head.next = new Node(3);
        head.next.child = new Node(4);

        head.next.next = new Node(12);
        head.next.next.child = new Node(20);
        head.next.next.child.child = new Node(132);

        head.next.next.next = new Node(7);
        head.next.next.next.child = new Node(17);
        Node flattened=flattened(head);
        print(flattened);
    }
}