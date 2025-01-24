class Solution {
    public int checkOdd(int arr[],int k){
        if(k<0) return 0;
        int n=arr.length;
        int r=0,l=0,odd=0,cnt=0;
        while(r<n){
            if(arr[r]%2==1) odd++;
            while(odd>k){
                if(arr[l]%2==1) odd--;
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return checkOdd(nums,k)-checkOdd(nums,k-1);
    }
}
