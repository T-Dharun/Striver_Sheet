class Solution {
    public String reverseWords(String s) {
        Stack<String> stack=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a==' '){
                if(str.length()>0)
                    stack.push(str);
                str="";
            }
            else str+=a;
        }
        if(str.length()>0)
            stack.push(str);
        String ans="";
        while(!stack.empty()){
            ans+=stack.pop();
            if(!stack.empty()) ans+=' ';
        }
        return ans;
    }
}