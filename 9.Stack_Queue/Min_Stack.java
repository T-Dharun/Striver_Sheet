class Pair{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class MinStack {
    Stack<Pair> stack;
    public MinStack() {
        stack=new Stack<>();
    }
    int min=Integer.MAX_VALUE;
    public void push(int val) {
       // int min=Integer.MAX_VALUE;
       if(stack.isEmpty()) min=Integer.MAX_VALUE;
       else min=stack.peek().y;
        min=Math.min(min,val);
        System.out.println(val+" "+min);
        stack.push(new Pair(val,min));   
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        Pair a=stack.peek();
        return a.x;
    }
    
    public int getMin() {
        return stack.peek().y;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */