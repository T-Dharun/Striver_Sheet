import java.util.ArrayList;

public class Solution 
{
    static int findPainters(ArrayList<Integer> arr,int max){
        int load=0,painter=1;
        for(int i: arr){
            if(load+i<=max) load+=i;
            else{
                painter++;
                load=i;
            }
        }
        return painter;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int left=0,right=0;
        for(int i:boards){
            left=Math.max(left,i);
            right+=i;
        }
        while(left<=right){
            int mid=(left+right)/2;
            int val=findPainters(boards,mid);
            if(val<=k) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}