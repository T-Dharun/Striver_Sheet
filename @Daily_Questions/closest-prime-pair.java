class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean prime[]=new boolean[right+1];
        int arr[]=new int[2];
        Arrays.fill(prime,true);
        int n=(int)Math.sqrt(right);
        for(int i=2;i*i<=right;i++){
            for(int j=i*i;j<=right;j+=i){
                prime[j]=false;
            }
        }
        int first=0,second=0;
        int diff=Integer.MAX_VALUE;
        List<Integer> list=new ArrayList<>();
        for(int i=left>1?left:2;i<=right;i++){
            if(prime[i]){
                list.add(i);
            }
        }
        if(list.size()<=1) return new int[]{-1,-1};
        for(int i=0;i<list.size()-1;i++){
            int a=list.get(i);
            int b=list.get(i+1);
            if((b-a)<diff){
                first=a;
                second=b;
                diff=b-a;
            }
        }
        arr[0]=first;
        arr[1]=second;
        return arr;
    }
}
