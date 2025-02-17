class Solution {
    public char[] swap(char[] a,int i,int n){
      char temp=a[i];
      a[i]=a[n];
      a[n]=temp;
      return a;
    }
    public void possible(Set<String> set,int ind , String value,char[] tiles){
      int n=tiles.length;
      if(ind==tiles.length){
        set.add(new String(value));
        return;
      }
      possible(set,ind+1,value,tiles);
      for(int i=ind;i<n;i++){
        tiles=swap(tiles,i,ind);
        possible(set,ind+1,value+tiles[ind],tiles);
        tiles=swap(tiles,i,ind);
      }
    }
    public int numTilePossibilities(String tiles) {
        char arr[]=tiles.toCharArray();
        Set<String> set=new HashSet<>();
        
        possible(set,0,"",arr);
      //  for(String i:set) System.out.println(i);
        return set.size()-1;
    }
}
