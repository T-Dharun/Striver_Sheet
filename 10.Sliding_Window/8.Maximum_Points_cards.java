class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int sum=0,cnt=0;
        for(int i=0;i<k;i++) sum+=cardPoints[i];
        int ans=sum;
        int l=k-1,r=n-1;
        while(k!=0){
            sum-=cardPoints[l--];
            sum+=cardPoints[r--];
            ans=Math.max(ans,sum);
            k--;
        }
        
        return ans;
    }
}
