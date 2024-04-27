public class Solution {
    public static int NthRoot(int n, int m) {
        int left=0,right=m;
        while(left<=right){
            int mid=(left+right)/2;
            int val=(int)Math.pow(mid,n);
            if(val==m) return mid;
            else if(val>m) right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
}
