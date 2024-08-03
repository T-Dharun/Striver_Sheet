
class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    static int root(int n){
        int low=1,high=n;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int root=(int)Math.pow(2,mid);
            if(root<=n){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
    public static int countSetBits(int n){
        if(n<=1) return n;
        int x=root(n);
        return (x*(1<<(x-1)))+(n-(1<<x)+1)+countSetBits(n-(1<<x));
        
    }
}