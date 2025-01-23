class Solution {
    public static int totalElements(Integer[] arr) {
        int ans=0;
        int n=arr.length;
        int l=0,r=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            if(map.size()>2){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0) map.remove(arr[l]);
                l++;
            }
            if(map.size()<=2) ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}
