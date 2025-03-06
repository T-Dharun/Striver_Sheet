class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int arr[]=new int[n*n+1];
        Arrays.fill(arr,0);
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[grid[i][j]]==1) ans[0]=grid[i][j];
                arr[grid[i][j]]=1;
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}
