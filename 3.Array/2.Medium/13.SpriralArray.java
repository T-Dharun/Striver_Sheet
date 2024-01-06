import java.util.*;
public class Solution {
    public static int[] spiralMatrix(int [][]a) {
        int n=a.length;
        int m=a[0].length;
        int arr[]=new int[m*n];
        int left=0,top=0;
        int k=0;
        int right=m-1,bottom=n-1;
        while(left<=right&&top<=bottom){
            for(int i=left;i<=right;i++){
                arr[k]=a[top][i];
                k++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[k]=a[i][right];
                k++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr[k]=a[bottom][i];
                    k++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr[k]=a[i][left];
                    k++;
                }
                left++;
            }
        }
        return arr;
    }
}