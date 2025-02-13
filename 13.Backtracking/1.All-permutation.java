class Solution {
    public void generateAll(List<List<Integer>> ans,List<Integer> list,int arr[],int ind){
      if(ind==arr.length){
        ans.add(new ArrayList<>(list));
        return;
      }
      for(int i=ind;i<arr.length;i++){
        list.add(arr[i]);
        arr[i]=arr[i]+arr[ind]-(arr[ind]=arr[i]);
        generateAll(ans,list,arr,ind+1);
        arr[i]=arr[i]+arr[ind]-(arr[ind]=arr[i]);
        list.remove(list.size()-1);
      }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        generateAll(ans,list,nums,0);
        return ans;
    }
}
