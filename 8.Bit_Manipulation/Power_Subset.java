class Solution {
    List<Integer> check(int i,int nums[]){
        List<Integer> list=new ArrayList<>();
        int ind=0;
        while(i!=0){
            if((i&1)==1) list.add(nums[ind]);
            i>>=1;
            ind++;
        }
        return list;
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        int temp=1<<n;
        int i=0;
        while(i<temp){
            list.add(check(i,nums));
            i++;
        }
        return list;
    }
}