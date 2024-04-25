class Solution {
    public boolean search(int[] arr, int target) {
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target) return true;
            if(arr[mid]==arr[left]&& arr[mid]==arr[right]){
                left=left+1;
                right=right-1;
                continue;
            }
            if(arr[left]<=arr[mid]){
                if(arr[left]<=target&&target<=arr[mid]) right=mid-1;
                else left=mid+1;
            }
            else{
                if(arr[mid]<=target&& target<=arr[right]) left=mid+1;
                else right=mid-1;
            }
        }
        return false;
    }
}