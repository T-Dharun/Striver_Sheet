class Solution {
    int last(int[] nums,int target){
        int l=0,r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target) ans=mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        return ans;
    }
    int first(int nums[],int target){
        int l=0,r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>=target){
                if(nums[mid]==target) ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        int f=first(nums,target);
        int l=last(nums,target);
        a[0]=f;
        a[1]=l;
        return a;
    }
}