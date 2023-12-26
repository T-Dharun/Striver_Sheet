import java.util.*;
public class Solution {
    public static int majorityElement(int []v) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int n=v.length;
        for(int i=0;i<n;i++){
            if(hash.containsKey(v[i])){
                hash.put(v[i],hash.get(v[i])+1);
            }
            else hash.put(v[i],1);
        }
        int val=v[0];
        int max=hash.get(val);
        for(int i=1;i<n;i++){
            int temp =hash.get(v[i]);
            if(max<temp){
                max=temp;
                val=v[i];
            }
        }
        return val;
    }
}