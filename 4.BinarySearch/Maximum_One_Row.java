import java.util.ArrayList;
public class Solution
{
    static int lower(ArrayList<Integer> matrix,int m){
        int left=0,right=m-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(matrix.get(mid)>=1) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int max=-1;
        int ind=-1;
        for(int i=0;i<n;i++){
            int val=m-lower(matrix.get(i),m);
           // System.out.println(val);
            if(val>max){
                max=val;
                ind=i;
            }
        }
        return ind;
    }
}