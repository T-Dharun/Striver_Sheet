import java.util.*;
public class Solution {
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        int ind=-1;
        int n=A.size();
        for(int i=n-2;i>=0;i--){
            if(A.get(i)<A.get(i+1)){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            Collections.reverse(A);
            return A;
        }
        for(int i=n-1;i>ind;i--){
            if(A.get(i)>A.get(ind)){
                int temp=A.get(i);
                A.set(i,A.get(ind));
                A.set(ind,temp);
                break;
            }
        }
        List<Integer> list=A.subList(ind+1,n);
        Collections.reverse(list);
        return A;

    }
}