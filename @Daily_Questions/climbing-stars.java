class Solution {
    public int solve(int n,int arr[]){
        if(n<=2) return arr[n]=n;
        if(arr[n]!=0) return arr[n];
        return arr[n]=solve(n-1,arr)+solve(n-2,arr);
    }
    public int climbStairs(int n) {
        int arr[]=new int[n+1];
        Arrays.fill(arr,0);
        return solve(n,arr);

    }
}
