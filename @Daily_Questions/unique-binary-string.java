class Solution {
    public String convert(int n,int len){
        StringBuilder num=new StringBuilder();
        while(n!=0){
            //System.out.println(n%2);
            num.append(n%2);
            n/=2;
        }
        for(int i=num.length();i<len;i++) num.append(0);
        return num.reverse().toString();
    }
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<String> list=new ArrayList<>();
        int n=nums.length;
        int size=(int)Math.pow(2,n);
        for(String i:nums) list.add(i);
        for(int i=0;i<size;i++){
            if(!list.contains(convert(i,n))) return convert(i,n);
        }
        return null;
    }
}
