class Solution{
    static List<Integer> get(int a,int b)
    {
        int c=a^b;
        b=c^b;
        a=c^a;
        //System.out.println(a);
        List<Integer> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }
}