class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[]=new int[256];
        for(int i=0;i<256;i++) hash[i]=-1;
        int n=s.length();
        int l=0,r=0,maxLength=0;
        while(r<n){
            if(hash[s.charAt(r)-'\0']!=-1 && hash[s.charAt(r)-'\0']>=l) l=hash[s.charAt(r)-'\0']+1;
            maxLength=Math.max(maxLength,r-l+1);
            hash[s.charAt(r)-'\0']=r;
            r++;
        }
        return maxLength;
    }
}
