import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n=arr.size();
        int temp=k;
        ArrayList<Integer> a=new ArrayList<>();
        if(k>n) return a;
        for(int i=temp;i<n;i++){
            a.add(arr.get(i));
        }
        for(int i=0;i<temp;i++){
            a.add(arr.get(i));
        }
        return a;
    }
}