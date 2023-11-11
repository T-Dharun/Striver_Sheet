class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0;
        int n=s.length()-1;
        while(i<=n){
            char a=s.charAt(i);
            char b=s.charAt(n);
            System.out.print(a+" "+b);
            if(!Character.isLetterOrDigit(a))
                i++;
            else if(!Character.isLetterOrDigit(b))
                n--;
            else{
                if(a!=b) return false;
                //System.out.print(a);
                i++;
                n--;
            }
        }
        return true;
    }
}