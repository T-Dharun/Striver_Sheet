class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=g.length;
        int m=s.length;
        int cnt=0;
        int l=0,r=0;
        while(r<m && l<n){
            if(g[l]<=s[r]) l++;
            r+=1;
        }
        return l;
    }
}
