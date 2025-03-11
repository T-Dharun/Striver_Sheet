class Solution {
    public int numberOfSubstrings(String s) {
        int result=0;
        int n=s.length();
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                result+=(n-i);
                char ch1=s.charAt(j);
                if(map.get(ch1)==1) map.remove(ch1);
                else map.put(ch1,map.get(ch1)-1);
                j++;
            }
        }
        return result;
    }
}
