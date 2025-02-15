class Solution {
    public boolean partition(String ans,int sum,int value){
      if(ans.length()==0){
        if(value==sum) return true;
        return false;
      }
      for(int i=0;i<ans.length();i++){
        int pre=Integer.parseInt(ans.substring(0,i+1));
    //    System.out.println(value+" "+ans.substring(0,i+1)+" "+ans);
        if(partition(ans.substring(i+1,ans.length()),sum+pre,value)) return true;
      }
      return false;
    }
    public int punishmentNumber(int n) {
          int result=0;
          for(int i=1;i<=n;i++){
            if(partition(Integer.toString(i*i),0,i)) result+=(i*i);
          }
        return result;
    }
}
