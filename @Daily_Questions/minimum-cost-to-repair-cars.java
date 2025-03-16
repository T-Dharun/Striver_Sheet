
class Solution {
    public boolean repair(int[] ranks,long time,int cars){
        int n=ranks.length;
        long cnt=0;
        for(int i=0;i<n;i++){
            long t=(long)(Math.sqrt(time/ranks[i]));
            cnt+=t;
        }
        return (cnt>=cars);
    }
    public long repairCars(int[] ranks, int cars) {
        long left=0,right=0;
        int n=ranks.length;
        for(int i:ranks){
            right=Math.max(right,(long)i*(long)cars*cars);
            left=Math.min(left,i);
        }
        while(left<=right){
            long mid=left+(right-left)/2;
            if(repair(ranks,mid,cars)) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}
