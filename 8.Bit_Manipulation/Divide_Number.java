class Solution {
    public int divide(int dividend, int divisor) {
        boolean sign=true;
        if(divisor==1) return dividend;
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0 )) sign=false;
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        int cnt=0;
        
        for(int i=30;i>=0;i--){
            long temp=b<<i;
            if(a>=temp){
                cnt+=(1<<i);
                a-=temp;
            }
        }
        if(cnt>Integer.MAX_VALUE && sign) return Integer.MAX_VALUE;
        if(cnt>Integer.MAX_VALUE && !sign) return Integer.MIN_VALUE;
        return sign?cnt:cnt*-1;
    }
}