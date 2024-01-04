import java.util.*;
public class Solution {
    public static void rotateMatrix(int [][]mat){
        int m=mat.length;
        int n=mat[0].length;
        int r=n-1;
        int c=0;
       // System.out.println(r);
        int a[][]=new int[m][n];
        for(int i=0;i<n;i++){
            r=n-1;
            for(int j=0;j<n;j++){
                a[j][n-i-1]=mat[i][j];
//                System.out.print(mat[i][j]);
r--;
            }
  //          System.out.println();
    //        r--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //System.out.print(a[i][j]);
                mat[i][j]=a[i][j];
            }
           // System.out.println();
        }
        
    }
}