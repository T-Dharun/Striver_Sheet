
class Solution {
    // You must implement this function
    static void sieve() {}

    static List<Integer> findPrimeFactors(int N) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2;i<=(int)Math.sqrt(N);i++){
            while(N%i==0){
                list.add(i);
                N/=i;
            }
        }
        if(N!=1) list.add(N);
        return list;
    }
}
