import java.util.*;
public class Main{
    static String reverse(String a){
        int n=a.length();
        String ans="";
        for(int i=n-1;i>=0;i--){
            ans+=a.charAt(i);
        }
        return ans;
    }
    static int p(Character a){
        int val=-1;
        switch(a){
            case '^':
                val=3;
                break;
            case '*':
            case '/':
                val=2;
                break;
            case '+':
            case '-':
                val=1;
                break;
        }
        return val;
    }
    public static void main(String args[]){
        Stack<Character> stack=new Stack<>();
        
        String s="((A-(B/C))*((A/K)-L))";
        int n=s.length();
        String ans="";
        for(int i=n-1;i>=0;i--){
            char a=s.charAt(i);
            if(a>='A'&&a<='Z') ans+=a;
            else{
                if(stack.isEmpty() || a==')') stack.push(a);
                else if(a=='('){
                    while(stack.peek()!=')'){
                        ans+=stack.pop();
                    }
                    stack.pop();
                }
                else if(p(stack.peek()) < p(a)) stack.push(a);
                else{
                    ans+=stack.pop();
                    stack.push(a);
                }
            }
        }
        //System.out.println(stack.peek());
        
        while(!stack.isEmpty()) ans+=stack.pop();
        ans=reverse(ans);
        System.out.println(ans);
    }
}