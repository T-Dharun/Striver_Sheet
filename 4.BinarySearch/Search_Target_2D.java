class Solution {
    boolean check(int a[],int target){
        int n=a.length;
        int left=0,right=n-1;
        if(target<a[left]||target>a[right]) return false;
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==target) return true;
            else if(a[mid]>target) right=mid-1;
            else left=mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(check(matrix[i],target)) return true;
        }
        return false;
    }
}