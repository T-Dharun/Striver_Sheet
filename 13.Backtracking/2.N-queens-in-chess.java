class Solution {
    public boolean isok(char arr[][],int row,int col){
      int r=row,c=col;
      while(r>=0 && c>=0){
        if(arr[r][c]=='Q') return false;
        r--;
        c--;
      }
      r=row;c=col;
      while(r<arr.length && c>=0){
        if(arr[r][c]=='Q') return false;
        c--;
        r++;
      }
      r=row;c=col;
      while(c>=0){
        if(arr[r][c]=='Q') return false;
        c--;
      }
      return true;
    }
    public void solve(List<List<String>> list,char[][] arr,int col,int row){
      if(col==arr[0].length){
        List<String> ls=new ArrayList<>();
        for(int i=0;i<row;i++){
          String val="";
        for(int j=0;j<row;j++){
          val+=arr[i][j];
        }
        ls.add(val);
        }
        list.add(ls);
        return;
      }
      for(int i=0;i<row;i++){
        if(isok(arr,i,col)){
          arr[i][col]='Q';
          solve(list,arr,col+1,row);
          arr[i][col]='.';
        }
      }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list=new ArrayList<>();
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++) arr[i][j]='.';
        solve(list,arr,0,n);
        return list;
    }
}
