class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(hash.containsKey(s.charAt(i)))
                hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
            else hash.put(s.charAt(i),1);
        }
        PriorityQueue<Character> queue=new PriorityQueue<>((a,b)->(hash.get(b)-hash.get(a)));
        for(Map.Entry<Character,Integer> i:hash.entrySet()){
            queue.add(i.getKey());
        }
        String ans="";
        while(!queue.isEmpty()){
            char a=queue.poll();
            for(int i=0;i<hash.get(a);i++)
                ans+=a;
        }
        return ans;
    }
}