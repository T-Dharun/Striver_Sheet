class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int ele1=Integer.MIN_VALUE,cnt1=0;
        int ele2=Integer.MIN_VALUE,cnt2=0;
        for(int i:nums){
            if(cnt1==0&& ele2!=i){
                cnt1=1;
                ele1=i;
            }
            else if(cnt2==0&& ele1!=i){
                cnt2=1;
                ele2=i;
            }
            else if(ele1==i) cnt1++;
            else if(ele2==i) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }   
        cnt2=cnt1=0;
        for(int i:nums){
            if(ele1==i)  cnt1++;
            if(ele2==i) cnt2++;
        }
        int min=(int)nums.length/3;
        if(cnt1>min) list.add(ele1);
        if(cnt2>min) list.add(ele2);
        return list;
    }
}