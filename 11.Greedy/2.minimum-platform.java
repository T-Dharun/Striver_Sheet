class Solution {
    // F
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;
        int i=0,j=0,cnt=0;
        int max=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                i++;
                cnt++;
            }
            else{
                j++;
                cnt--;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}
