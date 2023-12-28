class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],max=0,n=prices.length;
        for(int i=1;i<n;i++){
            min=Math.min(min,prices[i]);
            int temp=prices[i]-min;
            max=Math.max(max,temp);
        }
        return max;
    }
}