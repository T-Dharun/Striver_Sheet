import java.util.*;
public class Solution {
    static int canweplace(int a[],int cow,int place){
        int k=0;
        cow--;
        for(int i=1;i<a.length;i++){
            if(a[i]-a[k]>=place){
                k=i;
                cow--;
            }
        }
       // System.out.println(place+" "+cow);
        return cow;
    }
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int max=Integer.MIN_VALUE;
        for(int i:stalls){
            max=Math.max(max,i);

        }
        int ans=0;
        int left=1,right=max;
        while(left<=right){
            int mid=(left+right)/2;
            int val=canweplace(stalls,k,mid);
            if(val<=0){
                left=mid+1;
            }
            else right=mid-1;
        }
        return left-1;
    }
}