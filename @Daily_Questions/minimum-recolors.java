class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int left=0,right=0;
        int white=0,black=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W') white++;
            else black++;
        } 
        int ans=white;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i)=='W') white++;
            else black++;
            if(blocks.charAt(left)=='W') white--;
            else black--;
            ans=Math.min(ans,white);
            left++;
        }

        return ans;
    }
}
