public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        int n=a.length;
        int arr[]=new int[n];
        for(int i:a){
            arr[i-1]++;
        }
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            if(arr[i]==2) ans[0]=i+1;
            if(arr[i]==0) ans[1]=i+1;
        }
        return ans;
    }
}