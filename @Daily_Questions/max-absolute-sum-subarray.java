class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int pos=0;
        int neg=0;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            pos+=i;
            neg+=i;
            max=Math.max(max,Math.max(pos,Math.abs(neg)));
            if(pos<0) pos=0;
            if(neg>0) neg=0;
        }
        return max;
    }
}
