public class Solution {
    public static int traffic(int n, int m, int []vehicle) {
        int count=0;
        int i,j,ans;
        i=j=ans=0;
        while(j<n){
            if(vehicle[j]==0){
                count++;
            }
            while(count>m){
                if(vehicle[i]==0){
                    count--;
                }
                i++;
            }
            ans=Math.max(j-i+1,ans);
            j++;
        }
        return ans;
    }
}