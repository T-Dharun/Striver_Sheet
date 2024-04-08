class Solution {
    int calc(int r,int c){
        int res=1;
        for(int i=1;i<=c;i++){
            res*=r;
            res/=i;
            r--;
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<=i;j++){
                a.add(calc(i,j));
            }
            list.add(a);
        }
        return list;
    }
}