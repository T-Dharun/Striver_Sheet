class Solution {
    public boolean calculate(int[] candies,int choc,long k){
        int n=candies.length;
        long res=0;
        for(int i=0;i<n;i++){
            res+=(candies[i]/choc);
        }
        return (res>=k);
    }
    public int maximumCandies(int[] candies, long k) {
        int left=1,right=0;
        for(int i:candies) right=Math.max(i,right);
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(calculate(candies,mid,k)){
                ans=mid;
                left=mid+1;
            }
            else right=mid-1;
        }
        return ans;
    }
}
