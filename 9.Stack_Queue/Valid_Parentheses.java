public class Stack1{
    char a[]=new char[100000];
    int top=-1;
    public void push(char x){
        a[++top]=x;
    }
    public char pop(){
        if(top==-1) return '1';
        return a[top--];
    }
}
class Solution {
    
    public boolean isValid(String s) {
        Stack1 stack=new Stack1();
        int n=s.length();
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            if(a=='('||a=='{'||a=='[') stack.push(a);
            else{
                char b=stack.pop();
                if(b=='1') return false;
                switch(a){
                    case  ')':
                        if(b!='(') return false;
                        break;
                    case ']':
                        if(b!='[') return false;
                        break;
                    case '}':
                        if(b!='{') return false;
                        break;
                }
            }
        }
        if(stack.top!=-1) return false;
        return true;
    }
}