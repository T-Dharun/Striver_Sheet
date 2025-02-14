class Solution {
    public boolean isValid(char[][] arr,int r,int c,int k){
      for(int i=0;i<9;i++){
        if(arr[r][i]==k) return false;
        if(arr[i][c]==k) return false;
        if(arr[3*(r/3)+(i/3)][3*(c/3)+(i%3)]==k) return false;
      }
      return true;
    }
    public boolean solve(char[][] board){
      int n=9;
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if(board[i][j]=='.'){
            for(char k='1';k<='9';k++){
              if(isValid(board,i,j,k)){
                board[i][j]=k;
                if(solve(board)) return true;
                else board[i][j]='.';
              }
            }
            return false;
          }
        }
      }
      return true;
    }
    public void solveSudoku(char[][] board) {
      solve(board)       ;
    }
}
