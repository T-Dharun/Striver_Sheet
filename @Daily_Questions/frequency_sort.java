
class Solution {
    public String frequencySort(String s) {
        int arr[]=new int[256];
        List<Character> ls=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        int k=0;
        int n=s.length();
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++){
            arr[s.charAt(i)]++;
            if(!ls.contains(s.charAt(i))) ls.add(s.charAt(i));
            
        }
        Collections.sort(ls,(a,b)->arr[b]-arr[a]);
        for(Character i:ls){
            for(int j=0;j<arr[i];j++) str.append(i);
        }
        return str.toString();
    }
}
