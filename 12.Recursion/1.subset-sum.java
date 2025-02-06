class Solution {
    public void findSubset(ArrayList<Integer> list,int arr[],int ind,int n,int sum){
        if(ind>n) return;
        if(ind==n){
            list.add(sum);
            return;
        }
        findSubset(list,arr,ind+1,n,sum);
        findSubset(list,arr,ind+1,n,sum+arr[ind]);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
            findSubset(list,arr,0,n,0);    
        
        //for(int i:list) System.out.println(i);
        return list;
    }
}
