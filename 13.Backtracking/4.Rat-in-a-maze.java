
class Solution {
    // Function to find all possible paths
    public void solve(ArrayList<String> list,ArrayList<ArrayList<Integer>> mat,int n,int m,int i,int j,String str,boolean[][]v){
        if(i==n-1 && j==m-1){
            list.add(str);
            return;
        }
        if(i+1<n && !v[i+1][j] && mat.get(i+1).get(j)==1){
            v[i][j]=true;
            solve(list,mat,n,m,i+1,j,str+"D",v);
            v[i][j]=false;
        }
        if(j-1>=0 && !v[i][j-1] && mat.get(i).get(j-1)==1){
            v[i][j]=true;
            solve(list,mat,n,m,i,j-1,str+"L",v);
            v[i][j]=false;
        }
        if(j+1<m && !v[i][j+1] && mat.get(i).get(j+1)==1){https://media.geeksforgeeks.org/img-practice/chatIcon-1653561581.svg
            v[i][j]=true;
            solve(list,mat,n,m,i,j+1,str+"R",v);
            v[i][j]=false;
        }
        
        if(i-1>=0 && !v[i-1][j] && mat.get(i-1).get(j)==1){
            v[i][j]=true;
            solve(list,mat,n,m,i-1,j,str+"U",v);
            v[i][j]=false;
        }
        
    }
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> ls=new ArrayList<>();
        int n=mat.size();
        int m=mat.get(0).size();
        boolean[][]v=new boolean [n][m];
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++) v[i][j]=false;
        solve(ls,mat,n,m,0,0,"",v);
        return ls;
    }
}

