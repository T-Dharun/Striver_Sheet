public class Solution {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        int min=prices[0];
        int max=0;
        for(int i:prices){
            if(min>i) min=i;
            max=Math.max(max,i-min);
        }
        return max;
    }
}
