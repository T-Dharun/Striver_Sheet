
class Solution {
    public int maximumCount(int[] nums) {
        int odd=0,even=0;
        for(int i:nums){
            if(i>0) odd++;
            else if(i<0) even++;
        }
        return Math.max(odd,even);
    }
}
