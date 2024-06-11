class Solution {
    boolean palindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        int max=1;
        String ans=Character.toString(s.charAt(0));
        for(int i=0;i<n;i++){
            for(int j=i;j<=n;j++){
                if(j-i+1 > max && palindrome(s.substring(i,j))){
                    max=j-i+1;
                    ans=s.substring(i,j);
                }
            }
        }
        return ans;
    }
}