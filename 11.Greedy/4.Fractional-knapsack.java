// User function Template for Java
class Solution {
    // Function to get the maximum total value in the knapsack.
    class Knap{
        int val;
        int wt;
        public Knap(int val,int wt){
            this.val=val;
            this.wt=wt;
        }
    }
    boolean comp(Knap a,Knap b){
        double r1=(double)a.val/a.wt;
        double r2=(double)b.val/b.wt;
        if(r1>r2) return false;
        return true;
    }
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        int n=val.size();
        double res=0;
        Knap arr[]=new Knap[n];
        for(int i=0;i<n;i++){
            arr[i]=new Knap(val.get(i),wt.get(i));
        }
        Arrays.sort(arr, (a, b) -> Double.compare((double) b.val / b.wt, (double) a.val / a.wt));
        
        for(int i=0;i<n;i++){
            if(arr[i].wt<=capacity){
                capacity-=arr[i].wt;
                res+=arr[i].val;
            }
            else{
                res+=((double)arr[i].val/arr[i].wt)*capacity;
                break;
            }
        }
        return res;
    }
}
