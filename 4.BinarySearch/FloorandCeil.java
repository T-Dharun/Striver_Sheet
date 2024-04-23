import java.util.* ;
import java.io.*; 

public class Solution {
      static int findFloor(int arr[],int x){
        int left=0,right=arr.length-1;
        int fr=-1;
        while(left<=right){
          int mid=(left+right)/2;
          if(arr[mid]<=x){
            fr=arr[mid];
            left=mid+1;
          }
          else right=mid-1;
        }
        return fr;
      }
      static int findCeil(int arr[],int x){
        int left=0,right=arr.length-1;
        int ceil=-1;
        while(left<=right){
          int mid=(left+right)/2;
          if(arr[mid]>=x){
            ceil=arr[mid];
            right=mid-1;
          }
          else left=mid+1;
        }
        return ceil;
      }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
  
      int arr[]=new int[2];
      int f=findFloor(a,x);
      int c=findCeil(a,x);
      arr[0]=f;
      arr[1]=c;
      return arr;
    }
    
}