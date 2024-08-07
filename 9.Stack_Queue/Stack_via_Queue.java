class MyStack {
    int queue[]=new int[100000];
    int front=-1,rear=-1;
    public MyStack() {
        front=rear=-1;
    }
    void add(int x){
        if(rear==-1) rear=front=0;
        else rear++;
        queue[rear]=x;
    }
    public void push(int x) {
        add(x);
        int n=rear;
        for(int i=front;i<n;i++){
            int m=pop();
            add(m);
        }

    }
    
    public int pop() {
        if(front>rear) return -1;
        return queue[front++];
    }
    
    public int top() {
        if(front==-1) return -1;
        return queue[front];
    }
    
    public boolean empty() {
        if(front>rear || front==-1) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */