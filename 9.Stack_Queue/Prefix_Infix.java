class Solution {
    static String preToInfix(String pre_exp) {
        int n=pre_exp.length();
        Stack<String> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            char a=pre_exp.charAt(i);
            if((a>='A' && a<='Z') || (a>='a' && a<='z')) stack.push(Character.toString(a));
            else{
                String b=stack.pop();
                String c=stack.pop();
                stack.push("("+b+a+c+")");
            }
        }
        String ans=stack.peek();
        return ans;
    }
}
