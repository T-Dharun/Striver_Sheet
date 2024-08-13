class Solution {
    static String postToInfix(String exp) {
        Stack<String> stack=new Stack<>();
        int n=exp.length();
        for(int i=0;i<n;i++){
            char a=exp.charAt(i);
            if((a>='a'&&a<='z')||(a>='A'&&a<='Z')) 
                stack.push(Character.toString(a));
            else{
                String b=stack.pop();
                String c=stack.pop();
                stack.push('('+c+a+b+')');
            }
        }
        return stack.pop();
    }
}
