import java.util.ArrayList;
public class Solution {
    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int n, int m, int k) {
        if(n>m) return kthElement(b,a,m,n,k);
        int left=Math.max(0,k-m),right=Math.min(k,n);
        int median=k;
        while(left<=right){
            int mid1=(left+right)/2;
            int mid2=median-mid1;
            int l1=(mid1>0)?a.get(mid1-1):Integer.MIN_VALUE;
            int l2=(mid2>0)?b.get(mid2-1):Integer.MIN_VALUE;
            int r1=(mid1<n)?a.get(mid1):Integer.MAX_VALUE;
            int r2=(mid2<m)?b.get(mid2):Integer.MAX_VALUE;
            if((l1<=r2)&& (l2<=r1)){
                return (int)Math.max(l1,l2);
            }
            else if(l1>r2) right=mid1-1;
            else left=mid1+1;
        }
        return 0;
    }
}