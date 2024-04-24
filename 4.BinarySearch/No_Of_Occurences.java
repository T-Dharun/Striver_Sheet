public class Solution {
    static int first(int arr[],int x,int n){
        int left=0,right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==x){
                ans=mid;
                right=mid-1;
            }
            else if(arr[mid]>x){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    static int last(int arr[],int x,int n){
        int left=0,right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<=x){
                if(arr[mid]==x) ans=mid;
                left=mid+1;
            }
            else right=mid-1;
        }
        return ans;
    }
    public static int count(int arr[], int n, int x) {
        int first=first(arr,x,n);
        int last=last(arr,x,n);
        int ans=last-first+1;
        if(first==-1) return 0;
        //System.out.println(first+" "+last);
        
        return ans;
    }
}