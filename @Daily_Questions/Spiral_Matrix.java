class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int left=cStart,right=cStart+1,top=rStart,bottom=rStart+1;
        int a[][]=new int[rows*cols][2];
        int x=1,y=0;
        a[0][0]=rStart;
        a[0][1]=cStart;
        while((left>=0 || right < cols) || (top>=0 || bottom < rows)){
            System.out.println("left");
            for(int i=left+1;i<=right;i++){
                if(top<0 || i>=cols ||i<0) continue;
                a[x][0]=top;
                a[x++][1]=i;

            }
            left--;
            System.out.println("bottom");
            for(int i=top+1;i<=bottom;i++){
                if(right>=cols || i<0 ||i>=rows) continue;
                a[x][0]=i;
                a[x++][1]=right;
            }
            top--;
            System.out.println("right");
            for(int i=right-1;i>=left;i--){
                if(bottom>=rows || i>=cols ||i<0) continue;
                a[x][0]=bottom;
                a[x++][1]=i;
            }
            right++;
            System.out.println("top");

            for(int i=bottom-1;i>=top;i--){
                if(left<0 || i>=rows || i<0) continue;
                a[x][0]=i;
                a[x++][1]=left;
            }
            bottom++;
        }
        return a;
    }
}