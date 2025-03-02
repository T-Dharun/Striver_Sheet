class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int[] i:nums1){
            map.put(i[0],map.getOrDefault(i[0],0)+i[1]);
        }
        for(int[] i:nums2){
            map.put(i[0],map.getOrDefault(i[0],0)+i[1]);
        }
        int arr[][]=new int[map.size()][2];
        int k=0;
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            arr[k][0]=i.getKey();
            arr[k][1]=i.getValue();
            k++;
        }
        return arr;
        
    }
}
