
class Solution {
    static String postToPre(String post_exp) {
        Stack<String> stack=new Stack<>();
        int n=post_exp.length();
        for(int i=0;i<n;i++){
            char a=post_exp.charAt(i);
            if((a>='a'&&a<='z')||(a>='A'&&a<='Z')) 
                stack.push(Character.toString(a));
            else{
                String b=stack.pop();
                String c=stack.pop();
                stack.push(a+c+b);
            }
        }
        return stack.pop();
    }
}
