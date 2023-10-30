class Solution {
    public int reverse(int x) {
        long val=0;
        while(x!=0){
            int r=x%10;
            val=val*10 +r;
            x/=10;
        }
        long con=(long)(Math.pow(2,31)-1);
        System.out.println(con);
        if(val<con&&val > con*(-1)) return (int)val;
        return 0;
    }
}