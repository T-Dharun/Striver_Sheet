class Solution {
    static int setBit(int n) {
        int m=n;
        int i=0;
        while(m!=0){
            if((m&1) == 0) break;
            i++;
            m>>=1;
        }
        return n|(1<<i);
    }
}