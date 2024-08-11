
class Solution {
    // Function to convert an infix expression to a postfix expression.
    static int priority(char a){
        int ans=-1;
        switch(a){
            case '^': ans = 3;break;
            case '/':
            case '*':
                ans = 2;
                break;
            case '+':
            case '-':
                ans = 1;
                break;
        }
        return ans;
    }
    public static String infixToPostfix(String exp) {
        Stack<Character> stack=new Stack<>();
        int n=exp.length();
        String ans="";
        for(int i=0;i<n;i++){
            char a=exp.charAt(i);
            if((a>='a' && a <='z')||(a>='0' && a<='9')) ans+=a;
            else{
                int base2=priority(a);
                if(stack.isEmpty() || a=='(') stack.push(a);
                else if(a==')'){
                    //System.out.println(a);
                    while(priority(stack.peek())!=-1){
                      ans+=stack.pop();
                     // System.out.println(ans);
                    } 
                    stack.pop();
                }
                else{
                    int base1=priority(stack.peek());
                    if(base1<base2) stack.push(a);
                    else{
                        while(!stack.isEmpty() && (priority(stack.peek())>=base2) && stack.peek()!='('){
                            ans+=stack.pop();
                        }
                        stack.push(a);
                    }
                }
            }
        }
        while(!stack.isEmpty()) ans+=stack.pop();
        return ans;
    }
}