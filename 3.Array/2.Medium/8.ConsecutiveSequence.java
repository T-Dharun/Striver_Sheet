import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        int n=a.length;
        int max=0;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i:a){
            if(hash.containsKey(i)){
                hash.put(i,hash.get(i)+1);
            }
            else{
                hash.put(i,1);
            }
            max=Math.max(max,i);
        }
        int count=0,len=0;
        for(int i=1;i<=max;i++){
            if(hash.containsKey(i)){
                count++;
            }
            else{
                count=0;
            }
            len=Math.max(len,count);
        }
        return len;
    }
}