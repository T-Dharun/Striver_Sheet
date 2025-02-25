class Solution {
    public int numOfSubarrays(int[] arr) {
        long res=0;
        int odd=0,even=1;
        int pre=0;
        for(int i:arr){
            pre+=i;
            if(pre%2==0){
                res+=odd;
                even++;
            }
            else{
                res+=even;
                odd++;
            }
        }
        return (int)(res%(1000000007));
        
    }
}
