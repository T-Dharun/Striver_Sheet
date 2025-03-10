class Solution {
    public boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
        return false;
    }
    public long count(String word,int k){
        int n=word.length();
        int left=0;
        int consonant=0;
        long result=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            char ch=word.charAt(right);
            if(isvowel(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else consonant++;

            while(map.size()==5  && consonant>=k ){
                int len=n-right;
                result+=len;
                char ch1=word.charAt(left);
                if(isvowel(ch1)){
                    if(map.get(ch1)==1) map.remove(ch1);
                    else map.put(ch1,map.get(ch1)-1);
                }
                else consonant--;
                left++;
            }
            
        }
        return result;
    }
    public long countOfSubstrings(String word, int k) {
        long left= count(word,k);
        long right=count(word,k+1);
        System.out.println(left+" "+right);
        return left-right;
        //return 0;
    }
}
