class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        if(n!=goal.length()) return false;
        String ans=s+s;
        if(ans.contains(goal)) return true;
        return false;
    }
}