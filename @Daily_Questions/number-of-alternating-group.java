class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int result=0,alternate=1;
        int last=colors[0];
        for(int i=1;i<n+k-1;i++){
            int start=i%n;
            if(last==colors[start]){
                alternate=1;
                last=colors[start];
                continue;
            }
            alternate++;
            last=colors[start];
            if(alternate>=k) result++;
        }
        return result;
    }
}
