class Solution {
    public int factorial(int n){
      if(n==0 || n==1) return 1;
      return n*factorial(n-1);
    }
    public String getPermutation(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
          fact*=i;
          list.add(i);
        }
        list.add(n);
        k=k-1;
        String ans="";
        while(true){
          ans+=Integer.toString(list.get(k/fact));
          list.remove(k/fact);
          if(list.size()==0) break;
          k%=fact;
          fact/=list.size();
        }
        return ans;
    }
}
