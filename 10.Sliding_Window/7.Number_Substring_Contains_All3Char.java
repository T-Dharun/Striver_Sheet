
class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int cnt=0;
        int arr[]=new int[3];
        for(int i=0;i<3;i++) arr[i]=-1;
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']=i;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1) cnt+=Math.min(arr[0],Math.min(arr[1],arr[2]))+1;

        }
        return cnt;
    }
}
