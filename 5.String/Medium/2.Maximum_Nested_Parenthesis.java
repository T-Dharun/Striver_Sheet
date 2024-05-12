class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int max=-1;
        int cnt=0;
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            if(a=='('){
                cnt++;
                System.out.println(cnt);
            }
            else if(a==')') cnt--;
            max=Math.max(max,cnt);
        }
        return max;
    }
}