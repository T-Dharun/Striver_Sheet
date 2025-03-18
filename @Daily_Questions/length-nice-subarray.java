class Solution {
    public boolean fill(int[] bit,int num){
        boolean flag=true;
        for(int i=0;i<32;i++){
            if((num&(1<<i))!=0){
                if(bit[i]==1) flag=false;
                bit[i]=1;
            }
        }
        
        return flag;
    }
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int bit[]=new int[32];
            Arrays.fill(bit,0);
            for(int j=i;j<n;j++){
                if(fill(bit,nums[j])){
                    max=Math.max(max,j-i+1);
                }
                else break;
            }
        }
        return max;
    }
}
