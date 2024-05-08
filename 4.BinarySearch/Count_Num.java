//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(st[i]);
              
            System.out.println(new Solution().minNumber(arr,0,n-1));
        }
    }
    
}
// } Driver Code Ends


class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        int left=0,right=arr.length-1;
        int max=Integer.MAX_VALUE;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[left]<=arr[right]) return Math.min(max,arr[left]);
            else if(arr[left]<=arr[mid]){
                max=Math.min(max,arr[left]);
                left=mid+1;
            }
            else{
                max=Math.min(max,arr[mid]);
                right=mid-1;
            }
        }
        return -1;
    }
}