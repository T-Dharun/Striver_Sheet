class Solution {
    public void findAll(List<List<Integer>> list,int arr[],int i,int n,List<Integer> temp){
        list.add(new ArrayList<>(temp));
        for(int j=i;j<n;j++)
        {
            if(i!=j && arr[j]==arr[j-1]) continue;
            temp.add(arr[j]);
            findAll(list,arr,j+1,n,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int n=nums.length;
        findAll(list,nums,0,n,temp);
        return list;
    }
}
