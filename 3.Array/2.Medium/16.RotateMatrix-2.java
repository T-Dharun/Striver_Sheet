class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int k=n-1;
        int a[][]=new int[m][n];
        for(int i=0;i<n;i++){
            k=n-1;
            for(int j=0;j<n;j++){
                a[i][j]=matrix[k][i];
                k--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=a[i][j];
            }
        }
    }
}