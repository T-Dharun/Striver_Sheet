public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
            int hash[]=new int[n];
            for(int i:nums){
                if(i<=n) hash[i-1]+=1;
            }
            return hash;
    }
}