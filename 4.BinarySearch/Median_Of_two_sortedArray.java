public class Solution {
    public static double median(int[] a, int[] b) {
    	int n=a.length;
        int m=b.length;
        if(n>m) median(b,a);
        int left=0,right=n;
        int median=(n+m+1)/2;
        while(left<=right){
            int mid1=(left+right)/2;
            int mid2=median-mid1;
            int l1=(mid1>0)?a[mid1-1]:Integer.MIN_VALUE;
            int l2=(mid2>0)?b[mid2-1]:Integer.MIN_VALUE;
            int r1=(mid1<n)?a[mid1]:Integer.MAX_VALUE;
            int r2=(mid2<m)?b[mid2]:Integer.MAX_VALUE;
            if((l1<r2)&&(l2<=r1)){
                if((n+m)%2==1) return Math.max(l1,l2);
                int val=Math.max(l1,l2)+Math.min(r1,r2);
                return (val/2.0);
            }
            else if(l1>r2){
                right=mid1-1;
            }
            else left=mid1+1;
        }
    return 0;
    }
}