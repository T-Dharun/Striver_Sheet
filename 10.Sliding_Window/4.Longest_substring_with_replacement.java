class Solution {
    public int characterReplacement(String s, int k) {
        int arr[]=new int[26];
        for(int i=0;i<26;i++) arr[i]=0;
        int n=s.length();
        int ans=0;
        int r=0,l=0;
        int max=0;
        while(r<n){
            int ind=s.charAt(r)-'A';
            arr[ind]++;
            if(arr[ind]>max) max=arr[ind];
            int change=r-l+1-max;
            if((r-l+1-max)>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            for(int v=0;v<26;v++){
                    if(arr[v]>max) max=arr[v];
            }
            if(r-l+1-max<=k) ans=Math.max(ans,r-l+1);
            r++;
        }

        return ans;
    }
}
