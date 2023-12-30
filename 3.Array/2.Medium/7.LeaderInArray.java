import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=a.length;
        arr.add(a[n-1]);
        int max=a[n-1];
        for(int i=n-2;i>=0;i--){
            if(a[i]>max){
                arr.add(a[i]);
            }
            max=Math.max(max,a[i]);
        }
        return arr;
    }
}