import java.util.*;
public class Solution {
    public static String read(int n, int []book, int target){
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=book[i];
            int ch=target-num;
            if(hash.containsKey(ch)){
                return "YES";
            }
            hash.put(num,i);
        }
        return "NO";
    }
}