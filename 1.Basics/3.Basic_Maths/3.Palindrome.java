class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n=x;
        long y=0;
        while(n!=0){
            int r=n%10;
            y=y*10+r;
            n/=10;
        }
        //System.out.println(x+" "+y);
        if((int)y==x) return true;
        return false;
    }
}