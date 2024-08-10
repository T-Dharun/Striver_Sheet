class MyQueue {
    int stack1[]=new int[100];
    int stack2[]=new int[100];
    int top1,top2;
    public MyQueue() {
        top1=top2=-1;
    }
    
    public void push(int x) {
        while(top1!=-1){
            stack2[++top2]=pop();
        }    
        stack1[++top1]=x;
        while(top2!=-1) stack1[++top1]=pop2();
    }
    public int pop() {
        if(top1==-1) return -1;
        return stack1[top1--];
    }
    int pop2(){
        if(top2==-1) return -1;
        return stack2[top2--];
    }
    public int peek() {
        if(top1==-1) return -1;
        return stack1[top1];
    }
    
    public boolean empty() {
        if(top1==-1) return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */