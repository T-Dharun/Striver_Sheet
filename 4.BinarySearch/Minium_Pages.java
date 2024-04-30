import java.util.ArrayList;
public class Solution {
    static int findSum(ArrayList<Integer> arr,int sum){
        int cnt=0,std=1;
        for(int i=0;i<arr.size();i++){
            int val=arr.get(i);
            if(cnt+val<=sum){
                cnt+=val;
            }
            else{
                std++;
                cnt=val;
            }
        }
        return std;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i:arr){
            sum+=i;
            max=Math.max(max,i);
        }
        if(arr.size()<m) return -1;
        int left=max,right=sum;
        while(left<=right){
            int mid=(left+right)/2;
            int val=findSum(arr,mid);
            if(val>m) left=mid+1;
            else right=mid-1;
        }
        return left;
    }
}