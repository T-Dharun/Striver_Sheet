    static int countNodesinLoop(Node head)
    {
        HashMap<Node , Integer> hash=new HashMap<>();
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return length(slow.next,fast);
            }
        }
        return 0;
    }