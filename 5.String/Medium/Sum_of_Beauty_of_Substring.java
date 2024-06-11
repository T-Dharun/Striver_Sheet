class Solution {
    int freq(String s){
        int a[]=new int[26];
        Arrays.fill(a,0);
        int max=0,min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
            a[s.charAt(i)-'a']++;
        for(int i:a){
            max=Math.max(max,i);
         //   System.out.println(a[i]);
            if(i!=0)
                min=Math.min(min,i);
        }
    //    System.out.print(" "+max+" "+min+" ");
        return max-min;
    }
    public int beautySum(String s) {
        int n=s.length();
        int cnt=0;
    //    System.out.println(freq("aa"));
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
         //       System.out.println(s.substring(i,j)+" "+freq(s.substring(i,j)));
                cnt+=freq(s.substring(i,j));
            }
        }
        return cnt;
    }
}