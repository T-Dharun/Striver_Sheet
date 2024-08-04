
class Solution
{
    public int[] AllPrimeFactors(int N)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2;i<=(int)Math.sqrt(N);i++){
            if(N%i==0){
                list.add(i);
                while(N%i==0){
                    N=N/i;
                }
            }
        }
        if(N!=1) list.add(N);
        Collections.sort(list);
        int a[]=new int[list.size()];
        int k=0;
        for(int i=0;i<list.size();i++)
            a[k++]=list.get(i);
        return a;
    }
}