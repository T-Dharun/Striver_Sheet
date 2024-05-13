class Solution {
    public int myAtoi(String s) {
        
        s=s.trim();
        if(s.length()<1) return 0;
        boolean pos=false,neg=false;
        int i=0;
        System.out.println(s);
        if(s.charAt(0)=='+'){
            pos=true;
            i++;
        }
        if(s.charAt(0)=='-'){
            neg=true;
            i++;
        }
        int sign=1;
        double ans=0;
        if(neg) sign=-1;
        System.out.println(sign);
        while(i<s.length()&&(s.charAt(i)>='0'&& s.charAt(i)<='9')){
            char a=s.charAt(i);
            ans=ans*10+(a-'0');
            i++;
        }
        ans*=sign;
        if(ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)ans;
    }
}