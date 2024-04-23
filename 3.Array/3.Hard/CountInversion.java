public class Solution {
    public static int numberOfInversions(int []a, int n) {
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(a[i]>a[j]) cnt++;
            }
        }
        return cnt;
    }
}