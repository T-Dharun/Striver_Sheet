class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0,right=m-1;
        while(left<n&& right>=0){
            if(matrix[left][right]==target) return true;
            else if(matrix[left][right]<target) left++;
            else right--;
        }
        return false;
    }
}