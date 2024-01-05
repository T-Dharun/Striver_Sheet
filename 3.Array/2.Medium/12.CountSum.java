import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int n=arr.length;
        int i=0,j=0;
        int sum=0,count=0;
        while(j<n){
            sum+=arr[j];
            while(sum>s){
                sum-=arr[i];
                i++;
            }
            if(sum==s) count++;
            j++;
        }
        return count;
    }
}