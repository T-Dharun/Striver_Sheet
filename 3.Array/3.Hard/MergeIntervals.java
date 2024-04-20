class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int r=intervals.length;
        int c=intervals[0].length;
        int a[][]=new int[r][2];
        int k=0;
        a[k][0]=intervals[0][0];
        a[k][1]=intervals[0][1];
        for(int i=1;i<r;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(start<=a[k][1]){
                a[k][1]=Math.max(end,a[k][1]);
            }
            else{
                k++;
                a[k][0]=start;
                a[k][1]=end;
            }
        }
        int ans[][]=new int[k+1][2];
        for(int i=0;i<=k;i++){
            ans[i][0]=a[i][0];
            ans[i][1]=a[i][1];
        }
        return ans;
    }
}