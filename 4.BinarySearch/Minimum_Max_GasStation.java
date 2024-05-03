public class Solution {
    static int calc(int []a,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        double k){
        int cnt=0;
        for(int i=0;i<a.length-1;i++){
            int num=(int)((a[i+1]-a[i])/k);
            if(num*k==a[i+1]-a[i]) num--;
            cnt+=num;
        }
        return cnt;
    }
    public static double MinimiseMaxDistance(int []arr, int K){
        double left=0,right=0,diff=1e-6;
        for(int i=0;i<arr.length-1;i++){
            right=Math.max(right,(double)arr[i+1]-arr[i]);
        }
        while(right-left>diff){
            double mid=(left+right)/2.0;
            int value=calc(arr,mid);
           // System.out.println(value);
            if(value>K) left=mid;
            else right=mid;
            
        }
        return right;
    }
}