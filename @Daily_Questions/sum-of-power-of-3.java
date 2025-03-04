class Solution {
    public int cube(int n){
        int left=1,right=n;
        int ans=0;
        while(left<=right){
            int mid=(left+right)/2;
            
            if(Math.pow(3,mid)<=n){
                ans=mid;
                left=mid+1;
            }
            else right=mid-1;
        }
        return ans;
    }
    public boolean check(int n,int limit){
        if(n==0 || n==1) return true;
        for(int i=limit;i>=1;i--){
            boolean value=check(n-(int)Math.pow(3,limit),i-1);
            
            if(value) return value;
        }
        return false;
    }
    public boolean checkPowersOfThree(int n) {
        int cube=cube(n);
        return check(n,cube);
    } 
}
