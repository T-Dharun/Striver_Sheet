class Solution {
    public int countPrimes(int n) {
        boolean temp[]=new boolean[n];
        int cnt=0;
        for(int i=2;i<n;i++){
            temp[i]=true;
        }
        for(int i=2;i<n;i++){
            if(!temp[i]) continue;
            for(long j=(long)i*i;j<n;j+=i){
                temp[(int)j]=false;
            }
        }
        for(boolean i:temp){
            if(i) cnt++;
        }
        return cnt;
    }
}