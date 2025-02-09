class Solution {
    public void findCombinations(List<List<Integer>> list,int arr[],List<Integer> ls,int target,int ind){
        if(arr.length==ind){
            if(target==0){
                list.add(new ArrayList<>(ls));
            }
            return;
        }
        if(target>=0){
            ls.add(arr[ind]);
            findCombinations(list,arr,ls,target-arr[ind],ind);
            ls.remove(ls.size()-1);
        }
        findCombinations(list,arr,ls,target,ind+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        findCombinations(list,candidates,ls,target,0);
        return list;
    }
}
