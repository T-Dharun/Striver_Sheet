
class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        StackNode ptr=new StackNode(a);
        ptr.next=top;
        top=ptr;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if(top==null) return -1;
        int x=top.data;
        top=top.next;
        return x;
    }
}