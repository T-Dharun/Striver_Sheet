import java.util.*;
public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        int n=a.length;
        HashMap<Integer,Integer> hash=new HashMap<>();
        hash.put(0,1);
        int sum=0,cnt=0;
        for(int i=0;i<n;i++){
            sum^=a[i];
            int rem=sum^b;
            if(hash.containsKey(rem)) cnt+=hash.get(rem);

                if(!hash.containsKey(sum)) hash.put(sum,1);
                else hash.put(sum,hash.get(sum)+1);
        }
        return cnt;
    }
}