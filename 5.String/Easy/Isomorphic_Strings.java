class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hash=new HashMap<>();
        Set<Character> list=new HashSet<>();
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            char b=t.charAt(i);

            if(hash.containsKey(a)){
                if(b!=hash.get(a)) return false;
            }
            else if(list.contains(b)) return false;
            list.add(b);
            hash.put(a,b);
            System.out.println(a+" "+b);
            System.out.println(hash.get(a));
        }
        return true;
    }
}