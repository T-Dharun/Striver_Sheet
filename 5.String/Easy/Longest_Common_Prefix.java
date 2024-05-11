class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        String a=strs[0];
        String b=strs[n-1];
        int i=0;
        while(i<a.length()){
            if(a.charAt(i)==b.charAt(i)) i++;
            else break;
        }
        return i==0?"":a.substring(0,i);
    }
}