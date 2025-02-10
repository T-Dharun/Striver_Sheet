class Solution {
    public boolean check(String s){
      int i=0,n=s.length()-1;
      while(i<n){
        if(s.charAt(i)!=s.charAt(n)) return false;
        i++;
        n--;
      }
      return true;
    }
    public void partitionCheck(List<List<String>> list,List<String> ls,String s,int ind){
      if(ind==s.length()){
        System.out.println(ls.toString());
        list.add(new ArrayList<>(ls));
        return;
      }
      for(int i=ind;i<s.length();i++){
        if(check(s.substring(ind,i+1))){
          ls.add(s.substring(ind,i+1));
          partitionCheck(list,ls,s,i+1);
          ls.remove(ls.size()-1);
        }
      }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        List<String> ls=new ArrayList<>();
        partitionCheck(list,ls,s,0);
        return list;
    }
}
