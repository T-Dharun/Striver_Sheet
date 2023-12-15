/*
public class Solution {
    public static int getSingleElement(int []arr){
        int n=arr.length;
        int val=arr[0];
        for(int i=1;i<n;i++){
            val=val^arr[i];
        }
        return val;
    }
}
*/

import java.util.*;
public class Solution {
    public static int getSingleElement(int []arr){
        int n=arr.length;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i:arr){
            if(hash.containsKey(i)){
                int count=hash.get(i);
                hash.put(i,count+1);
            }
            else{
                hash.put(i,1);
            }
        }
        for(int i:arr){
            int num=hash.get(i);
            if(num==1) return i;
        }
        return 0;
    }
}