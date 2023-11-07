public class Solution
{
    static int i=0;
    static void print(int a[],int i,int x){
        if(x==0)
            return;
        a[i]=x;
        print(a,++i,--x);
    }
    public static int[] printNos(int x) {
        int a[]=new int[x];
        print(a,i,x);
        return a;
    }
}