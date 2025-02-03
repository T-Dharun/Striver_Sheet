
class Solution {
    class Job{
    int id;
    int deadline;
    int profit;
    public Job(int id,int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
        }
    }
    public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
        
        ArrayList<Integer> temp=new ArrayList<>();
        int n=id.length;
        int cnt=0,sum=0;
        Job[] arr=new Job[n];
        for(int i=0;i<n;i++){
            arr[i]=new Job(id[i],deadline[i],profit[i]);
        }
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        int m=0;
        for(int i:deadline) m=Math.max(m,i);
        int hash[]=new int[m+1];
        for(int i=0;i<=m;i++) hash[i]=-1;
        for(int i=0;i<n;i++){
            Job tem=arr[i];
            for(int j=tem.deadline;j>0;j--){
                
                if(hash[j]==-1){
                    cnt++;
                    sum+=tem.profit;
                    hash[j]=1;
                    break;
                }
            }
        }
        temp.add(cnt);
        temp.add(sum);
        return temp;
    }
}
