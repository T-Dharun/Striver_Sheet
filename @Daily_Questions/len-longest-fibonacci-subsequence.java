class Solution {
    public int fib(int dp[][],int arr[],int prev,int cur,int n){
        int max=0;
        if(dp[prev][cur]!=0) return dp[prev][cur];
        for(int i=cur+1;i<n;i++){
            if(arr[prev]+arr[cur]==arr[i]) max=1+Math.max(max,fib(dp,arr,cur,i,n));
            else if(arr[prev]+arr[cur]<arr[i]) break;
        }
        return dp[prev][cur]=max;
    }
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        int max=0;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int val=fib(dp,arr,i,j,n);
                if(val!=0) val+=2;
                max=Math.max(val,max);
            }
        }
        return max;
    }
}
