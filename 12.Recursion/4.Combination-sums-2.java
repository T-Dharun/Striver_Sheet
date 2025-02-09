class Solution {
    public void findCombinations(List<List<Integer>> list,int arr[],int target,int ind,List<Integer> ls){
        
            if(target==0){
                List<Integer> temp=new ArrayList<>(ls);
                Collections.sort(temp);
                if(!list.contains(temp)) list.add(temp);
                return;
            }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ls.add(arr[i]);
            findCombinations(list,arr,target-arr[i],i+1,ls);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(list,candidates,target,0,ls);
        return list;
    }
}
