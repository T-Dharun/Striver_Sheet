class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            int sum=0;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> a=Arrays.asList(nums[i],nums[j],nums[k]);
                    list.add(a);
                }
                if(sum<0) j++;
                else k--;
            }
        }
        List<List<Integer> >lst=new ArrayList<>(list);
        return lst;
    }
}