class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('){
                if(cnt>0) ans+=a;
                cnt++;
            }
            else{
                cnt--;
                if(cnt>0) ans+=a;
            }
        }
        return ans;
    }
}