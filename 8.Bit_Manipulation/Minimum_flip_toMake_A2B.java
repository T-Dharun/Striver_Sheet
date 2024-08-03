class Solution {
    public int minBitFlips(int start, int goal) {
        int temp=start^goal;
        int cnt=0;
        while(temp!=0){
            if((temp&1)==1) cnt++;
            temp>>=1;
        }
        return cnt;
    }
}