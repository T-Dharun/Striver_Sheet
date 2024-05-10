class Solution {
    public String largestOddNumber(String num) {
        
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            char a=num.charAt(i);
            int m=(int)a-'0';
            if(m%2==1) return num.substring(0,i+1);
        }
        return "";
    }
}