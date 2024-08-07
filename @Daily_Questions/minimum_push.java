class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> hash=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char a=word.charAt(i);
            if(hash.containsKey(a)) hash.put(a,hash.get(a)+1);
            else hash.put(a,1);
        }
        ArrayList<Character> set=new ArrayList<>(hash.keySet());
        char arr[]=new char[set.size()];
        for(int i=0;i<set.size();i++)
            arr[i]=set.get(i);
        for(int i=0;i<set.size();i++){
            for(int j=i+1;j<set.size();j++){
                if(hash.get(arr[i]) < hash.get(arr[j])){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0,j=8;
        for(int i=0;i<set.size();i++){
            map.put(arr[i],j/8);
            j++;
        }
        for(int i=0;i<word.length();i++){
            ans+=map.get(word.charAt(i));
        }
        return ans;
    }
}