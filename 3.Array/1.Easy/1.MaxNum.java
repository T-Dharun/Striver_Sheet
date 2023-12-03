import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]) max=arr[i];
        }
        return max;
    }
}