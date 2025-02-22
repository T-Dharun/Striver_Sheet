class Solution {
    public List<String> mergeString(List<String> list,String str){
        List<String> res=new ArrayList<>();
        int n=list.size();
        if(n==0){
            for(int i=0;i<str.length();i++){
                res.add(str.charAt(i)+"");
            }
            return res;
        }
        for(String j:list){
            for(int i=0;i<str.length();i++){
                res.add(j+str.charAt(i));
            }
        }
        return res;
    }
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        for(int i=0;i<digits.length();i++){
            list=mergeString(list,map.get(digits.charAt(i)));
        }
        return list;
    }
}
