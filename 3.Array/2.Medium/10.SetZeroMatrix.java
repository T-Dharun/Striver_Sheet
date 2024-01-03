import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        int row[]=new int[n];
        int column[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    row[i]=1;
                    column[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1||column[j]==1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
}