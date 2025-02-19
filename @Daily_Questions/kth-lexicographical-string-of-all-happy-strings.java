class Solution {
    String result="";
    int idx=1;
    public  boolean  generateall(String str,int n,String s,int k){
        if(str.length()==n){
            if(idx==k){
                result=str;
                return true;
            }
            System.out.println(str);
            idx++;
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(str.length()==0){
                if(generateall(str+s.charAt(i),n,s,k)) return true;
            }
            else if(s.charAt(i)!=str.charAt(str.length()-1)) if(generateall(str+s.charAt(i),n,s,k)) return true;
        }
        return false;
    }
    public String getHappyString(int n, int k) {
        String value="abc";
        generateall("",n,value,k);
        return result;
    }
}
