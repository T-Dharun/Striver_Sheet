class Solution
{
    public int[] twoOddNum(int arr[], int n)
    {
        int xor=0;
        for(int i:arr)
            xor^=i;
        int num=(xor&(xor-1))^xor;
        int b1=0,b2=0;
        for(int i:arr){
            if((i&num)==0) b1^=i;
            else b2^=i;
        }
        int a[]=new int[2];
        int k=0,f1=0,f2=0;
        return (b1>b2)?new int[]{b1,b2}:new int[]{b2,b1};
    }
}