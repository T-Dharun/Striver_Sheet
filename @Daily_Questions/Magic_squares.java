class Solution {
    boolean isMagic(int grid[][],int r,int c){
        int row[]=new int[3];
        int col[]=new int[3];
        int dg[]=new int[2];
        
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(list.contains(grid[i][j]) || grid[i][j]>9 || grid[i][j]==0) return false;
                list.add(grid[i][j]);
                int element=grid[i][j];
                row[i-r]+=element;
                col[j-c]+=element;
                int rind=i-r;
                int cind=j-c;
                if(rind==cind){
                    dg[0]+=element;
                }
                if((rind==0 && cind==2)||(rind==1 && cind==1)||(rind==2 && cind==0)) dg[1]+=element;
            }
        }
        int ans=row[0];
        for(int i:row) if(i!=ans) return false;
        for(int i:col) if(i!=ans) return false;
        for(int i:dg) if(i!=ans) return false;
        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int cnt=0;
        for(int i=0;i<=r-3;i++){
            for(int j=0;j<=c-3;j++){
                cnt+=isMagic(grid,i,j)?1:0;
            }
        }
        return cnt;
    }
}