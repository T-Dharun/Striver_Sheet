class Solution {
    public long coloredCells(int n) {
        long sum=0;
        for(int i=0;i<n;i++) sum+=i;
        return sum*4+1; 
    }
}
