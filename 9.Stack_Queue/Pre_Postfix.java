class Solution {
    static String preToPost(String pre_exp) {
        Stack<Character> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();
        int n=pre_exp.length();
        for(int i=0;i<n;i++){
            char a=pre_exp.charAt(i);
            if((a>='A'&&a<='Z') || (a>='a' && a<='z')) queue.add(a);
            else stack.push(a);
        }
        String ans="";
        for(int i=n-1;i>=0;i--){
            char a=pre_exp.charAt(i);
            if((a>='A'&&a<='Z') || (a>='a' && a<='z')){
                ans+=queue.remove();
            }
            else ans+=stack.pop();
        }
        return ans;
    }
}