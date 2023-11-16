import java.util.*;
public class Solution {
    public static int[] getFrequencies(int []v) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i:v){
            if(hash.containsKey(i)){
                int count= hash.get(i);
                hash.put(i,count+1);
            }
            else{
                hash.put(i,1);
            }
        }
        int a[]=new int[2];
        int max,min;
        max=min=hash.get(v[0]);
        a[0]=v[0];
        a[1]=v[0];
        for(int i:v){
            int num=hash.get(i);
            if(num>max||(num==max&&a[0]>i)){
                max=hash.get(i);
                a[0]=i;
            }
            if(num<min||(num==min&&a[1]>i)){
                min=hash.get(i);
                a[1]=i;
            }
        }
        return a;

    }
}