public class Solution {
    public static int isSorted(int n, int []a) {
        for(int i=1;i<n;i++){
            if(a[i-1]>a[i]){
                return 0;
            }
        }
        return 1;
    }
}